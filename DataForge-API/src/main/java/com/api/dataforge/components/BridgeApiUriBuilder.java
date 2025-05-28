package com.api.dataforge.components;


import com.api.dataforge.configuration.ListingCriteriaConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@Slf4j
public class BridgeApiUriBuilder {


    private final BridgeProperties bridgeProperties;
    private final String decryptedToken;

    public BridgeApiUriBuilder(BridgeProperties bridgeProperties) {
        this.bridgeProperties = bridgeProperties;
        try {
            this.decryptedToken = TokenEncryptor.decrypt(bridgeProperties.getEncryptedToken());
        } catch (Exception e) {
            log.error("Failed to decrypt API token", e);
            throw new RuntimeException("Failed to decrypt API token", e);
        }
    }

    private String baseUrl() {
        return bridgeProperties.getBaseUrl();
    }


    public String build(String dataSet, String resource) {
        return UriComponentsBuilder.fromUri(URI.create(baseUrl()))
                .pathSegment(dataSet, resource)
                .queryParam("access_token", decryptedToken)
                .build()
                .toUriString();
    }

    public String buildWithId(String dataSet, String resource, String key) {
        return UriComponentsBuilder.fromUri(URI.create(baseUrl()))
                .pathSegment(dataSet, resource, key)
                .queryParam("access_token", decryptedToken)
                .build()
                .toUriString();
    }

    public String buildOData(String dataSet, String entityName) {
        return UriComponentsBuilder.fromUri(URI.create(baseUrl()))
                .path("/OData/" + dataSet + "/" + entityName)
                .queryParam("access_token", decryptedToken)
                .toUriString();
    }

    public String buildODataPath(String... pathSegments) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUri(URI.create(baseUrl() + "/OData"));
        for (String segment : pathSegments) {
            builder.pathSegment(segment);
        }
        builder.queryParam("access_token", decryptedToken);
        return builder.toUriString();
    }


    public String buildODataWithKey(String dataSet, String entityName, String key) {
        return UriComponentsBuilder.fromUri(URI.create(baseUrl()))
                .path("/OData/" + dataSet + "/" + entityName + "('" + key + "')")
                .queryParam("access_token", decryptedToken)
                .toUriString();
    }


    public String buildWithParams(String dataSet, String resource, Map<String, String> additionalParams) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUri(URI.create(baseUrl()))
                .pathSegment(dataSet, resource)
                .queryParam("access_token", decryptedToken);

        additionalParams.forEach(builder::queryParam);

        return builder.build().toUriString();
    }

    public String buildFilterUrl(ListingCriteriaConfig config) {
        UriComponentsBuilder builder =  UriComponentsBuilder.fromUri(URI.create(baseUrl()))
                .pathSegment("OData","test", "Properties")
                .queryParam("access_token", decryptedToken);

        StringBuilder filter = new StringBuilder();

        // Extract criteria from the config
        List<String> propertySubTypes = config.getPropertySubTypes();
        // PropertySubType filter (OR)
        if (propertySubTypes != null && !propertySubTypes.isEmpty()) {
            String subTypeFilter = propertySubTypes.stream()
                    .map(subType -> "(PropertySubType eq '" + subType + "')")
                    .collect(Collectors.joining(" or "));
            filter.append("(").append(subTypeFilter).append(")");
        }

        List<String> cities = config.getCity();
        // City filter (OR)
        if (cities != null && !cities.isEmpty()) {
            String cityFilter = cities.stream()
                    .map(city -> "(City eq '" + city + "')")
                    .collect(Collectors.joining(" or "));
            if (filter.length() > 0) filter.append(" or ");  // Combine with OR
            filter.append("(").append(cityFilter).append(")");
        }

        // Add the filter to the URL
        if (filter.length() > 0) {
            builder.queryParam("$filter", filter.toString());
        }

        String url = builder.build().toUriString();
        log.info("Generated Property/City Filter URL: {}", url);
        return url;
    }




}
