package com.api.dataforge.service.impl;

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
    private final MockServerURLBuilder mockServerURLBuilder;


    public PublicServiceImpl(WebClient webClient, MockServerURLBuilder mockServerURLBuilder) {
        this.webClient = webClient;
        this.mockServerURLBuilder = mockServerURLBuilder;
    }

    public Mono<?> getPubParcels() {
        String url = mockServerURLBuilder.buildUri("pub", "parcels");
        log.info("URL is {}", url);
        Mono<ApiResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class);


        return responseMono;
    }

    public Mono<?> getParcelById(String id) {

        String url  = mockServerURLBuilder.buildUri("pub", "parcels", id);

        log.info("URL is {}", url);
        Mono<ParcelByIdResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ParcelByIdResponse.class);


        return responseMono;
    }


    public Mono<?> getParcelByIdAssessments(String id) {

        String url = mockServerURLBuilder.buildUri("pub", "parcels", id, "assessments");
        log.info("URL is {}", url);
        Mono<ApiResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class);


        return responseMono;
    }


    public Mono<?> getParcelByIdTransactions(String id) {


            String url = mockServerURLBuilder.buildUri("pub", "parcels", id, "transactions");
            log.info("URL is {}", url);
            Mono<ApiResponse> responseMono = webClient
                    .get()
                    .uri(url)
                    .retrieve()
                    .bodyToMono(ApiResponse.class);


            return responseMono;
        }


    public Mono<?> getPubAssessments() {
       String url  = mockServerURLBuilder.buildUri("pub", "assessments");
        log.info("URL is {}", url);
        Mono<ApiResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class);


        return responseMono;
    }

    public Mono<?> getPubTransactions() {
       String url = mockServerURLBuilder.buildUri("pub", "transactions");
        log.info("URL is {}", url);
        Mono<ApiResponse> responseMono = webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(ApiResponse.class);


        return responseMono;
    }
}
