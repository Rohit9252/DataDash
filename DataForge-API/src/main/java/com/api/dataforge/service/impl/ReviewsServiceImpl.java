package com.api.dataforge.service.impl;

import com.api.dataforge.response.ReviewsResponse;
import com.api.dataforge.service.ReviewsService;
import com.api.dataforge.util.BridgeApiUriBuilder;
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
    private final BridgeApiUriBuilder bridgeApiUriBuilder;

    public ReviewsServiceImpl(WebClient webClient, BridgeApiUriBuilder bridgeApiUriBuilder) {
        this.webClient = webClient;
        this.bridgeApiUriBuilder = bridgeApiUriBuilder;
    }

    public Mono<ReviewsResponse> fetchReviews() {
        String uri = bridgeApiUriBuilder.buildODataPath("reviews", "Reviews");
        log.info("URL is {}", uri);
        return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(ReviewsResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching agents: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching agents"));
                });
    }
}
