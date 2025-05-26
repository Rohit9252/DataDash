package com.api.dataforge.entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AmenitiesDocument {

    private String listingId; // Link back to the main listing

    // Interior Features
    private List<String> interiorFeatures;
    private List<String> flooring;
    private List<String> appliances;
    private List<String> laundryFeatures;
    private List<String> doorFeatures;
    private List<Object> windowFeatures; // Consider normalization
    private List<String> cooling;
    private Boolean coolingYN;
    private List<String> heating;
    private Boolean heatingYN;
    private List<String> fireplaceFeatures;
    private Boolean fireplaceYN;
    private Integer fireplacesTotal;
    private Integer bedroomsTotal;
    private Integer bedroomsPossible;
    private Double bathroomsTotalDecimal;
    private Integer bathroomsTotalInteger;
    private Integer bathroomsFull;
    private Integer bathroomsHalf;
    private Integer bathroomsPartial;
    private Integer bathroomsOneQuarter;
    private Integer bathroomsThreeQuarter;
    private Integer mainLevelBathrooms;
    private String mainLevelBedrooms;







    // Exterior Features
    private List<String> exteriorFeatures;
    private List<String> roof;
    private List<String> constructionMaterials;
    private List<String> architecturalStyle;
    private List<String> foundationDetails;
    private List<String> levels;
    private List<String> basement;

    private List<String> poolFeatures;
    private Boolean poolPrivateYN;
    private List<Object> spaFeatures;
    private Boolean spaYN;



    private List<String> lotFeatures;
    private List<String> fencing;
    private List<String> patioAndPorchFeatures;
    private Integer parkingTotal;
    private Integer garageSpaces;
    private Integer carportSpaces;
    private Integer openParkingSpaces;
    private Boolean attachedGarageYN;
    private Boolean garageYN;
    private Boolean carportYN;
    private List<String> otherStructures;
    private List<String> greenEnergyEfficient;
    private List<Object> greenWaterConservation;
    private List<Object> greenSustainability;
    private List<Object> greenIndoorAirQuality;
    private List<Object> greenLocation;
    private List<Object> greenEnergyGeneration;
    private Object greenBuildingVerificationType;
    private Boolean horseYN;
    private List<Object> horseAmenities;



    // Community Features
    private List<String> communityFeatures;
    private List<String> associationAmenities;
    private List<String> commonWalls;
    private String commonInterest;
    private List<String> associationFeeIncludes;
    private Boolean associationYN;
    private Integer associationFee;
    private Integer associationFee2;
    private String associationFeeFrequency;
    private String associationFee2Frequency;

}
