package com.api.dataforge.util;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

@Component
public class BridgeApiUriBuilder {

    @Value("${bridge.access-token}")
    private String apiToken;

    @Value("${bridge.base-url}")
    private String baseUrl;



    public String build(String dataSet, String resource) {
        return UriComponentsBuilder.fromHttpUrl(baseUrl)
                .pathSegment(dataSet, resource)
                .queryParam("access_token", apiToken)
                .build()
                .toUriString();
    }

    public String buildWithId(String dataSet, String resource, String key) {
        return UriComponentsBuilder.fromHttpUrl(baseUrl)
                .pathSegment(dataSet, resource, key)
                .queryParam("access_token", apiToken)
                .build()
                .toUriString();
    }

    public String buildOData(String dataSet, String entityName) {
        return UriComponentsBuilder.fromHttpUrl(baseUrl)
                .path("/OData/" + dataSet + "/" + entityName )
                .queryParam("access_token", apiToken)
                .toUriString();
    }

    public String buildODataPath(String... pathSegments) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl + "/OData");
        for (String segment : pathSegments) {
            builder.pathSegment(segment);
        }
        builder.queryParam("access_token", apiToken);
        return builder.toUriString();
    }


    public String buildODataWithKey(String dataSet, String entityName, String key) {
        return UriComponentsBuilder.fromHttpUrl(baseUrl)
                .path("/OData/" + dataSet + "/" + entityName + "('" + key + "')")
                .queryParam("access_token", apiToken)
                .toUriString();
    }



    public String buildWithParams(String dataSet, String resource, Map<String, String> additionalParams) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .pathSegment(dataSet, resource)
                .queryParam("access_token", apiToken);

        additionalParams.forEach(builder::queryParam);

        return builder.build().toUriString();
    }





}
