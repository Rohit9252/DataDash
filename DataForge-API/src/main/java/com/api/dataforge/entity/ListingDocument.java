package com.api.dataforge.entity;

import com.api.dataforge.dto.MediumDTO;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
//@Document(collection = "listings")
public class ListingDocument {

//    @Id
    private String id;

    // Identifiers
    private String listingId;
    private String listingKey;
    private String originatingSystemID;
    private String originatingSystemKey;
    private String originatingSystemName;
    private String sourceSystemID;
    private String sourceSystemKey;
    private String sourceSystemName;

    // Pricing
    private Integer listPrice;
    private Integer originalListPrice;
    private Object listPriceLow;
    private Integer previousListPrice;
    private Date priceChangeTimestamp;

    // Status and Dates
    private String mlsStatus;
    private String standardStatus;
    private Date statusChangeTimestamp;
    private Object majorChangeTimestamp;
    private String majorChangeType;
    private String contingentDate;
    private Date pendingTimestamp;
    private String contractStatusChangeDate;
    private Object withdrawnDate;
    private Object offMarketDate;
    private Object offMarketTimestamp;
    private Object cancelationDate;
    private Object onMarketTimestamp;
    private String onMarketDate;
    private Object expirationDate;
    private String closeDate;
    private Date bridgeModificationTimestamp;
    private Object documentsChangeTimestamp;
    private Object photosChangeTimestamp;
    private Object videosChangeTimestamp;

    // Listing Terms and Details
    private String listingService;
    private Object listingAgreement;
    private String listingContractDate;
    private String availabilityDate;
    private String concessions;
    private Double concessionsAmount;
    private Object concessionsComments;
    private String contingency;
    private Boolean dualVariableCompensationYN;
    private Object listTeamKey;
    private Object listTeamKeyNumeric;
    private Object listTeamName;
    private List<String> listingTerms;
    private List<String> syndicateTo;
    private Boolean internetAddressDisplayYN;
    private Boolean internetEntireListingDisplayYN;
    private Boolean internetAutomatedValuationDisplayYN;
    private Boolean internetConsumerCommentYN;
    private List<String> disclosures;
    private String showingInstructions;
    private Object showingStartTime;
    private Object showingEndTime;
    private Object showingAdvanceNotice;
    private Object showingRequirements;
    private String showingContactName;
    private String showingContactPhone;
    private Object showingContactPhoneExt;
    private List<String> showingContactType;
    private Object showingAttendedYN;
    private Integer daysOnMarket;
    private Object cumulativeDaysOnMarket;

    // Transaction Data
    private Object closePrice;
    private Object purchaseContractDate;
    private Object grossIncome;
    private Object netOperatingIncome;
    private Object capRate;
    private Object vacancyAllowanceRate;
    private Object vacancyAllowance;
    private List<Object> incomeIncludes;

    // Documents and Media
    private Integer documentsCount;
    private Object videosCount;
    private Integer photosCount;
    private List<Medium> medium;
}
