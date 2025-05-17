package com.api.dataforge.response;

import com.api.dataforge.dto.PropertyResponseDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class PropertyResponse {

    @JsonProperty("value")
    public ArrayList<PropertyResponseDTO> propValue;
//    public String @odata.nextLink;
//    public String @odata.context;
//    public int @odata.count;
}
