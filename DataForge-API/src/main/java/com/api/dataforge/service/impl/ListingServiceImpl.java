package com.api.dataforge.service.impl;

import com.api.dataforge.caches.BridgeUriCacheService;
import com.api.dataforge.response.ListingResponse;
import com.api.dataforge.response.ListingSingleResponse;
import com.api.dataforge.service.ListingService;
import com.api.dataforge.components.BridgeApiUriBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Slf4j
@Service
public class ListingServiceImpl implements ListingService {

    private final WebClient webClient;

    private final BridgeUriCacheService bridgeUriCacheService;

    public ListingServiceImpl(WebClient webClient, BridgeUriCacheService bridgeUriCacheService) {
        this.webClient = webClient;
        this.bridgeUriCacheService = bridgeUriCacheService;
    }

    public Mono<ListingResponse> fetchListings(String dataSet) {

        String uri = bridgeUriCacheService.getUri(dataSet, "listings");

        log.info("Fetching listings");

        return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(ListingResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching Listing: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching Listings"));
                });
    }

    public Mono<ListingSingleResponse> fetchListingById(String dataSet, String ListingKey) {
        String uri = bridgeUriCacheService.getUriWithId(dataSet, "listings", ListingKey);
        log.info("Fetching listing by ID: {}", ListingKey);
        return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(ListingSingleResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching Listing : {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching Listing by Listing Key " + ListingKey));
                });
    }
}
