package com.api.dataforge.controller;


import com.api.dataforge.dto.ErrorResponseDto;
import com.api.dataforge.service.PublicService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/api/v1/public")
@Tag(name = "Public", description = "Endpoints for public Data API's")
public class PublicController {


    private final PublicService publicService;


    public PublicController(PublicService publicService) {
        this.publicService = publicService;
    }


    @Operation(summary = "Retrieves all parcels", description = "Retrieves all parcels")
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
    @GetMapping("/parcels")
    public Mono<?> getPubParcels() {
        return publicService.getPubParcels();
    }


    @Operation(summary = "Retrieves parcel by ID", description = "Retrieves parcel by ID")
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
    @GetMapping("/parcels/{id}")
    public Mono<?> getParcelById(@PathVariable String id) {
        log.info("Fetching parcel by id: {}", id);
        return publicService.getParcelById(id);
    }

    @Operation(summary = "Retrieves parcel by ID assessments", description = "Retrieves a list of assessments for a given parcel.")
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
    @GetMapping("/parcels/{id}/assessments")
    public Mono<?> getParcelByIdAssessments(@PathVariable String id) {
        log.info("Fetching parcel by id: {}", id);
        return publicService.getParcelByIdAssessments(id);
    }


    @Operation(summary = "Retrieves parcel by ID transactions", description = "Retrieves a list of transactions for a given parcel.")
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
    @GetMapping("/parcels/{id}/transactions")
    public Mono<?> getParcelByIdTransactions(@PathVariable String id) {
        log.info("Fetching parcel by id: {}", id);
        return publicService.getParcelByIdTransactions(id);
    }


    @Operation(summary = "Retrieves a list of assessments.", description = "Retrieves a list of assessments.")
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
    @GetMapping("/pub/assessments")
    public Mono<?> getPubAssessments() {
        return publicService.getPubAssessments();
    }


    @Operation(summary = "Retrieves a list of transactions.", description = "Retrieves a list of transactions.")
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
    @GetMapping("/pub/transactions")
    public Mono<?> getPubTransactions() {
        return publicService.getPubTransactions();
    }


}
