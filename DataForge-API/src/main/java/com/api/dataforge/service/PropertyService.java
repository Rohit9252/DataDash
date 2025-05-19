package com.api.dataforge.service;

import com.api.dataforge.dto.PropertyResponseDTO;
import com.api.dataforge.response.PropertyResponse;
import com.api.dataforge.response.PropertySingleResponse;
import com.api.dataforge.util.BridgeApiUriBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class PropertyService {

    private final WebClient webClient;
    private final BridgeApiUriBuilder bridgeApiUriBuilder;


    public PropertyService(WebClient webClient, BridgeApiUriBuilder bridgeApiUriBuilder) {
        this.webClient = webClient;
        this.bridgeApiUriBuilder = bridgeApiUriBuilder;
    }


    public Mono<PropertyResponse> fetchProperty(String dataSet) {
        String uri = bridgeApiUriBuilder.buildOData(dataSet, "property");
        log.info("URL is " + uri);
        return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(PropertyResponse.class);
    }

    public Mono<PropertyResponseDTO> fetchPropertyByKey(String dataSet, String propertyKey) {
        String uri = bridgeApiUriBuilder.buildODataWithKey(dataSet, "property", propertyKey);
        log.info("URL is " + uri);
        return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(PropertyResponseDTO.class);
    }
}
