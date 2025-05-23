package com.api.dataforge.controller;

import com.api.dataforge.dto.ErrorResponseDto;
import com.api.dataforge.service.OfficeService;
import com.api.dataforge.service.impl.OfficeServiceImpl;
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
@RequestMapping("/api/v1/bridgedata/office")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Tag(name = "Offices", description = "Endpoints for managing offices")
public class OfficeController {

    private final OfficeService officeService;

    public OfficeController(OfficeService officeService) {
        this.officeService = officeService;
    }

    @Operation(summary = "Get all Office", description = "Fetches all office for the given dataset")
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
    public ResponseEntity<Mono<?>> getOfficesHandler(
            @Parameter(
                    description = "Name of the dataset the Office belongs to",
                    required = true,
                    example = "test"
            )
            @RequestParam(required = true) String dataSet) {
        if (dataSet == null || dataSet.isEmpty()) {
            return ResponseEntity.badRequest().body(Mono.just("Dataset parameter is required"));
        }

        return ResponseEntity.ok(officeService.fetchOffices(dataSet));


    }

    @Operation(summary = "Get Office by ID", description = "Fetches a single office by its ID for the given dataset")
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
    @GetMapping("/{officeKey}")
    public ResponseEntity<Mono<?>> getOfficeByIdHandler(
            @Parameter(
                    description = "Name of the dataset the Office belongs to",
                    required = true,
                    example = "test"
            )
            @RequestParam(required = true) String dataSet,
            @Parameter(
                    description = "ID of the office to fetch",
                    required = true,
                    example = "O_5dba1f95cf17cd5b43eb02cd"
            )
            @PathVariable String officeKey) {
        if (dataSet == null || dataSet.isEmpty()) {
            return ResponseEntity.badRequest().body(Mono.just("Dataset parameter is required"));
        }
        if (officeKey == null || officeKey.isEmpty()) {
            return ResponseEntity.badRequest().body(Mono.just("OfficeKey parameter is required"));
        }
        return ResponseEntity.ok(officeService.fetchOfficeByKey(dataSet, officeKey));
    }
}
