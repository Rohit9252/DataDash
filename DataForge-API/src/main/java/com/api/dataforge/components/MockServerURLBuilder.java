package com.api.dataforge.components;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class MockServerURLBuilder {


    @Value("${postman.mock.url}")
    private  String baseUrl;

    @Value("${bridge.access-token}")
    private  String apiToken;




    public String buildUri(String dataSet, String resource) {
        return UriComponentsBuilder.fromHttpUrl(baseUrl)
                .pathSegment(dataSet, resource)
                .queryParam("access_token", apiToken)
                .build()
                .toUriString();
    }


    public  String buildUri(String dataSet, String... resources) {
        UriComponentsBuilder builder = UriComponentsBuilder
                .fromHttpUrl(baseUrl)
                .pathSegment(dataSet);

        for (String res : resources) {
            builder.pathSegment(res);
        }

        builder.queryParam("access_token", apiToken);
        return builder.toUriString();
    }


}
