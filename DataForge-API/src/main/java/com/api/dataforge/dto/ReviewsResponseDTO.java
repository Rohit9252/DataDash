package com.api.dataforge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;

@Schema(
        name = "ReviewsResponseDTO",
        description = "Schema to hold reviews response information"
)
public class ReviewsResponseDTO {

    @JsonProperty("PropertyLocationNames")
    public String propertyLocationNames;
    @JsonProperty("RevieweeKey")
    public String revieweeKey;
    @JsonProperty("ReviewerScreenName")
    public String reviewerScreenName;
    @JsonProperty("ReviewDate")
    public String reviewDate;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("Rating")
    public int rating;
    @JsonProperty("BridgeModificationTimestamp")
    public Date bridgeModificationTimestamp;
    @JsonProperty("ServiceYear")
    public int serviceYear;
    @JsonProperty("FreeFormLocation")
    public String freeFormLocation;
    @JsonProperty("RegionLocationNames")
    public Object regionLocationNames;
    @JsonProperty("ReviewKey")
    public String reviewKey;
    @JsonProperty("TeamLeadAccountId")
    public String teamLeadAccountId;
    @JsonProperty("ReviewerFullName")
    public String reviewerFullName;
    @JsonProperty("ReviewId")
    public String reviewId;
    @JsonProperty("AccountIdReviewee")
    public String accountIdReviewee;
    @JsonProperty("ServiceProviderDesc")
    public String serviceProviderDesc;

}
