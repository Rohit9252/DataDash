package com.api.dataforge.service;

import com.api.dataforge.response.ReviewsResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ReviewsService {

    private final WebClient webClient;

    public ReviewsService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<ReviewsResponse> fetchReviews() {
        return webClient.get()
                .uri("https://api.bridgedataoutput.com/api/v2/OData/reviews/Reviews?access_token=0ae2d6309e1b7947430d6147fd3d8a44")
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(ReviewsResponse.class);
    }
}
