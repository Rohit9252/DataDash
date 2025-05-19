package com.api.dataforge.service;

import com.api.dataforge.response.ListingResponse;
import com.api.dataforge.response.ListingSingleResponse;
import com.api.dataforge.util.BridgeApiUriBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Slf4j
@Service
public class ListingService {

    private final WebClient webClient;

    private final BridgeApiUriBuilder bridgeApiUriBuilder;

    public ListingService(WebClient webClient, BridgeApiUriBuilder bridgeApiUriBuilder) {
        this.webClient = webClient;
        this.bridgeApiUriBuilder = bridgeApiUriBuilder;
    }

    public Mono<ListingResponse> fetchListings(String dataSet) {


        String uri = bridgeApiUriBuilder.build(dataSet, "listings");
        log.info("URL is " + uri);
        return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(ListingResponse.class);
    }

    public Mono<ListingSingleResponse> fetchListingById(String dataSet, String id) {
        String uri = bridgeApiUriBuilder.buildWithId(dataSet, "listings", id);
        log.info("URL is " + uri);
        return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(ListingSingleResponse.class);
    }
}
