package com.api.dataforge.service;

import com.api.dataforge.dto.PropertyResponseDTO;
import com.api.dataforge.response.PropertyResponse;
import com.api.dataforge.response.PropertySingleResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class PropertyService {

    private final WebClient webClient;

    public PropertyService(WebClient webClient) {
        this.webClient = webClient;
    }


    public Mono<PropertyResponse> fetchProperty(String dataSet) {
        return webClient.get()
                .uri("https://api.bridgedataoutput.com/api/v2/OData/"+dataSet+"/Property?access_token=0ae2d6309e1b7947430d6147fd3d8a44")
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(PropertyResponse.class);
    }

    public Mono<PropertyResponseDTO> fetchPropertyByKey(String dataSet, String propertyKey) {
        String url = "https://api.bridgedataoutput.com/api/v2/OData/"+dataSet+"/Property('"+propertyKey+"')?access_token=0ae2d6309e1b7947430d6147fd3d8a44";
        return webClient.get()
                .uri(url)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(PropertyResponseDTO.class);
    }
}
