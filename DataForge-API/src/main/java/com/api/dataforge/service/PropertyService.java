package com.api.dataforge.service;

import com.api.dataforge.dto.PropertyResponseDTO;
import com.api.dataforge.response.PropertyResponse;
import reactor.core.publisher.Mono;

public interface PropertyService {

    public Mono<PropertyResponse> fetchProperty(String dataSet);
    public Mono<PropertyResponseDTO> fetchPropertyByKey(String dataSet, String propertyKey);
}
