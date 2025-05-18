package com.api.dataforge.response;


import java.util.Date;

public class MarketReportResponse {
    public int id;
    public int regionID;
    public String region;
    public int regionTypeID;
    public String regionType;
    public String regionState;
    public Object regionCounty;
    public String regionMetro;
    public Object regionCity;
    public String stateCodeFIPS;
    public Object municipalCodeFIPS;
    public Date timePeriodEndDateTime;
    public String timePeriodTypeKey;
    public String metricTypeKey;
    public String cutTypeKey;
    public int dataValue;
    public String createDate;
    public String releaseDate;
    public String url;
}
