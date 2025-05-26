package com.api.dataforge.entity;


import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AgentInfo {
    private String agentKey;
    private Object agentKeyNumeric;
    private String fullName;
    private String firstName;
    private String lastName;
    private String middleName;
    private String namePrefix;
    private String nameSuffix;
    private String stateLicense;
    private String mlsId;
    private Object aor;
    private String cellPhone;
    private String email;
    private String fax;
    private String homePhone;
    private String mobilePhone;
    private String officePhone;
    private String officePhoneExt;
    private String pager;
    private String preferredPhone;
    private String preferredPhoneExt;
    private String voiceMail;
    private String voiceMailExt;
    private String tollFreePhone;
    private List<String> designation;
}
