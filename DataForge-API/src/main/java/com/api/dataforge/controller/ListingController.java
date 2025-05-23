package com.api.dataforge.controller;


import com.api.dataforge.dto.ErrorResponseDto;
import com.api.dataforge.service.ListingService;
import com.api.dataforge.service.impl.ListingServiceImpl;
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
@RequestMapping("/api/v1/bridgedata/listings")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Tag(name = "Listings", description = "Endpoints for managing listings")
public class ListingController {

    private final ListingService listingService;

    public ListingController(ListingService listingService) {
        this.listingService = listingService;
    }

    @Operation(summary = "Get all listings", description = "Fetches all listings for the given dataset")
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
            @Parameter(
                    description = "Name of the dataset the Listing belongs to",
                    required = true,
                    example = "test"
            )
            @RequestParam(required = true) String dataSet) {

        if (dataSet == null || dataSet.isEmpty()) {
            return ResponseEntity.badRequest().body(Mono.error(new IllegalArgumentException("DataSet cannot be null or empty")));
        }
        return ResponseEntity.ok(listingService.fetchListings(dataSet));

    }

    @Operation(summary = "Get listing by ID", description = "Fetches a single listing by its ID for the given dataset")
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
    @GetMapping("/{listingKey}")
    public Mono<?> getListingByIdHandler(
            @Parameter(
                    description = "ID of the listing to fetch",
                    required = true,
                    example = "P_5dba1ff94aa4055b9f2a564c"
            )

            @PathVariable String listingKey,

            @Parameter(
                    description = "Name of the dataset the Listing belongs to",
                    required = true,
                    example = "test"
            )
            @RequestParam(required = true) String dataSet) {
        return listingService.fetchListingById(dataSet, listingKey);

    }

}
