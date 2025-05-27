package com.api.dataforge.mapper;


import com.api.dataforge.dto.ListingResponseDTO;
import com.api.dataforge.entity.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


@Component
public class PropertyDetailsMapper {


    private final AmenitiesMapper amenitiesMapper;

    public PropertyDetailsMapper(AmenitiesMapper amenitiesMapper) {
        this.amenitiesMapper = amenitiesMapper;
    }

    public PropertyDocument toPropertyDetails(ListingResponseDTO dto) {
        if (dto == null) return null;

        PropertyDocument details = new PropertyDocument();

        // Basic fields
        details.setPropertyType(dto.propertyType);
        details.setPropertySubType(dto.propertySubType);
        details.setPropertyCondition(dto.propertyCondition instanceof ArrayList ? (ArrayList<Object>) dto.propertyCondition : new ArrayList<>());
        details.setOwnership(dto.ownership);
        details.setOwnershipType(asString(dto.ownershipType));
        details.setZoning(dto.zoning);
        details.setZoningDescription(dto.zoningDescription);
        details.setYearBuilt(dto.yearBuilt);
        details.setYearBuiltSource(dto.yearBuiltSource);
        details.setYearBuiltDetails(dto.yearBuiltDetails);
        details.setYearBuiltEffective(asString(dto.yearBuiltEffective));
        details.setNewConstructionYN(dto.newConstructionYN);

        // Address
        Address address = new Address();
//        PropertyDocument.Address address = new PropertyDocument.Address();
        address.setStreetNumber(dto.streetNumber);
        address.setStreetName(dto.streetName);
        address.setUnitNumber(dto.unitNumber);
        address.setCity(dto.city);
        address.setStateOrProvince(dto.stateOrProvince);
        address.setPostalCode(dto.postalCode);
        address.setCountyOrParish(dto.countyOrParish);
        address.setCountry(dto.country);
        address.setLatitude(dto.latitude);
        address.setLongitude(dto.longitude);
        address.setCoordinates(dto.coordinates);
        address.setDirections(dto.directions);
        address.setUnparsedAddress(dto.unparsedAddress);
        address.setPostalCity(asString(dto.postalCity));
        details.setAddress(address);


        // Size and Structure
        SizeAndStructure size = new SizeAndStructure();
//        PropertyDetails.SizeAndStructure size = new PropertyDetails.SizeAndStructure();
        size.setLivingArea(dto.livingArea);
        size.setBuildingAreaTotal(dto.buildingAreaTotal);
        size.setLotSizeAcres(dto.lotSizeAcres);
        size.setLotSizeSquareFeet(dto.lotSizeSquareFeet);
        size.setBuildingFeatures(dto.buildingFeatures);
        size.setBuildingAreaSource(dto.buildingAreaSource);
        size.setBuildingAreaUnits(dto.buildingAreaUnits);
        size.setLotSizeUnits(asString(dto.lotSizeUnits));
        size.setLotSizeDimensions(dto.lotSizeDimensions);
        size.setLotSizeSource(dto.lotSizeSource);
        size.setStoriesTotal(dto.storiesTotal);
        size.setStories(dto.stories);
        size.setFoundationDetails(dto.foundationDetails);
        size.setFoundationArea(dto.foundationArea);
        size.setConstructionMaterials(dto.constructionMaterials);
        size.setArchitecturalStyle(dto.architecturalStyle);
        size.setStructureType(dto.structureType);
        size.setLevels(dto.levels);
        size.setBasement(dto.basement);
        details.setSizeAndStructure(size);

        // Amenities
        AmenitiesDocument amenities = new AmenitiesDocument();
        details.setAmenitiesDocument(amenitiesMapper.toAmenitiesDocument(dto));

        // Legal and Tax Info
        LegalTaxInfo legal = new LegalTaxInfo();
//        PropertyDetails.LegalTaxInfo legal = new PropertyDetails.LegalTaxInfo();
        legal.setParcelNumber(dto.parcelNumber);
        legal.setTaxAssessedValue(dto.taxAssessedValue);
        legal.setTaxAnnualAmount(dto.taxAnnualAmount);
        legal.setTaxYear(dto.taxYear);
        legal.setTaxLot(dto.taxLot);
        legal.setTaxBlock(dto.taxBlock);
        legal.setTaxTract(dto.taxTract);
        legal.setTaxBookNumber(asString(dto.taxBookNumber));
        legal.setTaxMapNumber(asString(dto.taxMapNumber));
        legal.setTaxLegalDescription(dto.taxLegalDescription);
        legal.setLotDimensionsSource(dto.lotDimensionsSource);
        legal.setZoning(dto.zoning);
        legal.setZoningDescription(dto.zoningDescription);
        details.setLegalTaxInfo(legal);

        return details;
    }

    private static String asString(Object obj) {
        return obj != null ? obj.toString() : null;
    }
}

