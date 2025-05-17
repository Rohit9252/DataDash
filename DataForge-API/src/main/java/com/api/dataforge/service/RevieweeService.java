package com.api.dataforge.service;



import com.api.dataforge.response.RevieweeResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class RevieweeService {

    private final WebClient webClient;

    public RevieweeService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<RevieweeResponse> fetchReviewees() {
        return webClient.get()
                .uri("https://api.bridgedataoutput.com/api/v2/OData/reviews/Reviewees?access_token=0ae2d6309e1b7947430d6147fd3d8a44")
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(RevieweeResponse.class);
    }
}
