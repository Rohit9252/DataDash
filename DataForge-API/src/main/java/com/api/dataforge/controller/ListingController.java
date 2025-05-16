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

    public ListingController(ListingService listingService) {
        this.listingService = listingService;

    }


    @GetMapping
    public Mono<?>  getListing() {
        return listingService.fetchListing();

    }
}
