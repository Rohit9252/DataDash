package com.api.dataforge.service.impl;

import com.api.dataforge.caches.BridgeUriCacheService;
import com.api.dataforge.response.ApiResponse;
import com.api.dataforge.response.ParcelByIdResponse;
import com.api.dataforge.service.PublicService;
import com.api.dataforge.components.MockServerURLBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class PublicServiceImpl implements PublicService {



    private final WebClient webClient;

    private final BridgeUriCacheService bridgeUriCacheService;




    public PublicServiceImpl(WebClient webClient, BridgeUriCacheService bridgeUriCacheService) {
        this.webClient = webClient;
        this.bridgeUriCacheService = bridgeUriCacheService;
    }

    public Mono<?> getPubParcels() {
        String url = bridgeUriCacheService.getMockUri("pub", "parcels");

        log.info("URL is {}", url);
        Mono<ApiResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class);


        return responseMono;
    }

    public Mono<?> getParcelById(String id) {

        String url = bridgeUriCacheService.getMockUri("pub", "parcels", id);


        log.info("URL is {}", url);
        Mono<ParcelByIdResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ParcelByIdResponse.class);


        return responseMono;
    }


    public Mono<?> getParcelByIdAssessments(String id) {


        String url = bridgeUriCacheService.getMockUri("pub", "parcels", id, "assessments");
        log.info("URL is {}", url);
        Mono<ApiResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class);


        return responseMono;
    }


    public Mono<?> getParcelByIdTransactions(String id) {



            String url = bridgeUriCacheService.getMockUri("pub", "parcels", id, "transactions");
            log.info("URL is {}", url);
            Mono<ApiResponse> responseMono = webClient
                    .get()
                    .uri(url)
                    .retrieve()
                    .bodyToMono(ApiResponse.class);


            return responseMono;
        }


    public Mono<?> getPubAssessments() {
        String url = bridgeUriCacheService.getMockUri("pub", "assessments");

        log.info("URL is {}", url);
        Mono<ApiResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class);


        return responseMono;
    }

    public Mono<?> getPubTransactions() {
        String url = bridgeUriCacheService.getMockUri("pub", "transactions");

        log.info("URL is {}", url);
        Mono<ApiResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class);


        return responseMono;
    }
}
