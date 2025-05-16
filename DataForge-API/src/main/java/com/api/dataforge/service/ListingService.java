package com.api.dataforge.service;

import com.api.dataforge.model.ListFinalResponse;
import com.api.dataforge.model.ListingSingleResponse;
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



    public Mono<ListFinalResponse> fetchListings(String dataSet) {
        return webClient.get()
                .uri("https://api.bridgedataoutput.com/api/v2/"+dataSet+"/listings?access_token=0ae2d6309e1b7947430d6147fd3d8a44")
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(ListFinalResponse.class);
//                .flatMapMany(response -> Flux.fromIterable(response.articles));
    }

    public Mono<ListingSingleResponse> fetchListingById(String dataSet, String id) {
        return webClient.get()
                .uri("https://api.bridgedataoutput.com/api/v2"+dataSet+"/listings/"+id+"?access_token=0ae2d6309e1b7947430d6147fd3d8a44")
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(ListingSingleResponse.class);
//                .flatMapMany(response -> Flux.fromIterable(response.articles));
    }
}
