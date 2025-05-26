package com.api.dataforge.entity;


import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LegalTaxInfo {
    private String parcelNumber;
    private Integer taxAssessedValue;
    private Integer taxAnnualAmount;
    private Integer taxYear;
    private String taxLot;
    private String taxBlock;
    private String taxTract;
    private String taxBookNumber;
    private String taxMapNumber;
    private String taxLegalDescription;
    private String lotDimensionsSource;
    private String zoning;
    private String zoningDescription;
}
