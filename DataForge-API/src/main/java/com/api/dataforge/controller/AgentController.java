package com.api.dataforge.controller;

import com.api.dataforge.service.AgentService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/agents")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AgentController {

    private final AgentService agentService;

    public AgentController(AgentService agentService) {
        this.agentService = agentService;
    }

    @GetMapping
    public Mono<?> getAgentsHandler(@RequestParam(required = true) String dataSet){
        return agentService.fetchAgents(dataSet);
    }

    @GetMapping("/{memberKey}")
    public Mono<?> getAgentByIdHandler(@RequestParam(required = true) String dataSet, @PathVariable String memberKey){
        return agentService.fetchAgentById(dataSet,memberKey);
    }
}
