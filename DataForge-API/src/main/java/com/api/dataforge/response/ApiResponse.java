package com.api.dataforge.response;

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
public class ApiResponse {

    @JsonProperty("success")
    private boolean success;
    @JsonProperty("status")
    private int status;
    @JsonProperty("bundle")
    private List<?> bundle;
    @JsonProperty("total")
    private int total;

}
