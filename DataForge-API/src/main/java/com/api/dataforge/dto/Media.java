package com.api.dataforge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Media {
    @JsonProperty("MediaURL")
    private String mediaURL;
    @JsonProperty("MediaObjectID")
    private String mediaObjectID;
    @JsonProperty("Order")
    private int order;
    @JsonProperty("MimeType")
    private String mimeType;
    @JsonProperty("ShortDescription")
    private String shortDescription;
}
