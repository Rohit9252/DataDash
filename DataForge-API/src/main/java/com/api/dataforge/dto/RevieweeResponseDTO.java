package com.api.dataforge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;
@Schema(
        name = "RevieweeResponseDTO",
        description = "Schema to hold reviewee response information"
)
public class RevieweeResponseDTO {

    @JsonProperty("RevieweeKey")
    public String revieweeKey;
    @JsonProperty("RevieweeProfileURL")
    public String revieweeProfileURL;
    @JsonProperty("RevieweeTitle")
    public String revieweeTitle;
    @JsonProperty("RevieweeEmail")
    public String revieweeEmail;
    @JsonProperty("RevieweeBusinessName")
    public String revieweeBusinessName;
    @JsonProperty("BridgeModificationTimestamp")
    public Date bridgeModificationTimestamp;
    @JsonProperty("ReviewRequestURL")
    public String reviewRequestURL;
    @JsonProperty("ReviewCount")
    public int reviewCount;
    @JsonProperty("RevieweeFullName")
    public String revieweeFullName;
    @JsonProperty("AccountIdReviewee")
    public String accountIdReviewee;
    @JsonProperty("AverageReviewRating")
    public int averageReviewRating;
    @JsonProperty("RevieweeScreenName")
    public String revieweeScreenName;

}
