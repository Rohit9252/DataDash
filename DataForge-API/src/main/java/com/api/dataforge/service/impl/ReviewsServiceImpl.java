package com.api.dataforge.service.impl;

import com.api.dataforge.caches.BridgeUriCacheService;
import com.api.dataforge.response.ReviewsResponse;
import com.api.dataforge.service.ReviewsService;
import com.api.dataforge.components.BridgeApiUriBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class ReviewsServiceImpl implements ReviewsService {

    private final WebClient webClient;
    private final BridgeUriCacheService bridgeUriCacheService;

    public ReviewsServiceImpl(WebClient webClient, BridgeUriCacheService bridgeUriCacheService) {
        this.webClient = webClient;
        this.bridgeUriCacheService = bridgeUriCacheService;
    }

    public Mono<ReviewsResponse> fetchReviews() {
        String uri = bridgeUriCacheService.getODataPathUri("reviews", "Reviews");
        log.info("Fetching Reviews");
        return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(ReviewsResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching Reviews: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching Reviews"));
                });
    }
}
