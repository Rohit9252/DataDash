package com.api.dataforge.service;

import com.api.dataforge.response.OpenHouseResponse;
import com.api.dataforge.response.OpenHouseSingleResponse;
import reactor.core.publisher.Mono;

public interface OpenHouseService {

    public Mono<OpenHouseResponse> fetchOpenHouses(String dataSet);
    public Mono<OpenHouseSingleResponse> fetchOpenHouseByKey(String dataSet, String key);

}
