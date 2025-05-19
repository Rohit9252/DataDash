package com.api.dataforge.controller;

import com.api.dataforge.dto.ErrorResponseDto;
import com.api.dataforge.service.AgentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/agents")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Tag(name = "Agents", description = "Endpoints for managing agents")
public class AgentController {

    private final AgentService agentService;

    public AgentController(AgentService agentService) {
        this.agentService = agentService;
    }

    @Operation(summary = "Get all agents", description = "Fetches all agents for the given dataset")
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "HTTP Status OK"
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "HTTP Status Internal Server Error",
                    content = @Content(
                            schema = @Schema(implementation = ErrorResponseDto.class)
                    )
            )
    }
    )
    @GetMapping
    public Mono<?> getAgentsHandler(@RequestParam(required = true) String dataSet){
        return agentService.fetchAgents(dataSet);
    }
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "HTTP Status OK"
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "HTTP Status Internal Server Error",
                    content = @Content(
                            schema = @Schema(implementation = ErrorResponseDto.class)
                    )
            )
    }
    )
    @Operation(summary = "Get agent by ID", description = "Fetches a single agent by its ID for the given dataset")
    @GetMapping("/{memberKey}")
    public Mono<?> getAgentByIdHandler(@RequestParam(required = true) String dataSet, @PathVariable String memberKey){
        return agentService.fetchAgentById(dataSet,memberKey);
    }
}
