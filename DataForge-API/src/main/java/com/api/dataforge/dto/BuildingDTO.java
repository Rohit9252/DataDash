package com.api.dataforge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildingDTO {

    public int noOfUnits;
    public String occupancyStatus;
    @JsonProperty("class")
    public Object myclass;
    public Object classDescription;
    public String quality;
    public String condition;
    public Object architecturalStyle;
    public String heating;
    public String airConditioning;
    public String foundation;
    public Object fireplace;
    public String water;
    public String sewer;
    public Integer yearBuilt;
    public Object effectiveYearBuilt;
    public Integer totalStories;
    public Integer totalRooms;
    public Integer bedrooms;
    public Integer kitchens;
    public Integer fullBaths;
    public Integer baths;
    public Object comments;
}
