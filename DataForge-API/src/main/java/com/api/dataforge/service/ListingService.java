package com.api.dataforge.service;

import com.api.dataforge.model.ListingResponse;
import com.api.dataforge.model.NewsResponse;
import com.api.dataforge.model.TestResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
public class ListingService {

    private final WebClient webClient;

    public ListingService(WebClient webClient) {
        this.webClient = webClient;
        
    }



    public Mono<TestResponse> fetchListing() {
        return webClient.get()
                .uri("https://api.bridgedataoutput.com/api/v2/test/listings?access_token=0ae2d6309e1b7947430d6147fd3d8a44")
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(TestResponse.class);
//                .flatMapMany(response -> Flux.fromIterable(response.articles));
    }
}
