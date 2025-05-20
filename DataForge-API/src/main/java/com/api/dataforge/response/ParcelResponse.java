package com.api.dataforge.response;

import com.api.dataforge.dto.ParcelDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ParcelResponse {
    public boolean success;
    public int status;
    @JsonProperty("bundle")
    public ArrayList<ParcelDTO> bundle;
    public int total;
}
