package com.api.dataforge.controller;

import com.api.dataforge.service.RevieweeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/reviewees")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RevieweeController {

    private final RevieweeService revieweeService;

    public RevieweeController(RevieweeService revieweeService) {
        this.revieweeService = revieweeService;
    }

    @GetMapping
    public Mono<?> getRevieweesHandler(){
        return revieweeService.fetchReviewees();
    }
}
