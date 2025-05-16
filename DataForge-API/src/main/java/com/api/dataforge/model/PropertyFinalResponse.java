package com.api.dataforge.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class PropertyFinalResponse {

    @JsonProperty("value")
    public ArrayList<PropertyResponse> propValue;
//    public String @odata.nextLink;
//    public String @odata.context;
//    public int @odata.count;
}
