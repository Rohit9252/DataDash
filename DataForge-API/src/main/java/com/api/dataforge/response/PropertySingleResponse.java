package com.api.dataforge.response;

import com.api.dataforge.dto.PropertyResponseDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PropertySingleResponse {

    @JsonProperty("value")
    public PropertyResponseDTO propValue;
}
