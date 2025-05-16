package com.api.dataforge.service;

import com.api.dataforge.model.ListFinalResponse;
import com.api.dataforge.model.PropertyFinalResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class PropertyService {

    private final WebClient webClient;

    public PropertyService(WebClient webClient) {
        this.webClient = webClient;
    }


    public Mono<PropertyFinalResponse> fetchProperty() {
        return webClient.get()
                .uri("https://api.bridgedataoutput.com/api/v2/OData/test/Property?access_token=0ae2d6309e1b7947430d6147fd3d8a44")
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(PropertyFinalResponse.class);
//                .flatMapMany(response -> Flux.fromIterable(response.articles));
    }
}
