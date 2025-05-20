package com.api.dataforge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;

public class ZestimateDTO {

    public String id;
    public String city;
    public String zpid;
    public String state;
    public String address;
    public Integer minus30;
    @JsonProperty("Latitude")
    public Double latitude;
    @JsonProperty("Longitude")
    public Double longitude;
    public Date timestamp;
    public Integer zestimate;
    public String zillowUrl;
    public Integer lowPercent;
    public String postalCode;
    public String streetName;
    public Object unitNumber;
    public Object unitPrefix;
    public Integer highPercent;
    public String houseNumber;
    public String zipPlusFour;
    public String streetSuffix;
    public Object directionPrefix;
    public Object directionSuffix;
    public Date rentalTimestamp;
    public Integer rentalZestimate;
    public Integer rentalLowPercent;
    public Integer rentalHighPercent;
    public Object houseNumberFraction;
    @JsonProperty("BridgeModificationTimestamp")
    public Date bridgeModificationTimestamp;
    @JsonProperty("Coordinates")
    public ArrayList<Double> coordinates;
    public Object forecastStandardDeviation;
    public String url;
}
