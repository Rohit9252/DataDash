package com.api.dataforge.dto;

import java.util.ArrayList;

public class AssesmentDTO {

    public String id;
    public String parcelID;
    public String apn;
    public String fips;
    public String county;
    public String state;
    public Object censusTract;
    public String taxID;
    public double taxAmount;
    public Integer taxYear;
    public Object taxExemption;
    public Integer year;
    public Integer landValue;
    public Integer improvementValue;
    public Integer totalValue;
    public Integer marketValueYear;
    public Integer marketLandValue;
    public Integer marketImprovementValue;
    public Integer marketTotalValue;
    public String landUseGeneral;
    public String landUseCode;
    public String landUseDescription;
    public Object zoningCode;
    public Object zoningDescription;
    public Object lotSizeAcres;
    public Object lotSizeSquareFeet;
    public Object lotSizeFrontage;
    public Object lotSizeDepth;
    public Object lotSizeIrregular;
    public Object lotTopography;
    public Object numberOfBuildings;
    public ArrayList<String> ownerName;
    public AddressDTO address;
    public LegalDTO legal;
    public ArrayList<Double> coordinates;
    public ArrayList<BuildingDTO> building;
    public ArrayList<AreaDTO> areas;
    public String url;
}
