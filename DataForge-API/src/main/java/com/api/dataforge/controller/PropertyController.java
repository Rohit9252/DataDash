package com.api.dataforge.controller;

import com.api.dataforge.dto.ErrorResponseDto;
import com.api.dataforge.service.PropertyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/property")
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
    public Mono<?> getListingHandler(@RequestParam String dataSet) {
        return propertyService.fetchProperty(dataSet);

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
    public Mono<?> getPropertyByIdHandler(@RequestParam(required = true) String dataSet, @PathVariable String ListingKey){
        return propertyService.fetchPropertyByKey(dataSet, ListingKey);
    }
}
