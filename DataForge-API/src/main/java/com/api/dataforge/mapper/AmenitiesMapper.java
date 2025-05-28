package com.api.dataforge.mapper;



import com.api.dataforge.dto.ListingResponseDTO;
import com.api.dataforge.dto.PropertyResponseDTO;
import com.api.dataforge.entity.AmenitiesDocument;
import org.springframework.stereotype.Component;


@Component
public class AmenitiesMapper {

    public  AmenitiesDocument toAmenitiesDocument(PropertyResponseDTO dto) {
        if (dto == null) return null;

        AmenitiesDocument doc = new AmenitiesDocument();
        doc.setListingId(dto.listingId);

        doc.setInteriorFeatures(dto.interiorFeatures);
        doc.setFlooring(dto.flooring);
        doc.setAppliances(dto.appliances);
        doc.setLaundryFeatures(dto.laundryFeatures);
        doc.setDoorFeatures(dto.doorFeatures);
        doc.setWindowFeatures(dto.windowFeatures);
        doc.setCooling(dto.cooling);
        doc.setCoolingYN(dto.coolingYN);
        doc.setHeating(dto.heating);
        doc.setHeatingYN(dto.heatingYN);
        doc.setFireplaceFeatures(dto.fireplaceFeatures);
        doc.setFireplaceYN(dto.fireplaceYN);
        doc.setFireplacesTotal(dto.fireplacesTotal);
        doc.setExteriorFeatures(dto.exteriorFeatures);
        doc.setRoof(dto.roof);
        doc.setConstructionMaterials(dto.constructionMaterials);
        doc.setArchitecturalStyle(dto.architecturalStyle);
        doc.setFoundationDetails(dto.foundationDetails);
        doc.setLevels(dto.levels);
        doc.setBasement(dto.basement);
        doc.setPoolFeatures(dto.poolFeatures);
        doc.setPoolPrivateYN(dto.poolPrivateYN);
        doc.setSpaFeatures(dto.spaFeatures);
        doc.setSpaYN(dto.spaYN);
        doc.setGreenEnergyEfficient(dto.greenEnergyEfficient);
        doc.setGreenSustainability(dto.greenSustainability);
        doc.setGreenIndoorAirQuality(dto.greenIndoorAirQuality);
        doc.setGreenLocation(dto.greenLocation);
        doc.setGreenEnergyGeneration(dto.greenEnergyGeneration);
        doc.setGreenWaterConservation(dto.greenWaterConservation);
        doc.setGreenBuildingVerificationType(dto.greenBuildingVerificationType);
        doc.setCommunityFeatures(dto.communityFeatures);
        doc.setAssociationAmenities(dto.associationAmenities);
        doc.setCommonWalls(dto.commonWalls);
        doc.setCommonInterest(asString(dto.commonInterest));
        doc.setAssociationFeeIncludes(dto.associationFeeIncludes);
        doc.setAssociationYN(dto.associationYN);
        doc.setAssociationFee(dto.associationFee);
        doc.setAssociationFee2(dto.associationFee2);
        doc.setAssociationFeeFrequency(dto.associationFeeFrequency);
        doc.setAssociationFee2Frequency(dto.associationFee2Frequency);

        return doc;
    }

    private static String asString(Object obj) {
        return obj != null ? obj.toString() : null;
    }
}

