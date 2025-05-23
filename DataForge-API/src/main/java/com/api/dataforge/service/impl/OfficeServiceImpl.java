package com.api.dataforge.service.impl;

import com.api.dataforge.caches.BridgeUriCacheService;
import com.api.dataforge.response.OfficeResponse;
import com.api.dataforge.response.OfficeSingleResponse;
import com.api.dataforge.service.OfficeService;
import com.api.dataforge.components.BridgeApiUriBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class OfficeServiceImpl implements OfficeService {

    private final WebClient webClient;
    private final BridgeUriCacheService bridgeUriCacheService;

    public OfficeServiceImpl(WebClient webClient, BridgeUriCacheService bridgeUriCacheService) {
        this.webClient = webClient;
        this.bridgeUriCacheService = bridgeUriCacheService;
    }

    public Mono<OfficeResponse> fetchOffices(String dataSet) {

        String uri = bridgeUriCacheService.getUri(dataSet, "office");
        log.info("Fetching offices");
        return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(OfficeResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching Offices: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching offices"));
                });
    }

    public Mono<OfficeSingleResponse> fetchOfficeByKey(String dataSet, String officeKey) {
        String uri = bridgeUriCacheService.getUriWithId(dataSet, "office", officeKey);
        log.info("Fetching office by ID: {}", officeKey);
        return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(OfficeSingleResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching office by ID: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching Office by OfficeKey " + officeKey));
                });
    }
}
