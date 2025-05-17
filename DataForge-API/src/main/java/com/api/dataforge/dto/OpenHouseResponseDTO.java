package com.api.dataforge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;

public class OpenHouseResponseDTO {

    @JsonProperty("OriginalEntryTimestamp")
    public Date originalEntryTimestamp;
    @JsonProperty("SourceSystemKey")
    public Object sourceSystemKey;
    @JsonProperty("AppointmentRequiredYN")
    public boolean appointmentRequiredYN;
    @JsonProperty("ShowingAgentKeyNumeric")
    public Object showingAgentKeyNumeric;
    @JsonProperty("BridgeModificationTimestamp")
    public Date bridgeModificationTimestamp;
    @JsonProperty("SourceSystemName")
    public Object sourceSystemName;
    @JsonProperty("OriginatingSystemKey")
    public String originatingSystemKey;
    @JsonProperty("OpenHouseStatus")
    public Object openHouseStatus;
    @JsonProperty("OpenHouseType")
    public String openHouseType;
    @JsonProperty("OriginatingSystemName")
    public Object originatingSystemName;
    @JsonProperty("OpenHouseStartTime")
    public Date openHouseStartTime;
    @JsonProperty("OpenHouseEndTime")
    public Date openHouseEndTime;
    @JsonProperty("OpenHouseId")
    public Object openHouseId;
    @JsonProperty("ListingId")
    public String listingId;
    @JsonProperty("OpenHouseDate")
    public String openHouseDate;
    @JsonProperty("ModificationTimestamp")
    public Date modificationTimestamp;
    @JsonProperty("ListingKey")
    public String listingKey;
    @JsonProperty("ShowingAgentLastName")
    public String showingAgentLastName;
    @JsonProperty("ListingKeyNumeric")
    public Object listingKeyNumeric;
    @JsonProperty("OpenHouseRemarks")
    public String openHouseRemarks;
    @JsonProperty("OpenHouseAttendedBy")
    public Object openHouseAttendedBy;
    @JsonProperty("SourceSystemID")
    public Object sourceSystemID;
    @JsonProperty("OriginatingSystemID")
    public String originatingSystemID;
    @JsonProperty("ShowingAgentKey")
    public String showingAgentKey;
    @JsonProperty("Refreshments")
    public String refreshments;
    @JsonProperty("ShowingAgentMlsID")
    public String showingAgentMlsID;
    @JsonProperty("ShowingAgentFirstName")
    public String showingAgentFirstName;
    @JsonProperty("OpenHouseKeyNumeric")
    public Object openHouseKeyNumeric;
    @JsonProperty("OpenHouseKey")
    public String openHouseKey;
    @JsonProperty("FeedTypes")
    public ArrayList<Object> feedTypes;
    public String url;
}
