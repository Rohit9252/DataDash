package com.api.dataforge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;

public class OfficeResponseDTO {

    @JsonProperty("OfficePhone")
    public String officePhone;
    @JsonProperty("OfficeKey")
    public String officeKey;
    @JsonProperty("OfficeCorporateLicense")
    public String officeCorporateLicense;
    @JsonProperty("OfficeBranchType")
    public String officeBranchType;
    @JsonProperty("OfficeStatus")
    public String officeStatus;
    @JsonProperty("OfficeType")
    public String officeType;
    @JsonProperty("OriginatingSystemName")
    public Object originatingSystemName;
    @JsonProperty("MainOfficeMlsId")
    public Object mainOfficeMlsId;
    @JsonProperty("FranchiseAffiliation")
    public String franchiseAffiliation;
    @JsonProperty("ModificationTimestamp")
    public Date modificationTimestamp;
    @JsonProperty("OfficeManagerKeyNumeric")
    public Object officeManagerKeyNumeric;
    @JsonProperty("SyndicateAgentOption")
    public String syndicateAgentOption;
    @JsonProperty("Media")
    public Object media;
    @JsonProperty("OfficePostalCodePlus4")
    public Object officePostalCodePlus4;
    @JsonProperty("SourceSystemID")
    public Object sourceSystemID;
    @JsonProperty("OriginatingSystemID")
    public String originatingSystemID;
    @JsonProperty("OfficeAORkeyNumeric")
    public Object officeAORkeyNumeric;
    @JsonProperty("SocialMediaType")
    public Object socialMediaType;
    @JsonProperty("SyndicateTo")
    public ArrayList<String> syndicateTo;
    @JsonProperty("OfficeMlsId")
    public String officeMlsId;
    @JsonProperty("IDXOfficeParticipationYN")
    public boolean iDXOfficeParticipationYN;
    @JsonProperty("OfficeName")
    public String officeName;
    @JsonProperty("OriginalEntryTimestamp")
    public Date originalEntryTimestamp;
    @JsonProperty("OfficeFax")
    public String officeFax;
    @JsonProperty("OfficeKeyNumeric")
    public Object officeKeyNumeric;
    @JsonProperty("BridgeModificationTimestamp")
    public Date bridgeModificationTimestamp;
    @JsonProperty("SourceSystemName")
    public Object sourceSystemName;
    @JsonProperty("OfficeAORkey")
    public Object officeAORkey;
    @JsonProperty("SourceSystemOfficeKey")
    public Object sourceSystemOfficeKey;
    @JsonProperty("OfficeCity")
    public String officeCity;
    @JsonProperty("MainOfficeKey")
    public Object mainOfficeKey;
    @JsonProperty("OfficeStateOrProvince")
    public String officeStateOrProvince;
    @JsonProperty("OfficePhoneExt")
    public Object officePhoneExt;
    @JsonProperty("OfficeBrokerKey")
    public Object officeBrokerKey;
    @JsonProperty("OfficeAOR")
    public Object officeAOR;
    @JsonProperty("OfficeAssociationComments")
    public String officeAssociationComments;
    @JsonProperty("OfficeBrokerMlsId")
    public Object officeBrokerMlsId;
    @JsonProperty("OfficeAddress2")
    public Object officeAddress2;
    @JsonProperty("OfficeManagerKey")
    public Object officeManagerKey;
    @JsonProperty("OfficeAddress1")
    public String officeAddress1;
    @JsonProperty("OfficeAORMlsId")
    public Object officeAORMlsId;
    @JsonProperty("OriginatingSystemOfficeKey")
    public String originatingSystemOfficeKey;
    @JsonProperty("MainOfficeKeyNumeric")
    public Object mainOfficeKeyNumeric;
    @JsonProperty("OfficeEmail")
    public String officeEmail;
    @JsonProperty("OfficeCountyOrParish")
    public Object officeCountyOrParish;
    @JsonProperty("OfficeBrokerKeyNumeric")
    public Object officeBrokerKeyNumeric;
    @JsonProperty("OfficePostalCode")
    public String officePostalCode;
    @JsonProperty("OfficeManagerMlsId")
    public Object officeManagerMlsId;
    @JsonProperty("OfficeNationalAssociationId")
    public Object officeNationalAssociationId;
    @JsonProperty("FeedTypes")
    public ArrayList<Object> feedTypes;
    public String url;
}
