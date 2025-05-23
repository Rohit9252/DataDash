package com.api.dataforge.components;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;

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


}
