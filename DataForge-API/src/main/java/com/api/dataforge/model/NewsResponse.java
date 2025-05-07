package com.api.dataforge.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class NewsResponse {

    @JsonProperty("status")
    public String status;
    @JsonProperty("totalResults")
    public int totalResults;
    @JsonProperty("articles")
    public List<Root> articles;

}
