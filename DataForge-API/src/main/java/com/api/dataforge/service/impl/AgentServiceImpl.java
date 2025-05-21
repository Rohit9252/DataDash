package com.api.dataforge.service.impl;

import com.api.dataforge.response.AgentResponse;
import com.api.dataforge.response.AgentSingleResponse;
import com.api.dataforge.service.AgentService;
import com.api.dataforge.util.BridgeApiUriBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class AgentServiceImpl implements AgentService {

    private final WebClient webClient;
    private final BridgeApiUriBuilder bridgeApiUriBuilder;




    public AgentServiceImpl(WebClient webClient, BridgeApiUriBuilder bridgeApiUriBuilder) {
        this.webClient = webClient;
        this.bridgeApiUriBuilder = bridgeApiUriBuilder;
    }

    public Mono<AgentResponse> fetchAgents(String dataSet) {

            String uri = bridgeApiUriBuilder.build(dataSet, "agents");

            log.info("URL is " + uri);

                return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(AgentResponse.class);


    }

    public Mono<AgentSingleResponse> fetchAgentById(String dataSet, String key) {

        String uri = bridgeApiUriBuilder.buildWithId(dataSet, "agents", key);

        log.info("URL is " + uri);
        return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(AgentSingleResponse.class);


    }

}
