package com.api.dataforge.controller;


import com.api.dataforge.dto.ErrorResponseDto;
import com.api.dataforge.service.AgentService;
import com.api.dataforge.service.OpenHouseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/openhouse")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Tag(name = "Open Houses", description = "Endpoints for managing open houses")
public class OpenHouseController {

    private final OpenHouseService openHouseService;

    public OpenHouseController(OpenHouseService openHouseService) {
        this.openHouseService = openHouseService;
    }


    @Operation(summary = "Get all Open Houses", description = "Fetches all open houses for the given dataset")
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
    public Mono<?> getOpenHousesHandler(@RequestParam(required = true) String dataSet){
        return openHouseService.fetchOpenHouses(dataSet);
    }

    @Operation(summary = "Get Open House by ID", description = "Fetches a single open house by its ID for the given dataset")
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
    @GetMapping("/{openHouseKey}")
    public Mono<?> getOpenHouseByIdHandler(@RequestParam(required = true) String dataSet, @PathVariable String openHouseKey){
        return openHouseService.fetchOpenHouseByKey(dataSet, openHouseKey);
    }
}
