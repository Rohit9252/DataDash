package com.api.dataforge.service.Scheduler;


import com.api.dataforge.configuration.ListingCriteriaConfig;
import com.api.dataforge.entity.ListingDocument;
import com.api.dataforge.service.impl.DbListingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class ListingScheduler {

    private final DbListingService dbListingService;
    private final ListingCriteriaConfig listingCriteriaConfig;

    public ListingScheduler(DbListingService dbListingService, ListingCriteriaConfig listingCriteriaConfig) {
        this.dbListingService = dbListingService;
        this.listingCriteriaConfig = listingCriteriaConfig;
    }

    @Scheduled(initialDelay = 100000, fixedRate = 2 * 60 * 1000)
    public void saveListings(){
        try {
            List<ListingDocument> listingDocuments = dbListingService.saveCriteriaResponses(listingCriteriaConfig);
            log.info("Saved Listing Data Size is: {}", listingDocuments.size());
        } catch (Exception e) {
            log.error("Error during scheduled job", e.getMessage());
        }
    }


}
