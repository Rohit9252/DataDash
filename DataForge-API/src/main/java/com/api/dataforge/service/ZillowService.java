package com.api.dataforge.service;


import com.api.dataforge.response.ApiResponse;
import com.api.dataforge.response.MarketReportResponse;
import com.api.dataforge.response.ReviewsResponse;
import com.api.dataforge.util.BridgeApiUriBuilder;
import com.api.dataforge.util.MockServerURLBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class ZillowService {

    private final WebClient webClient;
    protected final MockServerURLBuilder mockServerURLBuilder;


    public ZillowService(WebClient webClient, MockServerURLBuilder mockServerURLBuilder) {
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
