package com.api.dataforge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Schema(
        name = "Media",
        description = "Schema to hold media information"
)
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
