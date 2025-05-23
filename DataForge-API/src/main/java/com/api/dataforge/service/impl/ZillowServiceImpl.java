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
        log.info("Fetching Zillow Econ Market Report");
        return webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .onErrorResume(e -> {
                    log.error("Error Fetching Zillow ECON Market Report: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error Fetching Zillow ECON Market Report"));
                });
    }


    public Mono<ApiResponse> fetchMarketReportReplication() {
        String url = bridgeUriCacheService.getMockUri("zgecon", "marketreport/replication");
        log.info("Fetching Zillow Econ Market Report Replication");
        return webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .onErrorResume(e -> {
                    log.error("Error Fetching Zillow Econ Market Report Replication: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error Fetching Zillow Econ Market Report Replication"));
                });
    }

    public Mono<?> fetchRegion() {

        String url = bridgeUriCacheService.getMockUri("zgecon", "region");
        log.info(("Fetching Zillow Econ Region"));
        return webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .onErrorResume(e -> {
                    log.error("Error Fetching Zillow Econ Region: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error Fetching Zillow Econ Region"));
                });

    }

    public Mono<?> fetchCut() {
        String url = bridgeUriCacheService.getMockUri("zgecon", "cut");
        log.info("Fetching Zillow Econ Cut data ");
        return webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .onErrorResume(e -> {
                    log.error("Error Fetching Zillow Econ Cut data: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error Fetching Zillow Econ Cut data"));
                });

    }

    public Mono<?> fetchType() {
        String url = bridgeUriCacheService.getMockUri("zgecon", "type");
        log.info("Fetching Zillow Econ Type data");
        return webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .onErrorResume(e -> {
                    log.error("Error Fetching Zillow Econ Type data: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error Fetching Zillow Econ Type data"));
                });
    }
}
