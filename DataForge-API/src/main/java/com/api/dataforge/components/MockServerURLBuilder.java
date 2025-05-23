package com.api.dataforge.components;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
@Slf4j
public class MockServerURLBuilder {


    private final String decryptedToken;

    private final BridgeProperties bridgeProperties;

    public MockServerURLBuilder(BridgeProperties bridgeProperties) {
        this.bridgeProperties = bridgeProperties;
        try {
            this.decryptedToken = TokenEncryptor.decrypt(bridgeProperties.getEncryptedToken());
        } catch (Exception e) {
            log.error("Failed to decrypt API token", e);
            throw new RuntimeException("Failed to decrypt API token", e);
        }

    }


    private String baseUrl() {
        return bridgeProperties.getMockUrl();
    }

    public String buildUri(String dataSet, String resource) {
        return UriComponentsBuilder.fromUri(URI.create(baseUrl()))
                .pathSegment(dataSet, resource)
                .queryParam("access_token", decryptedToken)
                .build()
                .toUriString();
    }


    public String buildUri(String dataSet, String... resources) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUri(URI.create(baseUrl()))
                .pathSegment(dataSet);

        for (String res : resources) {
            builder.pathSegment(res);
        }

        builder.queryParam("access_token", decryptedToken);
        return builder.toUriString();
    }


}
