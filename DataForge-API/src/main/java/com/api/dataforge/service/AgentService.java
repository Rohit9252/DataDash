package com.api.dataforge.service;

import com.api.dataforge.response.AgentResponse;
import com.api.dataforge.response.AgentSingleResponse;
import reactor.core.publisher.Mono;

public interface AgentService {


    public Mono<AgentResponse> fetchAgents(String dataSet);
    public Mono<AgentSingleResponse> fetchAgentById(String dataSet, String key);

}
