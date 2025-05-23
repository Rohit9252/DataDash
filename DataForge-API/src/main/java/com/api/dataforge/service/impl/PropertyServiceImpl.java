package com.api.dataforge.service.impl;

import com.api.dataforge.caches.BridgeUriCacheService;
import com.api.dataforge.dto.PropertyResponseDTO;
import com.api.dataforge.response.PropertyResponse;
import com.api.dataforge.service.PropertyService;
import com.api.dataforge.components.BridgeApiUriBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class PropertyServiceImpl implements PropertyService {

    private final WebClient webClient;
    private final BridgeUriCacheService bridgeUriCacheService;

    public PropertyServiceImpl(WebClient webClient, BridgeUriCacheService bridgeUriCacheService) {
        this.webClient = webClient;
        this.bridgeUriCacheService = bridgeUriCacheService;
    }

    public Mono<PropertyResponse> fetchProperty(String dataSet) {
        String uri = bridgeUriCacheService.getODataUri(dataSet, "property");
        log.info("Fetching properties");
        return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(PropertyResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching Properties: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching Properties"));
                });
    }

    public Mono<PropertyResponseDTO> fetchPropertyByKey(String dataSet, String propertyKey) {
        String uri = bridgeUriCacheService.getODataUriWithKey(dataSet, "property", propertyKey);
        log.info("Fetching property by ID: {}", propertyKey);
        return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(PropertyResponseDTO.class)
                .onErrorResume(e -> {
                    log.error("Error fetching Property by propertyKey: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching Property by propertyKey " + propertyKey));
                });
    }
}
