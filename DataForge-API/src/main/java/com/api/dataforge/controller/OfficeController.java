package com.api.dataforge.controller;

import com.api.dataforge.service.OfficeService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/office")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class OfficeController {

    private final OfficeService officeService;

    public OfficeController(OfficeService officeService) {
        this.officeService = officeService;
    }

    @GetMapping
    public Mono<?> getOfficesHandler(@RequestParam(required = true) String dataSet){
        return officeService.fetchOffices(dataSet);
    }

    @GetMapping("/{officeKey}")
    public Mono<?> getOfficeByIdHandler(@RequestParam(required = true) String dataSet, @PathVariable String officeKey){
        return officeService.fetchOfficeByKey(dataSet, officeKey);
    }
}
