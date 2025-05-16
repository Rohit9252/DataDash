package com.api.dataforge.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Medium {

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
