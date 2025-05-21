package com.api.dataforge.service;

import com.api.dataforge.response.ListingResponse;
import com.api.dataforge.response.ListingSingleResponse;
import reactor.core.publisher.Mono;

public interface ListingService {

    public Mono<ListingResponse> fetchListings(String dataSet);
    public Mono<ListingSingleResponse> fetchListingById(String dataSet, String id);

}
