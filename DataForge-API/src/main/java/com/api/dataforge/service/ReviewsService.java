package com.api.dataforge.service;

import com.api.dataforge.response.ReviewsResponse;
import reactor.core.publisher.Mono;

public interface ReviewsService {
    public Mono<ReviewsResponse> fetchReviews();
}
