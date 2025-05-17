package com.api.dataforge.response;

import com.api.dataforge.dto.ListingResponseDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListingSingleResponse {
    @JsonProperty("status")
    private String status;
    @JsonProperty("success")
    private Boolean success;

    @JsonProperty("bundle")
    private ListingResponseDTO bundle;
}
