package com.api.dataforge.controller;


import com.api.dataforge.model.ListingResponse;
import com.api.dataforge.model.TestResponse;
import com.api.dataforge.service.ListingService;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/listing")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ListingController {

    private final ListingService listingService;

    private final WebClient webClient;

    public ListingController(ListingService listingService, WebClient webClient) {
        this.listingService = listingService;
        this.webClient = webClient;
    }


    @GetMapping
    public Mono<?>  getListing() {
       return (Mono<?>) webClient.get()
                .uri("https://api.bridgedataoutput.com/api/v2/test/listings")
                .header(HttpHeaders.AUTHORIZATION , "Bearer 0ae2d6309e1b7947430d6147fd3d8a44")
                .retrieve();

    }
}
