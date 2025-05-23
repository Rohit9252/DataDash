package com.api.dataforge.service.impl;

import com.api.dataforge.caches.BridgeUriCacheService;
import com.api.dataforge.response.OpenHouseResponse;
import com.api.dataforge.response.OpenHouseSingleResponse;
import com.api.dataforge.service.OpenHouseService;
import com.api.dataforge.components.BridgeApiUriBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class OpenHouseServiceImpl implements OpenHouseService {

    private final WebClient webClient;
    private final BridgeUriCacheService bridgeUriCacheService;

    public OpenHouseServiceImpl(WebClient webClient, BridgeUriCacheService bridgeUriCacheService) {
        this.webClient = webClient;
        this.bridgeUriCacheService = bridgeUriCacheService;
    }

    public Mono<OpenHouseResponse> fetchOpenHouses(String dataSet) {
        String uri = bridgeUriCacheService.getUri(dataSet, "openhouses");
        log.info("Fetching open houses");
        return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(OpenHouseResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching OpenHouses: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching OpenHouses"));
                });
    }

    public Mono<OpenHouseSingleResponse> fetchOpenHouseByKey(String dataSet, String key) {
        String uri = bridgeUriCacheService.getUriWithId(dataSet, "openhouses", key);
        log.info("Fetching open house by ID: {}", key);
        return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(OpenHouseSingleResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching OpenHouse by Open House Key: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching OpenHouse by OHKey " + key));
                });
    }
}
