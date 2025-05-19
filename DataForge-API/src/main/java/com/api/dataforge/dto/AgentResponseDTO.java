package com.api.dataforge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.Date;

@Schema(
        name = "AgentResponseDTO",
        description = "Schema to hold agent response information"
)
public class AgentResponseDTO {

    @JsonProperty("MemberMlsAccessYN")
    public boolean memberMlsAccessYN;
    @JsonProperty("OfficeKey")
    public String officeKey;
    @JsonProperty("MemberVoiceMail")
    public Object memberVoiceMail;
    @JsonProperty("MemberAORMlsId")
    public Object memberAORMlsId;
    @JsonProperty("MemberPreferredPhoneExt")
    public Object memberPreferredPhoneExt;
    @JsonProperty("MemberMlsSecurityClass")
    public String memberMlsSecurityClass;
    @JsonProperty("OriginatingSystemName")
    public Object originatingSystemName;
    @JsonProperty("MemberCountyOrParish")
    public String memberCountyOrParish;
    @JsonProperty("MemberPostalCode")
    public String memberPostalCode;
    @JsonProperty("MemberCarrierRoute")
    public Object memberCarrierRoute;
    @JsonProperty("MemberMiddleName")
    public String memberMiddleName;
    @JsonProperty("MemberAOR")
    public Object memberAOR;
    @JsonProperty("MemberPassword")
    public Object memberPassword;
    @JsonProperty("MemberCity")
    public String memberCity;
    @JsonProperty("ModificationTimestamp")
    public Date modificationTimestamp;
    @JsonProperty("SourceSystemMemberKey")
    public Object sourceSystemMemberKey;
    @JsonProperty("MemberHomePhone")
    public String memberHomePhone;
    @JsonProperty("MemberOtherPhoneType")
    public Object memberOtherPhoneType;
    @JsonProperty("MemberStateLicense")
    public String memberStateLicense;
    @JsonProperty("MemberFullName")
    public String memberFullName;
    @JsonProperty("MemberNamePrefix")
    public Object memberNamePrefix;
    @JsonProperty("MemberPager")
    public Object memberPager;
    @JsonProperty("MemberDesignation")
    public ArrayList<String> memberDesignation;
    @JsonProperty("MemberLoginId")
    public String memberLoginId;
    @JsonProperty("Media")
    public Object media;
    @JsonProperty("MemberPostalCodePlus4")
    public Object memberPostalCodePlus4;
    @JsonProperty("MemberLanguages")
    public ArrayList<String> memberLanguages;
    @JsonProperty("MemberNameSuffix")
    public Object memberNameSuffix;
    @JsonProperty("SourceSystemID")
    public Object sourceSystemID;
    @JsonProperty("OriginatingSystemID")
    public String originatingSystemID;
    @JsonProperty("SocialMediaType")
    public Object socialMediaType;
    @JsonProperty("MemberMlsId")
    public String memberMlsId;
    @JsonProperty("SyndicateTo")
    public ArrayList<String> syndicateTo;
    @JsonProperty("MemberPreferredPhone")
    public Object memberPreferredPhone;
    @JsonProperty("MemberKey")
    public String memberKey;
    @JsonProperty("OfficeMlsId")
    public String officeMlsId;
    @JsonProperty("OfficeName")
    public String officeName;
    @JsonProperty("OriginalEntryTimestamp")
    public Date originalEntryTimestamp;
    @JsonProperty("MemberTollFreePhone")
    public Object memberTollFreePhone;
    @JsonProperty("OfficeKeyNumeric")
    public Object officeKeyNumeric;
    @JsonProperty("BridgeModificationTimestamp")
    public Date bridgeModificationTimestamp;
    @JsonProperty("SourceSystemName")
    public Object sourceSystemName;
    @JsonProperty("JobTitle")
    public String jobTitle;
    @JsonProperty("MemberOfficePhone")
    public String memberOfficePhone;
    @JsonProperty("MemberNickname")
    public Object memberNickname;
    @JsonProperty("LastLoginTimestamp")
    public Object lastLoginTimestamp;
    @JsonProperty("MemberMobilePhone")
    public String memberMobilePhone;
    @JsonProperty("MemberStateOrProvince")
    public String memberStateOrProvince;
    @JsonProperty("MemberAssociationComments")
    public String memberAssociationComments;
    @JsonProperty("MemberStateLicenseState")
    public Object memberStateLicenseState;
    @JsonProperty("MemberFirstName")
    public String memberFirstName;
    @JsonProperty("MemberAddress1")
    public String memberAddress1;
    @JsonProperty("MemberAddress2")
    public Object memberAddress2;
    @JsonProperty("MemberAORkeyNumeric")
    public Object memberAORkeyNumeric;
    @JsonProperty("MemberPhoneTTYTDD")
    public Object memberPhoneTTYTDD;
    @JsonProperty("MemberNationalAssociationId")
    public String memberNationalAssociationId;
    @JsonProperty("MemberAORkey")
    public Object memberAORkey;
    @JsonProperty("MemberIsAssistantTo")
    public Object memberIsAssistantTo;
    @JsonProperty("OriginatingSystemMemberKey")
    public String originatingSystemMemberKey;
    @JsonProperty("MemberDirectPhone")
    public Object memberDirectPhone;
    @JsonProperty("MemberKeyNumeric")
    public Object memberKeyNumeric;
    @JsonProperty("MemberCountry")
    public String memberCountry;
    @JsonProperty("MemberVoiceMailExt")
    public Object memberVoiceMailExt;
    @JsonProperty("MemberFax")
    public Object memberFax;
    @JsonProperty("MemberOfficePhoneExt")
    public Object memberOfficePhoneExt;
    @JsonProperty("MemberEmail")
    public String memberEmail;
    @JsonProperty("MemberType")
    public String memberType;
    @JsonProperty("MemberStatus")
    public String memberStatus;
    @JsonProperty("MemberLastName")
    public String memberLastName;
    @JsonProperty("FeedTypes")
    public ArrayList<Object> feedTypes;
    public String url;
}
