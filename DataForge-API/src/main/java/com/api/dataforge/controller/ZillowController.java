package com.api.dataforge.controller;


import com.api.dataforge.service.ZillowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/api/v1/zillow")
public class ZillowController {


    private final ZillowService zillowService;


    public ZillowController(ZillowService zillowService) {
        this.zillowService = zillowService;
    }

    @GetMapping("/marketreport")
    public Mono<?> getMarketReport() {
        log.info("Fetching market report");
        return zillowService.fetchMarketReport();
    }

}
