package com.api.dataforge.entity;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OfficeInfo {
    private String officeKey;
    private Object officeKeyNumeric;
    private String name;
    private String mlsId;
    private Object aor;
    private String email;
    private String phone;
    private String phoneExt;
    private String fax;
    private String url;
}
