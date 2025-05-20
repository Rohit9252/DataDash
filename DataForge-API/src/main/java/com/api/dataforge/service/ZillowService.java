package com.api.dataforge.service;


import com.api.dataforge.response.ApiResponse;
import com.api.dataforge.response.MarketReportResponse;
import com.api.dataforge.response.ReviewsResponse;
import com.api.dataforge.util.BridgeApiUriBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class ZillowService {

    private final WebClient webClient;
    private final BridgeApiUriBuilder bridgeApiUriBuilder;


    public ZillowService(WebClient webClient, BridgeApiUriBuilder bridgeApiUriBuilder) {
        this.webClient = webClient;
        this.bridgeApiUriBuilder = bridgeApiUriBuilder;
    }


    public Mono<ApiResponse> fetchMarketReport() {
        String url = "https://3eee4e18-37f2-4f16-8ab1-f72cad864cf1.mock.pstmn.io/api/v2/zgecon/marketreport?access_token=0ae2d6309e1b7947430d6147fd3d8a44";
        log.info("URL is {}", url);
        Mono<ApiResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class);

        // Blocking just for simplicity; consider using async (reactive) in production
        return responseMono;
    }

}
