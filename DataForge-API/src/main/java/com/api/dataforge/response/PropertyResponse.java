package com.api.dataforge.response;

import com.api.dataforge.dto.PropertyResponseDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PropertyResponse {

    @JsonProperty("value")
    private ArrayList<PropertyResponseDTO> propValue;
//    public String @odata.nextLink;
//    public String @odata.context;
//    public int @odata.count;
}
