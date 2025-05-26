package com.api.dataforge.entity;
import lombok.Data;
import java.util.List;

@Data
//@Document(collection = "properties")
public class PropertyDocument {

//    @Id
    private String id;

    // Core Property Information
    private String propertyType;
    private String propertySubType;
    private List<String> propertyCondition;
    private String ownership;
    private String ownershipType;
    private String zoning;
    private String zoningDescription;
    private Integer yearBuilt;
    private String yearBuiltSource;
    private String yearBuiltDetails;
    private String yearBuiltEffective;
    private Boolean newConstructionYN;

    // Location and Address
    private Address address;

    // Size and Structure
    private SizeAndStructure sizeAndStructure;



    private AmenitiesDocument amenitiesDocument;

    // Legal and Tax
    private LegalTaxInfo legalTaxInfo;









}

