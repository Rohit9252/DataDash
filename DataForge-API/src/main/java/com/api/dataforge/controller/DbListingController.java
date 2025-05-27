package com.api.dataforge.controller;


import com.api.dataforge.entity.ListingDocument;
import com.api.dataforge.service.impl.DbListingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/test")
public class DbListingController {

    private final DbListingService dbListingService;

    public DbListingController(DbListingService dbListingService) {
        this.dbListingService = dbListingService;
    }

//    @GetMapping("/listing")
//    public List<ListingDocument> getListing(){
////        return listingService.fetchListingById("test", "P_5dba1ff94aa4055b9f2a564c");
//
//
////        return dbListingService.getListingById("test", "P_5dba1ff94aa4055b9f2a564c");
//
//        return dbListingService.saveCriteriaResponses();
//
//
//
//
//    }


}
