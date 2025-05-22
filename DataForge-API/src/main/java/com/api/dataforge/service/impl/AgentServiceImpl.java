package com.api.dataforge.service.impl;

import com.api.dataforge.caches.BridgeUriCacheService;
import com.api.dataforge.response.AgentResponse;
import com.api.dataforge.response.AgentSingleResponse;
import com.api.dataforge.service.AgentService;
import com.api.dataforge.components.BridgeApiUriBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Service
public class AgentServiceImpl implements AgentService {

    private final WebClient webClient;
    private final BridgeUriCacheService bridgeUriCacheService;


    private final Map<String, String> uriCache = new ConcurrentHashMap<>();




    public AgentServiceImpl(WebClient webClient, BridgeUriCacheService bridgeUriCacheService) {
        this.webClient = webClient;
        this.bridgeUriCacheService = bridgeUriCacheService;
    }

    public Mono<AgentResponse> fetchAgents(String dataSet) {

            String uri = bridgeUriCacheService.getUri(dataSet, "agents");

            log.info("URL is " + uri);

                return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(AgentResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching agents: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching agents"));
                });


    }

    public Mono<AgentSingleResponse> fetchAgentById(String dataSet, String key) {

        String uri = bridgeUriCacheService.getUriWithId(dataSet,"agents",  key);

        log.info("URL is " + uri);
        return webClient.get()
                .uri(uri)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(AgentSingleResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching agent by ID: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error fetching agent by Key"+ key));
                });


    }

}
