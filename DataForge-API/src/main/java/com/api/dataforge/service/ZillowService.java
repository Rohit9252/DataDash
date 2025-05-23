package com.api.dataforge.service;

import com.api.dataforge.response.ApiResponse;
import reactor.core.publisher.Mono;

public interface ZillowService {

    public Mono<ApiResponse> fetchMarketReport();

    public Mono<ApiResponse> fetchMarketReportReplication();

    public Mono<?> fetchRegion();

    public Mono<?> fetchCut();

    public Mono<?> fetchType();
}
