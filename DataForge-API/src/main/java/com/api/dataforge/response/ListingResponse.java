package com.api.dataforge.response;

import com.api.dataforge.dto.ListingResponseDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ListingResponse {

    @JsonProperty("status")
    private String status;
    @JsonProperty("success")
    private Boolean success;

    @JsonProperty("bundle")
    private List<ListingResponseDTO> bundle;
}
