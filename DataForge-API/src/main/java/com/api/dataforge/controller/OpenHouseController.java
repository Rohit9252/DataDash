package com.api.dataforge.controller;


import com.api.dataforge.dto.ErrorResponseDto;
import com.api.dataforge.service.OpenHouseService;
import com.api.dataforge.service.impl.OpenHouseServiceImpl;
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
@RequestMapping("/api/v1/bridgedata/openhouse")
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
    public ResponseEntity<Mono<?>> getOpenHousesHandler(
            @Parameter(
                    description = "Name of the dataset the Open House belongs to",
                    required = true,
                    example = "test"
            )
            @RequestParam(required = true) String dataSet){
        if (dataSet == null || dataSet.isEmpty()) {
            return ResponseEntity.badRequest().body(Mono.error(new IllegalArgumentException("DataSet cannot be null or empty")));
        }
        return ResponseEntity.ok(openHouseService.fetchOpenHouses(dataSet));
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
    public ResponseEntity<Mono<?>> getOpenHouseByIdHandler(
            @Parameter(
                    description = "Name of the dataset the Open House belongs to",
                    required = true,
                    example = "test"
            )
            @RequestParam(required = true) String dataSet,
            @Parameter(
                    description = "ID of the open house to fetch",
                    required = true,
                    example = "OH_5dba21c5f47f6c5e35f13545"
            )
            @PathVariable String openHouseKey){

        if (dataSet == null || dataSet.isEmpty()) {
            return ResponseEntity.badRequest().body(Mono.error(new IllegalArgumentException("DataSet cannot be null or empty")));
        }
        if (openHouseKey == null || openHouseKey.isEmpty()) {
            return ResponseEntity.badRequest().body(Mono.error(new IllegalArgumentException("Open House Key cannot be null or empty")));
        }
        return ResponseEntity.ok(openHouseService.fetchOpenHouseByKey(dataSet, openHouseKey));

    }
}
