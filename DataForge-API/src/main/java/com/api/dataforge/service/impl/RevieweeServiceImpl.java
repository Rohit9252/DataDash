package com.api.dataforge.service.impl;



import com.api.dataforge.response.RevieweeResponse;
import com.api.dataforge.service.RevieweeService;
import com.api.dataforge.util.BridgeApiUriBuilder;
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
    private final BridgeApiUriBuilder bridgeApiUriBuilder;

    public RevieweeServiceImpl(WebClient webClient, BridgeApiUriBuilder bridgeApiUriBuilder) {
        this.webClient = webClient;
        this.bridgeApiUriBuilder = bridgeApiUriBuilder;
    }

    public Mono<RevieweeResponse> fetchReviewees() {

        String uri = bridgeApiUriBuilder.buildODataPath("reviews", "Reviewees");
        log.info("URL is " + uri);

        return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(RevieweeResponse.class);
    }
}
