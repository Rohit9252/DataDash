package com.api.dataforge.controller;

import com.api.dataforge.dto.ErrorResponseDto;
import com.api.dataforge.service.OfficeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/office")
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
    public Mono<?> getOfficesHandler(@RequestParam(required = true) String dataSet){
        return officeService.fetchOffices(dataSet);
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
    public Mono<?> getOfficeByIdHandler(@RequestParam(required = true) String dataSet, @PathVariable String officeKey){
        return officeService.fetchOfficeByKey(dataSet, officeKey);
    }
}
