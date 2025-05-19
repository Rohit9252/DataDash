package com.api.dataforge.controller;


import com.api.dataforge.service.ListingService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/listings")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Tag(name = "Listings", description = "Endpoints for managing listings")
public class ListingController {

    private final ListingService listingService;

    public ListingController(ListingService listingService) {
        this.listingService = listingService;

    }

    @Operation(summary = "Get all listings", description = "Fetches all listings for the given dataset")
    @GetMapping
    public Mono<?>  getListingHandler(@RequestParam(required = true) String dataSet) {
        return listingService.fetchListings(dataSet);

    }
    @Operation(summary = "Get listing by ID", description = "Fetches a single listing by its ID for the given dataset")
    @GetMapping("/{listingKey}")
    public Mono<?>  getListingByIdHandler(@PathVariable String listingKey,@RequestParam(required = true) String dataSet) {
        return listingService.fetchListingById(dataSet, listingKey);

    }

}
