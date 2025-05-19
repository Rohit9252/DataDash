package com.api.dataforge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
        name = "MediumDTO",
        description = "Schema to hold medium information"
)
public class MediumDTO {

    @JsonProperty("Order")
    public int order;
    @JsonProperty("MediaURL")
    public String mediaURL;
    @JsonProperty("ResourceRecordKey")
    public String resourceRecordKey;
    @JsonProperty("ResourceName")
    public String resourceName;
    @JsonProperty("ClassName")
    public String className;
    @JsonProperty("MediaCategory")
    public String mediaCategory;
    @JsonProperty("MimeType")
    public String mimeType;
    @JsonProperty("MediaObjectID")
    public String mediaObjectID;
    @JsonProperty("ShortDescription")
    public String shortDescription;
}
