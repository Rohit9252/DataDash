package com.api.dataforge.service.impl;


import com.api.dataforge.caches.BridgeUriCacheService;
import com.api.dataforge.response.RevieweeResponse;
import com.api.dataforge.service.RevieweeService;
import com.api.dataforge.components.BridgeApiUriBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class RevieweeServiceImpl implements RevieweeService {

    private final WebClient webClient;
    private final BridgeUriCacheService bridgeUriCacheService;

    public RevieweeServiceImpl(WebClient webClient, BridgeUriCacheService bridgeUriCacheService) {
        this.webClient = webClient;
        this.bridgeUriCacheService = bridgeUriCacheService;
    }

    public Mono<RevieweeResponse> fetchReviewees() {
        String uri = bridgeUriCacheService.getODataPathUri("reviews", "Reviewees");

        log.info("URL is " + uri);

        return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(RevieweeResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching agents: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching all Reviewees"));
                });
    }
}
