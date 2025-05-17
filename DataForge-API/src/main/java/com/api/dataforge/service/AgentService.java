package com.api.dataforge.service;

import com.api.dataforge.response.AgentResponse;
import com.api.dataforge.response.AgentSingleResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class AgentService {

    private final WebClient webClient;

    public AgentService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<AgentResponse> fetchAgents(String dataSet) {
        return webClient.get()
                .uri("https://api.bridgedataoutput.com/api/v2/"+dataSet+"/agents?access_token=0ae2d6309e1b7947430d6147fd3d8a44")
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(AgentResponse.class);
    }

    public Mono<AgentSingleResponse> fetchAgentById(String dataSet, String key) {
        String url = "https://api.bridgedataoutput.com/api/v2/test/agents?access_token=0ae2d6309e1b7947430d6147fd3d8a44";
        return webClient.get()
                .uri("https://api.bridgedataoutput.com/api/v2/"+dataSet+"/agents/"+key+"?access_token=0ae2d6309e1b7947430d6147fd3d8a44")
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(AgentSingleResponse.class);
    }

}
