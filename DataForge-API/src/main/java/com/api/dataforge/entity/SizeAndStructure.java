package com.api.dataforge.entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SizeAndStructure {
    private Integer livingArea;
    private Integer buildingAreaTotal;
    private Integer lotSizeAcres;
    private Integer lotSizeSquareFeet;
    private List<String> buildingFeatures;
    private String buildingAreaSource;
    private String buildingAreaUnits;
    private String lotSizeUnits;
    private String lotSizeDimensions;
    private String lotSizeSource;
    private Integer storiesTotal;
    private Integer stories;
    private List<String> foundationDetails;
    private Integer foundationArea;
    private List<String> constructionMaterials;
    private List<String> architecturalStyle;
    private List<Object> structureType;
    private List<String> levels;
    private List<String> basement;
}
