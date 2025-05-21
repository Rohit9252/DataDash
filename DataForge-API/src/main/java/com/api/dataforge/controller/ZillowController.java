package com.api.dataforge.controller;


import com.api.dataforge.dto.ErrorResponseDto;
import com.api.dataforge.service.ZillowService;
import com.api.dataforge.service.impl.ZillowServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/api/v1/zillow")
@Tag(name = "Zillow", description = "Endpoints for Zillow API's")
public class ZillowController {


    private final ZillowService zillowService;


    public ZillowController(ZillowServiceImpl zillowService) {
        this.zillowService = zillowService;
    }


    @Operation(summary = "Retrieves Zillow Group Economic Research data.", description = "Retrieves Zillow Group Economic Research data.")
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
    @GetMapping("/marketreport")
    public ResponseEntity<Mono<?>> getMarketReport() {
        log.info("Fetching market report");
         return ResponseEntity.ok(zillowService.fetchMarketReport());
    }



    @Operation(summary = "Retrieves Market Report Replications", description = "Retrieves Zillow Group Economic Research data.")
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
    @GetMapping("/marketreport/replication")
    public ResponseEntity<Mono<?>> getMarketReportReplication() {
        log.info("Fetching market report replication");
        return ResponseEntity.ok(zillowService.fetchMarketReportReplication());
    }

    @Operation(summary = "Retrieves Zillow Group Economic Research region data.", description = "Retrieves Zillow Group Economic Research region data.")
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
    @GetMapping("/region")
    public ResponseEntity<Mono<?>> getRegion() {
        log.info("Fetching region");
        return ResponseEntity.ok(zillowService.fetchRegion());
    }


    @Operation(summary = "Retrieves Zillow Group Economic Research cut / data-partitioning and analysis data.", description = "Retrieves Zillow Group Economic Research cut / data-partitioning and analysis data.")
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
    @GetMapping("/cut")
    public ResponseEntity<Mono<?>> getCut() {
        log.info("Fetching cut");
        return ResponseEntity.ok(zillowService.fetchCut());
    }

    @Operation(summary = "Retrieves information about the types and their IDs found in the Zillow Group Economic Research data.", description = "Retrieves information about the types and their IDs found in the Zillow Group Economic Research data.")
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
    @GetMapping("/type")
    public ResponseEntity<Mono<?>> getType() {
        log.info("Fetching type");
        return ResponseEntity.ok(zillowService.fetchType());
    }


}
