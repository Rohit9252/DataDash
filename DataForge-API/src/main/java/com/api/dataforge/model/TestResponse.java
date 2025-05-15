package com.api.dataforge.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TestResponse {

    @JsonProperty("status")
    private String status;
    @JsonProperty("success")
    private Boolean success;

    @JsonProperty("bundle")
    private List<ListingResponse> bundle;
}
