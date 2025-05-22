package com.api.dataforge.controller;

import com.api.dataforge.dto.ErrorResponseDto;
import com.api.dataforge.service.PropertyService;
import com.api.dataforge.service.impl.PropertyServiceImpl;
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
@RequestMapping("/api/v1/reso/property")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Tag(name = "Property", description = "Endpoints for managing property")
public class PropertyController {

    private final PropertyService propertyService;

    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @Operation(summary = "Get all Property", description = "Fetches all property for the given dataset")
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
    public ResponseEntity<Mono<?>> getListingHandler(

            @Parameter(description = "Property Dataset name", required = true, example = "test")
            @RequestParam String dataSet) {
        if (dataSet == null || dataSet.isEmpty()) {
            return ResponseEntity.badRequest().body(Mono.just("Dataset name is required"));
        }
        return ResponseEntity.ok(propertyService.fetchProperty(dataSet));

    }

    @Operation(summary = "Get Property by ID", description = "Fetches a single property by its ID for the given dataset")
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
    @GetMapping("/{ListingKey}")
    public ResponseEntity<Mono<?>> getPropertyByIdHandler(
            @Parameter(description = "Property Dataset name", required = true, example = "test")
            @RequestParam(required = true) String dataSet,
            @Parameter(description = "Property ID", required = true, example = "P_5dba1ff94aa4055b9f2a564c")
            @PathVariable String ListingKey){
       if (dataSet == null || dataSet.isEmpty()) {
            return ResponseEntity.badRequest().body(Mono.just("Dataset name is required"));
        }
        if (ListingKey == null || ListingKey.isEmpty()) {
            return ResponseEntity.badRequest().body(Mono.just("Property ID is required"));
        }
        return ResponseEntity.ok(propertyService.fetchPropertyByKey(dataSet, ListingKey));
    }
}
