package com.api.dataforge.service;

import com.api.dataforge.response.OfficeResponse;
import com.api.dataforge.response.OfficeSingleResponse;
import reactor.core.publisher.Mono;

public interface OfficeService {

    public Mono<OfficeResponse> fetchOffices(String dataSet);
    public Mono<OfficeSingleResponse> fetchOfficeByKey(String dataSet, String officeKey);

}
