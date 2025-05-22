package com.api.dataforge.service.impl;


import com.api.dataforge.response.ApiResponse;
import com.api.dataforge.service.ZillowService;
import com.api.dataforge.components.MockServerURLBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class ZillowServiceImpl implements ZillowService {

    private final WebClient webClient;
    protected final MockServerURLBuilder mockServerURLBuilder;


    public ZillowServiceImpl(WebClient webClient, MockServerURLBuilder mockServerURLBuilder) {
        this.webClient = webClient;
        this.mockServerURLBuilder = mockServerURLBuilder;
    }

    public Mono<ApiResponse> fetchMarketReport() {
        String url = mockServerURLBuilder.buildUri("zgecon", "marketreport");
        log.info("URL is {}", url);
        Mono<ApiResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class);


        return responseMono;
    }


    public Mono<ApiResponse> fetchMarketReportReplication() {

        String url = mockServerURLBuilder.buildUri("zgecon", "marketreport/replication");
        log.info("URL is {}", url);
        Mono<ApiResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class);


        return responseMono;
    }

    public Mono<?> fetchRegion() {


        String url = mockServerURLBuilder.buildUri("zgecon", "region");
        log.info("URL is {}", url);
        Mono<ApiResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class);


        return responseMono;

    }

    public Mono<?> fetchCut() {

        String url = mockServerURLBuilder.buildUri("zgecon", "cut");
        log.info("URL is {}", url);
        Mono<ApiResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class);


        return responseMono;

    }

    public Mono<?> fetchType() {
        String url = mockServerURLBuilder.buildUri("zgecon", "type");
        log.info("URL is {}", url);
        Mono<ApiResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class);


        return responseMono;
    }
}
