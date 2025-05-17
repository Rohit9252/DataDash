package com.api.dataforge.controller;


import com.api.dataforge.service.AgentService;
import com.api.dataforge.service.OpenHouseService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/openhouse")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class OpenHouseController {

    private final OpenHouseService openHouseService;

    public OpenHouseController(OpenHouseService openHouseService) {
        this.openHouseService = openHouseService;
    }

    @GetMapping
    public Mono<?> getOpenHousesHandler(@RequestParam(required = true) String dataSet){
        return openHouseService.fetchOpenHouses(dataSet);
    }

    @GetMapping("/{openHouseKey}")
    public Mono<?> getOpenHouseByIdHandler(@RequestParam(required = true) String dataSet, @PathVariable String openHouseKey){
        return openHouseService.fetchOpenHouseByKey(dataSet, openHouseKey);
    }
}
