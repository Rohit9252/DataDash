package com.api.dataforge.mapper;

import com.api.dataforge.dto.ListingResponseDTO;
import com.api.dataforge.entity.ListingDocument;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


@Component
public class ListingMapper {

    private final PropertyDetailsMapper propertyDetailsMapper;


    public ListingMapper(PropertyDetailsMapper propertyDetailsMapper) {
        this.propertyDetailsMapper = propertyDetailsMapper;
    }

    public ListingDocument toListingDocument(ListingResponseDTO dto) {
        if (dto == null) return null;

        ListingDocument doc = new ListingDocument();

//        doc.setListingDocumentId(dto.listingId);
        // Identifiers
        doc.setListingId(dto.listingId);
        doc.setListingKey(dto.listingKey);
        doc.setOriginatingSystemID(dto.originatingSystemID);
        doc.setOriginatingSystemKey(dto.originatingSystemKey);
        doc.setOriginatingSystemName(asString(dto.originatingSystemName));
        doc.setSourceSystemID(asString(dto.sourceSystemID));
        doc.setSourceSystemKey(asString(dto.sourceSystemKey));
        doc.setSourceSystemName(asString(dto.sourceSystemName));

        // Pricing
        doc.setListPrice(dto.listPrice);
        doc.setOriginalListPrice(dto.originalListPrice);
        doc.setListPriceLow(dto.listPriceLow);
        doc.setPreviousListPrice(dto.previousListPrice);
        doc.setPriceChangeTimestamp(dto.priceChangeTimestamp);

        // Status and Dates
        doc.setMlsStatus(dto.mlsStatus);
        doc.setStandardStatus(dto.standardStatus);
        doc.setStatusChangeTimestamp(dto.statusChangeTimestamp);
        doc.setMajorChangeTimestamp(dto.majorChangeTimestamp);
        doc.setMajorChangeType(dto.majorChangeType);
        doc.setContingentDate(dto.contingentDate);
        doc.setPendingTimestamp(dto.pendingTimestamp);
        doc.setContractStatusChangeDate(dto.contractStatusChangeDate);
        doc.setWithdrawnDate(dto.withdrawnDate);
        doc.setOffMarketDate(dto.offMarketDate);
        doc.setOffMarketTimestamp(dto.offMarketTimestamp);
        doc.setCancelationDate(dto.cancelationDate);
        doc.setOnMarketTimestamp(dto.onMarketTimestamp);
        doc.setOnMarketDate(dto.onMarketDate);
        doc.setExpirationDate(dto.expirationDate);
        doc.setCloseDate(dto.closeDate);
        doc.setBridgeModificationTimestamp(dto.bridgeModificationTimestamp);
        doc.setDocumentsChangeTimestamp(dto.documentsChangeTimestamp);
        doc.setPhotosChangeTimestamp(dto.photosChangeTimestamp);
        doc.setVideosChangeTimestamp(dto.videosChangeTimestamp);

        // Listing Terms and Details
        doc.setListingService(dto.listingService);
        doc.setListingAgreement(dto.listingAgreement);
        doc.setListingContractDate(dto.listingContractDate);
        doc.setAvailabilityDate(dto.availabilityDate);
        doc.setConcessions(dto.concessions);
        doc.setConcessionsAmount(dto.concessionsAmount);
        doc.setConcessionsComments(dto.concessionsComments);
        doc.setContingency(dto.contingency);
        doc.setDualVariableCompensationYN(dto.dualVariableCompensationYN);
        doc.setListTeamKey(dto.listTeamKey);
        doc.setListTeamKeyNumeric(dto.listTeamKeyNumeric);
        doc.setListTeamName(dto.listTeamName);
        doc.setListingTerms(dto.listingTerms != null ? dto.listingTerms : new ArrayList<>());
        doc.setSyndicateTo(dto.syndicateTo != null ? dto.syndicateTo : new ArrayList<>());
        doc.setInternetAddressDisplayYN(dto.internetAddressDisplayYN);
        doc.setInternetEntireListingDisplayYN(dto.internetEntireListingDisplayYN);
        doc.setInternetAutomatedValuationDisplayYN(dto.internetAutomatedValuationDisplayYN);
        doc.setInternetConsumerCommentYN(dto.internetConsumerCommentYN);
        doc.setDisclosures(dto.disclosures != null ? dto.disclosures : new ArrayList<>());
        doc.setShowingInstructions(dto.showingInstructions);
        doc.setShowingStartTime(dto.showingStartTime);
        doc.setShowingEndTime(dto.showingEndTime);
        doc.setShowingAdvanceNotice(dto.showingAdvanceNotice);
        doc.setShowingRequirements(dto.showingRequirements);
        doc.setShowingContactName(dto.showingContactName);
        doc.setShowingContactPhone(dto.showingContactPhone);
        doc.setShowingContactPhoneExt(dto.showingContactPhoneExt);
        doc.setShowingContactType(dto.showingContactType != null ? dto.showingContactType : new ArrayList<>());
        doc.setShowingAttendedYN(dto.showingAttendedYN);
        doc.setDaysOnMarket(dto.daysOnMarket);
        doc.setCumulativeDaysOnMarket(dto.cumulativeDaysOnMarket);

        // Transaction Data
        doc.setClosePrice(dto.closePrice);
        doc.setPurchaseContractDate(dto.purchaseContractDate);
        doc.setGrossIncome(dto.grossIncome);
        doc.setNetOperatingIncome(dto.netOperatingIncome);
        doc.setCapRate(dto.capRate);
        doc.setVacancyAllowanceRate(dto.vacancyAllowanceRate);
        doc.setVacancyAllowance(dto.vacancyAllowance);
        doc.setIncomeIncludes(dto.incomeIncludes != null ? dto.incomeIncludes : new ArrayList<>());

        // Documents and Media
        doc.setDocumentsCount(dto.documentsCount);
        doc.setVideosCount(dto.videosCount);
        doc.setPhotosCount(dto.photosCount);
//        doc.setMedium(dto.media != null ? dto.medium : new ArrayList<>());




        return doc;
    }

    // Helper to handle possible null values
    private static String asString(Object obj) {
        return obj != null ? obj.toString() : null;
    }
}


