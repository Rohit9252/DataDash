package com.api.dataforge.service;

import com.api.dataforge.response.AgentResponse;
import com.api.dataforge.response.AgentSingleResponse;
import com.api.dataforge.response.OpenHouseResponse;
import com.api.dataforge.response.OpenHouseSingleResponse;
import com.api.dataforge.util.BridgeApiUriBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class OpenHouseService {

    private final WebClient webClient;
    private final BridgeApiUriBuilder bridgeApiUriBuilder;

    public OpenHouseService(WebClient webClient, BridgeApiUriBuilder bridgeApiUriBuilder) {
        this.webClient = webClient;
        this.bridgeApiUriBuilder = bridgeApiUriBuilder;
    }

    public Mono<OpenHouseResponse> fetchOpenHouses(String dataSet) {
        String uri = bridgeApiUriBuilder.build(dataSet, "openhouses");
        log.info("URL is " + uri);
        return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(OpenHouseResponse.class);
    }

    public Mono<OpenHouseSingleResponse> fetchOpenHouseByKey(String dataSet, String key) {
        String uri = bridgeApiUriBuilder.buildWithId(dataSet, "openhouses", key);
        log.info("URL is " + uri);
        return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(OpenHouseSingleResponse.class);
    }
}
