package com.api.dataforge.service;

import com.api.dataforge.response.RevieweeResponse;
import reactor.core.publisher.Mono;

public interface RevieweeService {
    public Mono<RevieweeResponse> fetchReviewees();
}
