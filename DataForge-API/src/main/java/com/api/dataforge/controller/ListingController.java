package com.api.dataforge.controller;


import com.api.dataforge.service.ListingService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/listings")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ListingController {

    private final ListingService listingService;

    public ListingController(ListingService listingService) {
        this.listingService = listingService;

    }


    @GetMapping
    public Mono<?>  getListingHandler(@RequestParam(required = true) String dataSet) {
        return listingService.fetchListings(dataSet);

    }

    @GetMapping("/{listingKey}")
    public Mono<?>  getListingByIdHandler(@PathVariable String listingKey,@RequestParam(required = true) String dataSet) {
        return listingService.fetchListingById(dataSet, listingKey);

    }

}
