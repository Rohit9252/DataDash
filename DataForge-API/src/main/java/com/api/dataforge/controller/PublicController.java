package com.api.dataforge.controller;


import com.api.dataforge.service.PublicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/api/v1/public")
public class PublicController {


    private final PublicService publicService;


    public PublicController(PublicService publicService) {
        this.publicService = publicService;
    }


    @GetMapping("/parcels")
    public Mono<?> getPubParcels() {
        return publicService.getPubParcels();
    }


    @GetMapping("/parcels/{id}")
    public Mono<?> getParcelById(@PathVariable String id) {
        log.info("Fetching parcel by id: {}", id);
        return publicService.getParcelById(id);
    }


    @GetMapping("/parcels/{id}/assessments")
    public Mono<?> getParcelByIdAssessments(@PathVariable String id) {
        log.info("Fetching parcel by id: {}", id);
        return publicService.getParcelByIdAssessments(id);
    }

    @GetMapping("/parcels/{id}/transactions")
    public Mono<?> getParcelByIdTransactions(@PathVariable String id) {
        log.info("Fetching parcel by id: {}", id);
        return publicService.getParcelByIdTransactions(id);
    }


    @GetMapping("/pub/assessments")
    public Mono<?> getPubAssessments() {
        return publicService.getPubAssessments();
    }

    @GetMapping("/pub/transactions")
    public Mono<?> getPubTransactions() {
        return publicService.getPubTransactions();
    }


}
