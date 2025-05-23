package com.api.dataforge.service.impl;


import com.api.dataforge.caches.BridgeUriCacheService;
import com.api.dataforge.response.ApiResponse;
import com.api.dataforge.service.ZillowService;
import com.api.dataforge.components.MockServerURLBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class ZillowServiceImpl implements ZillowService {

    private final WebClient webClient;

    private final BridgeUriCacheService bridgeUriCacheService;


    public ZillowServiceImpl(WebClient webClient, BridgeUriCacheService bridgeUriCacheService) {
        this.webClient = webClient;
        this.bridgeUriCacheService = bridgeUriCacheService;
    }

    public Mono<ApiResponse> fetchMarketReport() {
        String url = bridgeUriCacheService.getMockUri("zgecon", "marketreport");

        log.info("URL is {}", url);
        Mono<ApiResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching agents: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching Market Report"));
                });


        return responseMono;
    }


    public Mono<ApiResponse> fetchMarketReportReplication() {
        String url = bridgeUriCacheService.getMockUri("zgecon", "marketreport/replication");

        log.info("URL is {}", url);
        Mono<ApiResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching agents: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching market report replication"));
                });


        return responseMono;
    }

    public Mono<?> fetchRegion() {

        String url = bridgeUriCacheService.getMockUri("zgecon", "region");

        log.info("URL is {}", url);
        Mono<ApiResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching agents: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching Region"));
                });


        return responseMono;

    }

    public Mono<?> fetchCut() {
        String url = bridgeUriCacheService.getMockUri("zgecon", "cut");

        log.info("URL is {}", url);
        Mono<ApiResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching agents: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching Cuts"));
                });


        return responseMono;

    }

    public Mono<?> fetchType() {
        String url = bridgeUriCacheService.getMockUri("zgecon", "type");

        log.info("URL is {}", url);
        Mono<ApiResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching agents: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching Types"));
                });


        return responseMono;
    }
}
