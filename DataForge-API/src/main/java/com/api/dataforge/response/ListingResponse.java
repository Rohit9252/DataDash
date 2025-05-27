package com.api.dataforge.response;

import com.api.dataforge.dto.ListingResponseDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ListingResponse {

    @JsonProperty("status")
    private String status;
    @JsonProperty("success")
    private Boolean success;

    @JsonProperty("bundle")
    private List<ListingResponseDTO> bundle;
}
