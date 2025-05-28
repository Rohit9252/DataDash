package com.api.dataforge.service.impl;


import com.api.dataforge.caches.BridgeUriCacheService;
import com.api.dataforge.components.BridgeApiUriBuilder;
import com.api.dataforge.configuration.ListingCriteriaConfig;
import com.api.dataforge.dto.ListingResponseDTO;
import com.api.dataforge.dto.PropertyResponseDTO;
import com.api.dataforge.entity.CompleteListingDocument;
import com.api.dataforge.entity.ListingDocument;
import com.api.dataforge.entity.PropertyDocument;
import com.api.dataforge.mapper.ListingMapper;
import com.api.dataforge.mapper.PropertyDetailsMapper;
import com.api.dataforge.repository.ListingRepository;
import com.api.dataforge.repository.PropertyRepository;
import com.api.dataforge.response.AgentResponse;
import com.api.dataforge.response.ListingResponse;
import com.api.dataforge.response.ListingSingleResponse;
import com.api.dataforge.response.PropertyResponse;
import com.api.dataforge.service.ListingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class DbListingService {

    private final ListingService listingService;

    private final ListingMapper listingMapper;

    private final PropertyDetailsMapper propertyDetailsMapper;

    private final ListingRepository listingRepository;

    private final PropertyRepository propertyRepository;

    private final WebClient webClient;



    private final BridgeApiUriBuilder bridgeApiUriBuilder;


    public DbListingService(ListingService listingService, ListingMapper listingMapper, PropertyDetailsMapper propertyDetailsMapper,
                            ListingRepository listingRepository, PropertyRepository propertyRepository
                            , BridgeApiUriBuilder bridgeApiUriBuilder , WebClient webClient
    ) {
        this.propertyRepository = propertyRepository;
        this.listingService = listingService;
        this.listingMapper = listingMapper;
        this.propertyDetailsMapper = propertyDetailsMapper;
        this.listingRepository = listingRepository;
        this.bridgeApiUriBuilder = bridgeApiUriBuilder;
        this.webClient = webClient;

    }

//    public ListingDocument saveListingDocumentById(String dataSet, String id) {
//        List<ListingResponseDTO> ListingResponseDto = listingService.fetchListingById(dataSet, id).map(ListingSingleResponse::getBundle).block();
//        ListingDocument listingDocument = listingMapper.toListingDocument(ListingResponseDto.get(0));
//        // Property Details
//        PropertyDocument propertyDetails = propertyDetailsMapper.toPropertyDetails(ListingResponseDto.get(0));
//        // complete listing document
//        CompleteListingDocument completeListingDocument = new CompleteListingDocument();
//        completeListingDocument.setListing(listingDocument);
//        completeListingDocument.setPropertyDetails(propertyDetails);
//        PropertyDocument propertySaveDocument = propertyRepository.save(propertyDetails);
//        System.out.println("Property is  saved to the database");
//        listingDocument.setPropertyDocument(propertyDetails);
//        ListingDocument listingSaveDocument = listingRepository.save(listingDocument);
//        System.out.println("Saved Listing Document: ");
//
//        return listingSaveDocument;
//
//    }

    private List<ListingDocument> saveListingDocument(List<PropertyResponseDTO> propertyResponseDTOS) {
        List<ListingDocument> listingDocuments = new ArrayList<>();
        for (PropertyResponseDTO dto : propertyResponseDTOS) {

            Optional<ListingDocument> existingDocOpt = listingRepository.findByListingId(dto.listingId);

            if (existingDocOpt.isPresent()) {
                ListingDocument existingDoc = existingDocOpt.get();
                Date existingTimestamp = existingDoc.getBridgeModificationTimestamp();
                Date newTimestamp = dto.bridgeModificationTimestamp;
                log.info("Existing Document found with ID: {}, Existing Timestamp: {}, New Timestamp: {}", existingDoc.getListingDocumentId(), existingTimestamp, newTimestamp);
                if (newTimestamp != null && (existingTimestamp == null || newTimestamp.after(existingTimestamp))) {
                    // Update existing document
                    PropertyDocument existingProperty = existingDoc.getPropertyDocument();
                    if (existingProperty != null) {
                        PropertyDocument updatedProperty = propertyDetailsMapper.toPropertyDetails(dto);
                        updatedProperty.setPropertyDocumentId(existingProperty.getPropertyDocumentId()); // keep ID
                        PropertyDocument savedProperty = propertyRepository.save(updatedProperty);
                        log.info("Updated property document ID: {}", savedProperty.getPropertyDocumentId());
                        existingDoc.setPropertyDocument(savedProperty);
                    } else {
                        // Property not present, create new one
                        PropertyDocument newProperty = propertyDetailsMapper.toPropertyDetails(dto);
                        PropertyDocument savedProperty = propertyRepository.save(newProperty);
                        existingDoc.setPropertyDocument(savedProperty);
                        log.info("Created new property document ID: {}", savedProperty.getPropertyDocumentId());
                    }
                    ListingDocument updatedDoc = listingMapper.toListingDocument(dto);
                    updatedDoc.setListingDocumentId(existingDoc.getListingDocumentId());
                    updatedDoc.setPropertyDocument(existingDoc.getPropertyDocument());
                    ListingDocument savedDoc = listingRepository.save(updatedDoc);
                    listingDocuments.add(savedDoc);
                    log.info("Updated listing document ID: {}", savedDoc.getListingDocumentId());

                    log.info("Updated listing with ID: {}", dto.listingId);
                } else {
                    log.info("Skipped update for listing ID {} - bridgeModificationTimestamp unchanged", dto.listingId);
                }
            } else {
                ListingDocument listingDocument = listingMapper.toListingDocument(dto);
                PropertyDocument propertyDetails = propertyDetailsMapper.toPropertyDetails(dto);
                try {
                    PropertyDocument propertySaveDocument = propertyRepository.save(propertyDetails);
                    log.info("Property is saved to the database: {}", propertySaveDocument.getPropertyDocumentId());
                    listingDocument.setPropertyDocument(propertySaveDocument);
                    ListingDocument listingSaveDocument = listingRepository.save(listingDocument);
                    log.info("Listing is saved to the database: {}", listingSaveDocument.getListingDocumentId());
                    listingDocuments.add(listingSaveDocument);
                } catch (Exception e) {
                    log.error("Error saving listing document: {}", e.getMessage());
                }
            }
        }
        log.info("Total Listings saved: {}", listingDocuments.size());
        return listingDocuments;

    }


    public List<ListingDocument> saveCriteriaResponses(ListingCriteriaConfig listingCriteriaConfig) {

        String url = bridgeApiUriBuilder.buildFilterUrl(listingCriteriaConfig);

        PropertyResponse propertyResponse = webClient.get()
                .uri(url)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(PropertyResponse.class)
                .onErrorResume(e -> {
                    log.error("Error fetching Properties Bases on the Criteria: {}", e.getMessage());
                    return Mono.error(new RuntimeException("Error Fetching Properties"));
                }).block();

        log.info("Properties Found bases on the criteria is : {}", propertyResponse.getPropValue().size());
        List<PropertyResponseDTO> propValue = propertyResponse.getPropValue();

        try {
            List<ListingDocument> listingDocuments = saveListingDocument(propValue);
            log.info("Number of : {} Saved in database", listingDocuments.size());
            return listingDocuments;
        } catch (Exception e) {
            log.info("Exception occurred while Fetching Listings: {}", e.getMessage());
        }
        return null;
    }


}
