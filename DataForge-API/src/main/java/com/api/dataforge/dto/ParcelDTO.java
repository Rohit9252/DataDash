package com.api.dataforge.dto;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.awt.geom.Area;
import java.util.ArrayList;

public class ParcelDTO {

    public String id;
    public String fips;
    public String apn;
    public String county;
    public String state;
    public String landUseGeneral;
    public String landUseCode;
    public String landUseDescription;
    public Object zoningCode;
    public Object zoningDescription;
    public Integer lotSizeAcres;
    public Integer lotSizeSquareFeet;
    public Object lotSizeFrontage;
    public Object lotSizeDepth;
    public Object lotSizeIrregular;
    public Object lotTopography;
    public Integer numberOfBuildings;
    public AddressDTO address;
    public LegalDTO legal;
    public ArrayList<Double> coordinates;
    public ArrayList<BuildingDTO> building;
    public ArrayList<Area> areas;
    public ArrayList<String> ownerName;
    public String transactionsUrl;
    public String assessmentsUrl;
    public String url;


}
