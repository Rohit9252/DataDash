package com.api.dataforge.entity;

import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    private String streetNumber;
    private String streetName;
    private String unitNumber;
    private String city;
    private String stateOrProvince;
    private String postalCode;
    private String countyOrParish;
    private String country;
    private Double latitude;
    private Double longitude;
    private List<Double> coordinates;
    private String directions;
    private String unparsedAddress;
    private String postalCity;
}
