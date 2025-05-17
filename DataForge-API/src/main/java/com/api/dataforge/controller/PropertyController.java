package com.api.dataforge.controller;

import com.api.dataforge.service.PropertyService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/property")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PropertyController {

    private final PropertyService propertyService;

    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @GetMapping
    public Mono<?> getListingHandler(@RequestParam String dataSet) {
        return propertyService.fetchProperty(dataSet);

    }

    @GetMapping("/{ListingKey}")
    public Mono<?> getPropertyByIdHandler(@RequestParam(required = true) String dataSet, @PathVariable String ListingKey){
        return propertyService.fetchPropertyByKey(dataSet, ListingKey);
    }
}
