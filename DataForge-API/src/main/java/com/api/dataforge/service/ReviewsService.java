package com.api.dataforge.service;

import com.api.dataforge.response.ReviewsResponse;
import com.api.dataforge.util.BridgeApiUriBuilder;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class ReviewsService {

    private final WebClient webClient;
    private final BridgeApiUriBuilder bridgeApiUriBuilder;

    public ReviewsService(WebClient webClient, BridgeApiUriBuilder bridgeApiUriBuilder) {
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
                .bodyToMono(ReviewsResponse.class);
    }
}
