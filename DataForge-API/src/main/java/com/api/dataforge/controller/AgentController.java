package com.api.dataforge.controller;

import com.api.dataforge.dto.ErrorResponseDto;
import com.api.dataforge.service.AgentService;
import com.api.dataforge.service.impl.AgentServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Mono<?>> getAgentsHandler(
            @Parameter(
                    description = "Name of the dataset the agent belongs to",
                    required = true,
                    example = "test"
            )
            @RequestParam(required = true) String dataSet){
        if (dataSet == null || dataSet.isEmpty()) {
            return ResponseEntity.badRequest().body(Mono.error(new IllegalArgumentException("DataSet cannot be null or empty")));
        }
        return ResponseEntity.ok(agentService.fetchAgents(dataSet));

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
    public ResponseEntity<Mono<?>> getAgentByIdHandler(
            @Parameter(
                    description = "Name of the dataset the agent belongs to",
                    required = true,
                    example = "test"
            )
            @RequestParam(required = true) String dataSet,
            @Parameter(
                    description = "Unique member key (ID) of the agent",
                    required = true,
                    example = "M_5dba1fa5a2a50c5b81f087c5"
            )
            @PathVariable String memberKey){
        if (dataSet == null || dataSet.isEmpty()) {
            return ResponseEntity.badRequest().body(Mono.error(new IllegalArgumentException("DataSet cannot be null or empty")));
        }
        return ResponseEntity.ok(agentService.fetchAgentById(dataSet, memberKey));
    }
}
