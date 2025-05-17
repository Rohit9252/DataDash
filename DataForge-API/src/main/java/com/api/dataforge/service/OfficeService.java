package com.api.dataforge.service;

import com.api.dataforge.response.OfficeResponse;
import com.api.dataforge.response.OfficeSingleResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class OfficeService {

    private final WebClient webClient;

    public OfficeService(WebClient webClient) {
        this.webClient = webClient;
    }


    public Mono<OfficeResponse> fetchOffices(String dataSet) {
        return webClient.get()
                .uri("https://api.bridgedataoutput.com/api/v2/"+dataSet+"/office?access_token=0ae2d6309e1b7947430d6147fd3d8a44")
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(OfficeResponse.class);
    }

    public Mono<OfficeSingleResponse> fetchOfficeByKey(String dataSet, String officeKey) {
        String url = "https://api.bridgedataoutput.com/api/v2/test/Office?access_token=0ae2d6309e1b7947430d6147fd3d8a44";
        return webClient.get()
                .uri("https://api.bridgedataoutput.com/api/v2/"+dataSet+"/office/"+officeKey+"?access_token=0ae2d6309e1b7947430d6147fd3d8a44")
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(OfficeSingleResponse.class);
    }
}
