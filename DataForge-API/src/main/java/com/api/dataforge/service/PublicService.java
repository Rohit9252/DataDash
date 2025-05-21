package com.api.dataforge.service;

import com.api.dataforge.response.ApiResponse;
import com.api.dataforge.response.ParcelByIdResponse;
import com.api.dataforge.response.ParcelResponse;
import com.api.dataforge.util.MockServerURLBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class PublicService {



    private final WebClient webClient;
    private final MockServerURLBuilder mockServerURLBuilder;


    public PublicService(WebClient webClient, MockServerURLBuilder mockServerURLBuilder) {
        this.webClient = webClient;
        this.mockServerURLBuilder = mockServerURLBuilder;
    }

    public Mono<?> getPubParcels() {
//        String url = "https://3eee4e18-37f2-4f16-8ab1-f72cad864cf1.mock.pstmn.io/api/v2/pub/parcels?access_token=0ae2d6309e1b7947430d6147fd3d8a44";
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

//        String url = "https://3eee4e18-37f2-4f16-8ab1-f72cad864cf1.mock.pstmn.io/api/v2/pub/parcels/1951257?access_token=0ae2d6309e1b7947430d6147fd3d8a44";
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
