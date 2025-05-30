package com.api.dataforge.controller;

import com.api.dataforge.dto.ErrorResponseDto;
import com.api.dataforge.service.RevieweeService;
import com.api.dataforge.service.impl.RevieweeServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/zillow/reviewees")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Tag(name = "Reviewees", description = "Endpoints for managing reviewees")
public class RevieweeController {

    private final RevieweeService revieweeService;

    public RevieweeController(RevieweeService revieweeService) {
        this.revieweeService = revieweeService;
    }

    @Operation(summary = "Get all reviewers", description = "Fetches all reviewers for the given dataset")
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
    public ResponseEntity<Mono<?>> getRevieweesHandler() {
        return ResponseEntity.ok(revieweeService.fetchReviewees());
    }
}
