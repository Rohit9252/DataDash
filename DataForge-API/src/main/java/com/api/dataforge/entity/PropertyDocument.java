package com.api.dataforge.entity;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@ToString
@Document(collection = "properties")
public class PropertyDocument {

    @Id
    private String propertyDocumentId;

    // Core Property Information
    private String propertyType;
    private String propertySubType;
    private List<Object> propertyCondition;
    private String ownership;
    private String ownershipType;
    private String zoning;
    private String zoningDescription;
    private Integer yearBuilt;
    private String yearBuiltSource;
    private String yearBuiltDetails;
    private String yearBuiltEffective;
    private Boolean newConstructionYN;
    private String ListingId;
    private String ListingKey;

    // Location and Address
    private Address address;

    // Size and Structure
    private SizeAndStructure sizeAndStructure;



    private AmenitiesDocument amenitiesDocument;

    // Legal and Tax
    private LegalTaxInfo legalTaxInfo;


    public PropertyDocument(String propertyType, String propertySubType, List<Object> propertyCondition, String ownership, String ownershipType, String zoning, String zoningDescription, Integer yearBuilt, String yearBuiltSource, String yearBuiltDetails, String yearBuiltEffective, Boolean newConstructionYN, String listingId, String listingKey, Address address, SizeAndStructure sizeAndStructure, AmenitiesDocument amenitiesDocument, LegalTaxInfo legalTaxInfo) {
        this.propertyType = propertyType;
        this.propertySubType = propertySubType;
        this.propertyCondition = propertyCondition;
        this.ownership = ownership;
        this.ownershipType = ownershipType;
        this.zoning = zoning;
        this.zoningDescription = zoningDescription;
        this.yearBuilt = yearBuilt;
        this.yearBuiltSource = yearBuiltSource;
        this.yearBuiltDetails = yearBuiltDetails;
        this.yearBuiltEffective = yearBuiltEffective;
        this.newConstructionYN = newConstructionYN;
        ListingId = listingId;
        ListingKey = listingKey;
        this.address = address;
        this.sizeAndStructure = sizeAndStructure;
        this.amenitiesDocument = amenitiesDocument;
        this.legalTaxInfo = legalTaxInfo;
    }
}

