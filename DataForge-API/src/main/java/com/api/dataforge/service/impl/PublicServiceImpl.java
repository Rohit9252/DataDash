package com.api.dataforge.service.impl;

import com.api.dataforge.caches.BridgeUriCacheService;
import com.api.dataforge.response.ApiResponse;
import com.api.dataforge.response.ParcelByIdResponse;
import com.api.dataforge.service.PublicService;
import com.api.dataforge.components.MockServerURLBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class PublicServiceImpl implements PublicService {


    private final WebClient webClient;

    private final BridgeUriCacheService bridgeUriCacheService;


    public PublicServiceImpl(WebClient webClient, BridgeUriCacheService bridgeUriCacheService) {
        this.webClient = webClient;
        this.bridgeUriCacheService = bridgeUriCacheService;
    }

    public Mono<?> getPubParcels() {
        String url = bridgeUriCacheService.getMockUri("pub", "parcels");
        log.info("Fetching Public Parcel data");
        return webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching Parcels: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching Parcels"));
                });
    }

    public Mono<?> getParcelById(String id) {
        String url = bridgeUriCacheService.getMockUri("pub", "parcels", id);
        log.info("Fetching Data from Parcel by ID: {}", id);
        return webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ParcelByIdResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching Parcel by id: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching Parcel by id " + id));
                });
    }


    public Mono<?> getParcelByIdAssessments(String id) {
        String url = bridgeUriCacheService.getMockUri("pub", "parcels", id, "assessments");
        log.info("Fetching Parcel data Assessments by ID: {}", id);
        return webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching Assessments by parcel id: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching Assessments by parcel id " + id));
                });
    }


    public Mono<?> getParcelByIdTransactions(String id) {
        String url = bridgeUriCacheService.getMockUri("pub", "parcels", id, "transactions");
        log.info("Fetching Parcel data Transactions by ID: {}", id);
        return webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching Transactions by parcel id: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching Transactions by parcel id " + id));
                });
    }


    public Mono<?> getPubAssessments() {
        String url = bridgeUriCacheService.getMockUri("pub", "assessments");
        log.info("Fetching Public Assessment data");
        return webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching all Assessments: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching all Assessments"));
                });
    }

    public Mono<?> getPubTransactions() {
        String url = bridgeUriCacheService.getMockUri("pub", "transactions");
        log.info("Fetching Public Transaction data");
        return webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching all Transactions: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching all Transactions"));
                });
    }
}
