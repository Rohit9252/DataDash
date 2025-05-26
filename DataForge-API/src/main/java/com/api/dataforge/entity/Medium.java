package com.api.dataforge.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Medium {


    @JsonProperty("Order")
    private int order;
    @JsonProperty("MediaURL")
    private String mediaURL;
    @JsonProperty("ResourceRecordKey")
    private String resourceRecordKey;
    @JsonProperty("ResourceName")
    private String resourceName;
    @JsonProperty("ClassName")
    private String className;
    @JsonProperty("MediaCategory")
    private String mediaCategory;
    @JsonProperty("MimeType")
    private String mimeType;
    @JsonProperty("MediaObjectID")
    private String mediaObjectID;
    @JsonProperty("ShortDescription")
    private String shortDescription;
}
