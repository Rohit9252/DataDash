package com.api.dataforge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Date;

public class ListingResponseDTO {
    /*
    @JsonProperty("ListingKey")
    public String listingKey;
    @JsonProperty("ListingId")
    public String listingId;
    @JsonProperty("OriginatingSystemKey")
    public String originatingSystemKey;
    @JsonProperty("LotSizeAcres")
    public int lotSizeAcres;
    @JsonProperty("LotSizeSquareFeet")
    public int lotSizeSquareFeet;
    @JsonProperty("LotSizeSource")
    public String lotSizeSource;
    @JsonProperty("LotSizeDimensions")
    public String lotSizeDimensions;
    @JsonProperty("LotSizeDimensionsSource")
    public String lotSizeDimensionsSource;
    @JsonProperty("AssociationFee")
    public Integer associationFee;
    @JsonProperty("ListPrice")
    public Integer listPrice;
    @JsonProperty("BedroomsPossible")
    public Integer bedroomsPossible;
    @JsonProperty("BathroomsTotalInteger")
    public int bathroomsTotalInteger;
    @JsonProperty("BedroomsTotal")
    public Integer bedroomsTotal;
    @JsonProperty("MainLevelBathrooms")
    public int mainLevelBathrooms;
    @JsonProperty("FireplacesTotal")
    public int fireplacesTotal;
    @JsonProperty("FireplaceFeatures")
    public ArrayList<String> fireplaceFeatures;
    public int garageSpaces;
    @JsonProperty("BathroomsHalf")
    public int bathroomsHalf;
    @JsonProperty("Stories")
    public int stories;
    @JsonProperty("StoriesTotal")
    public int storiesTotal;
    @JsonProperty("PublicRemarks")
    public String publicRemarks;
    @JsonProperty("LivingArea")
    public int livingArea;
    @JsonProperty("LivingAreaUnits")
    public String livingAreaUnits;
    @JsonProperty("YearBuilt")
    public Integer yearBuilt;
    @JsonProperty("YearBuiltDetails")
    public String yearBuiltDetails;
    @JsonProperty("YearBuiltEffective")
    public Integer yearBuiltEffective;
    @JsonProperty("YearBuiltSource")
    public String yearBuiltSource;
    @JsonProperty("StandardStatus")
    public String standardStatus;
    @JsonProperty("MlsStatus")
    public String mlsStatus;
    @JsonProperty("PropertyType")
    public String propertyType;
    @JsonProperty("PropertySubType")
    public String propertySubType;
    @JsonProperty("ListingContractDate")
    public String listingContractDate;
    @JsonProperty("PreviousListPrice")
    public Integer previousListPrice;
    @JsonProperty("OriginalListPrice")
    public Integer originalListPrice;
    @JsonProperty("ClosePrice")
    public Integer closePrice;
    @JsonProperty("Contingency")
    public String contingency;
    @JsonProperty("Disclosures")
    public ArrayList<String> disclosures;
    @JsonProperty("NumberOfUnitsTotal")
    public Integer numberOfUnitsTotal;
    @JsonProperty("CancelationDate")
    public String cancelationDate;
    @JsonProperty("ExpirationDate")
    public String expirationDate;
    @JsonProperty("ListingTerms")
    public ArrayList<String> listingTerms;
    @JsonProperty("OnMarketDate")
    public String onMarketDate;
    @JsonProperty("DaysOnMarket")
    public Integer daysOnMarket;
    @JsonProperty("CloseDate")
    public String closeDate;
    @JsonProperty("StatusChangeTimestamp")
    public String statusChangeTimestamp;
    @JsonProperty("Ownership")
    public String ownership;
    @JsonProperty("FinancialDataSource")
    public ArrayList<String> financialDataSource;
    @JsonProperty("Appliances")
    public ArrayList<String> appliances;
    @JsonProperty("Telephone")
    public ArrayList<String> telephone;
    @JsonProperty("View")
    public ArrayList<String> view;
    @JsonProperty("ViewYN")
    public boolean viewYN;
    @JsonProperty("WaterfrontYN")
    public boolean waterfrontYN;
    @JsonProperty("WaterSource")
    public ArrayList<String> waterSource;
    @JsonProperty("Zoning")
    public String zoning;
    @JsonProperty("ZoningDescription")
    public String zoningDescription;
    @JsonProperty("AboveGradeFinishedArea")
    public Integer aboveGradeFinishedArea;
    @JsonProperty("BelowGradeFinishedArea")
    public Integer belowGradeFinishedArea;
    @JsonProperty("RoomsTotal")
    public Integer roomsTotal;
    @JsonProperty("ExteriorFeatures")
    public ArrayList<String> exteriorFeatures;
    @JsonProperty("Flooring")
    public ArrayList<String> flooring;
    @JsonProperty("FoundationDetails")
    public ArrayList<String> foundationDetails;
    @JsonProperty("FrontageType")
    public ArrayList<String> frontageType;
    @JsonProperty("FrontageLength")
    public Integer frontageLength;
    @JsonProperty("RoadFrontageType")
    public ArrayList<String>  roadFrontageType;
    @JsonProperty("RoadResponsibility")
    public ArrayList<String> roadResponsibility;
    @JsonProperty("Gas")
    public ArrayList<String> gas;
    @JsonProperty("AccessibilityFeatures")
    public ArrayList<String> accessibilityFeatures;
    @JsonProperty("Cooling")
    public ArrayList<String> cooling;
    @JsonProperty("Heating")
    public ArrayList<String> heating;
    @JsonProperty("AdditionalParcelsYN")
    public boolean additionalParcelsYN;
    @JsonProperty("OccupantName")
    public String occupantName;
    @JsonProperty("OccupantPhone")
    public String occupantPhone;
    @JsonProperty("OccupantType")
    public String occupantType;
    @JsonProperty("PoolPrivateYN")
    public boolean poolPrivateYN;
    @JsonProperty("PoolFeatures")
    public ArrayList<String> poolFeatures;

    @JsonProperty("Possession")
    public ArrayList<String> possession;

    @JsonProperty("RoadSurfaceType")
    public ArrayList<String> roadSurfaceType;

    @JsonProperty("Roof")
    public ArrayList<String> roof;

    @JsonProperty("ConstructionMaterials")
    public ArrayList<String> constructionMaterials;

    @JsonProperty("Sewer")
    public ArrayList<String> sewer;
    @JsonProperty("CarportSpaces")
    public Integer carportSpaces;
    @JsonProperty("OpenParkingYN")
    public boolean openParkingYN;
    @JsonProperty("LaundryFeatures")
    public ArrayList<String> laundryFeatures;
    @JsonProperty("PrivateRemarks")
    public String privateRemarks;

    @JsonProperty("TaxAssessedValue")
    public Long taxAssessedValue;
    @JsonProperty("TaxAnnualAmount")
    public Long taxAnnualAmount;

    @JsonProperty("TaxYear")
    public long taxYear;

    @JsonProperty("TaxStatusCurrent")
    public ArrayList<String> taxStatusCurrent;

    @JsonProperty("SubdivisionName")
    public String subdivisionName;

    @JsonProperty("ModificationTimestamp")
    public String modificationTimestamp;

    @JsonProperty("BuyerFinancing")
    public ArrayList<String> buyerFinancing;

    @JsonProperty("NewConstructionYN")
    public boolean newConstructionYN;
    @JsonProperty("HomeWarrantyYN")
    public boolean homeWarrantyYN;

    @JsonProperty("ArchitecturalStyle")
    public ArrayList<String> architecturalStyle;
    @JsonProperty("CommunityFeatures")
    public ArrayList<String> communityFeatures;
    @JsonProperty("PatioAndPorchFeatures")
    public ArrayList<String> patioAndPorchFeatures;
    @JsonProperty("LotFeatures")
    public ArrayList<String> lotFeatures;

    @JsonProperty("Basement")
    public ArrayList<String> basement;


    @JsonProperty("OtherStructures")
    public ArrayList<String> otherStructures;
    @JsonProperty("PetsAllowed")
    public ArrayList<String> petsAllowed;
    @JsonProperty("ParcelNumber")
    public String parcelNumber;

    @JsonProperty("AttachedGarageYN")
    public boolean attachedGarageYN;

    @JsonProperty("CarportYN")
    public boolean carportYN;
    @JsonProperty("ContractStatusChangeDate")
    public String contractStatusChangeDate;

    @JsonProperty("ContingentDate")
    public String contingentDate;
    @JsonProperty("WithdrawnDate")
    public String withdrawnDate;
    @JsonProperty("OffMarketDate")
    public String offMarketDate;
    @JsonProperty("PurchaseContractDate")
    public String purchaseContractDate;
    @JsonProperty("OriginalEntryTimestamp")
    public String originalEntryTimestamp;
    @JsonProperty("AssociationYN")
    public boolean associationYN;
    @JsonProperty("AssociationName")
    public String associationName;
    @JsonProperty("AssociationFeeFrequency")
    public String associationFeeFrequency;
    @JsonProperty("PhotosCount")
    public Long photosCount;
    @JsonProperty("ListingService")
    public String listingService;
    @JsonProperty("ListingAggreement")
    public String listingAggreement;
    @JsonProperty("LeaseConsideredYN")
    public boolean leaseConsideredYN;

    @JsonProperty("CopyrightNotice")
    public String copyrightNotice;

    @JsonProperty("Disclaimer")
    public String disclaimer;
    @JsonProperty("PendingTimestamp")
    public String pendingTimestamp;
    @JsonProperty("PriceChangeTimestamp")
    public String priceChangeTimestamp;
    @JsonProperty("MajorChangeType")
    public String majorChangeType;
    @JsonProperty("MajoreChangeTimestamp")
    public String majoreChangeTimestamp;
    @JsonProperty("DualVariableCompensationYN")
    public boolean dualVariableCompensationYN;
    @JsonProperty("SignOnPropertyYN")
    public boolean signOnPropertyYN;
    @JsonProperty("InternetEntireListingDisplayYN")
    public boolean internetEntireListingDisplayYN;
    @JsonProperty("InternetAddressDisplayYN")
    public boolean internetAddressDisplayYN;
    @JsonProperty("InternetConsumerCommentYN")
    public boolean internetConsumerCommentYN;
    @JsonProperty("InternetAutomatedValuationDisplayYN")
    public boolean internetAutomatedValuationDisplayYN;
    @JsonProperty("SyndicateTo")
    public ArrayList<String> syndicateTo;
    @JsonProperty("PrivateOfficeRemarks")
    public String privateOfficeRemarks;
    @JsonProperty("ShowingInstructions")
    public String showingInstructions;
    @JsonProperty("ShowingContactPhone")
    public String showingContactPhone;
    @JsonProperty("ShowingContactName")
    public String showingContactName;
    @JsonProperty("ShowingContactType")
    public ArrayList<String> showingContactType;
    @JsonProperty("LockBoxLocation")
    public String lockBoxLocation;
    @JsonProperty("LockBoxType")
    public ArrayList<String> lockBoxType;
    @JsonProperty("LockBoxSerialNumber")
    public String lockBoxSerialNumber;
    @JsonProperty("AccessCode")
    public String accessCode;
    @JsonProperty("Exclusions")
    public String exclusions;
    @JsonProperty("Inclusions")
    public String inclusions;
    @JsonProperty("SpecialListingConditions")
    public ArrayList<String> specialListingConditions;
    @JsonProperty("CurrentFinancing")
    public ArrayList<String> currentFinancing;
    @JsonProperty("ConcessionComments")
    public String concessionComments;
    @JsonProperty("Directions")
    public String directions;
    @JsonProperty("ElementarySchool")
    public String elementarySchool;
    @JsonProperty("ElementarySchoolDistrict")
    public String elementarySchoolDistrict;
    @JsonProperty("MiddleOrJuniorSchool")
    public String middleOrJuniorSchool;
    @JsonProperty("MiddleOrJuniorSchoolDistrict")
    public String middleOrJuniorSchoolDistrict;
    @JsonProperty("HighSchool")
    public String highSchool;
    @JsonProperty("HighSchoolDistrict")
    public String highSchoolDistrict;
    @JsonProperty("AssociationAmenities")
    public ArrayList<String> associationAmenities;
    @JsonProperty("LandLeaseYN")
    public boolean landLeaseYN;
    @JsonProperty("LandLeaseAmount")
    public Long landLeaseAmount;
    @JsonProperty("LandLeaseAmountFrequency")
    public String landLeaseAmountFrequency;
    @JsonProperty("LandLeaseExpireactionDate")
    public String landLeaseExpireactionDate;
    @JsonProperty("HorseYN")
    public boolean horseYN;
    @JsonProperty("SeniorCommunityYN")
    public boolean seniorCommunityYN;
    @JsonProperty("PropertyAttachedYN")
    public boolean propertyAttachedYN;
    @JsonProperty("GarageYN")
    public boolean garageYN;
    @JsonProperty("Levels")
    public ArrayList<String> levels;
    @JsonProperty("LivingAreaSource")
    public String livingAreaSource;
    @JsonProperty("AboveGradeFinishedAreaSource")
    public String aboveGradeFinishedAreaSource;
    @JsonProperty("AboveGradeFinishedAreaUnits")
    public String aboveGradeFinishedAreaUnits;
    @JsonProperty("FoundationArea")
    public Long foundationArea;
    @JsonProperty("CoveredSpaces")
    public Long coveredSpaces;
    @JsonProperty("ParkingTotal")
    public Long parkingTotal;
    @JsonProperty("EntryLocation")
    public String entryLocation;
    @JsonProperty("BuilderName")
    public String builderName;
    @JsonProperty("BuilderModel")
    public String builderModel;
    @JsonProperty("InteriorFeatures")
    public ArrayList<String> interiorFeatures;
    @JsonProperty("DirectionFaces")
    public String directionFaces;
    @JsonProperty("GreenEnergyEfficient")
    public ArrayList<String> greenEnergyEfficient;
    @JsonProperty("Walkscore")
    public long walkscore;
    @JsonProperty("TaxLot")
    public String taxLot;
    @JsonProperty("TaxBlock")
    public String taxBlock;
    @JsonProperty("TaxTract")
    public String taxTract;
    @JsonProperty("TaxLegalDescription")
    public String taxLegalDescription;
    @JsonProperty("Media")
    public ArrayList<Media> media;
    @JsonProperty("Coordinates")  // need to be cross verify
    public ArrayList<Coordinates> coordinates;



    @JsonProperty("ListingInputOriginalMedia")   // need to be cross verify
    public String listingInputOriginalMedia;

    @JsonProperty("UnparsedAddress")
    public String unparsedAddress;
    @JsonProperty("City")
    public String city;
    @JsonProperty("CountyOrParish")
    public String countyOrParish;
    @JsonProperty("Country")
    public String country;
    @JsonProperty("PostalCode")
    public String postalCode;
    @JsonProperty("StateOrProvince")
    public String stateOrProvince;

    @JsonProperty("StreetNumber")
    public String streetNumber;
    @JsonProperty("StreetName")
    public String streetName;
    @JsonProperty("UnitNumber")
    public String unitNumber;
    @JsonProperty("Longitude")
    public Double longitude;
    @JsonProperty("Latitude")
    public Double latitude;
    @JsonProperty("Elevation")
    public Double elevation;
    @JsonProperty("ElevationUnits")
    public String elevationUnits;
    @JsonProperty("AdditionalParcelsDescription")
    public String additionalParcelsDescription;
    @JsonProperty("AnchorsCoTenants")
    public ArrayList<String> anchorsCoTenants;

    @JsonProperty("ApprovalStatus")
    public String approvalStatus;
    @JsonProperty("AssociationFee2")
    public Double associationFee2;
    @JsonProperty("AssociationFee2Frequency")
    public String associationFee2Frequency;
    @JsonProperty("AssociationFeeIncludes")
    public ArrayList<String> associationFeeIncludes;
    @JsonProperty("AssociationName2")
    public String associationName2;
    @JsonProperty("AssociationPhone")
    public String associationPhone;
    @JsonProperty("AssociationPhone2")
    public String associationPhone2;
    @JsonProperty("AvailabilityDate")
    public String availabilityDate;
    @JsonProperty("BathroomsFull")
    public Double bathroomsFull;
    @JsonProperty("BathroomsOneQuarter")
    public Double bathroomsOneQuarter;
    @JsonProperty("BathroomsPartial")
    public Double bathroomsPartial;
    @JsonProperty("BathroomsThreeQuarter")
    public Double bathroomsThreeQuarter;
    @JsonProperty("BathroomsTotalDecimal")
    public double bathroomsTotalDecimal;
    @JsonProperty("BelowGradeFinishedAreaSource")
    public String belowGradeFinishedAreaSource;
    @JsonProperty("BelowGradeFinishedAreaUnits")
    public String belowGradeFinishedAreaUnits;
    @JsonProperty("BodyType")
    public ArrayList<String> bodyType;
    @JsonProperty("BuildingAreaSource")
    public String buildingAreaSource;
    @JsonProperty("BuildingAreaTotal")
    public long buildingAreaTotal;
    @JsonProperty("BuildingAreaUnits")
    public String buildingAreaUnits;
    @JsonProperty("BuildingFeatures")
    public ArrayList<String> buildingFeatures;
    @JsonProperty("BuildingName")
    public String buildingName;
    @JsonProperty("BusinessName")
    public String businessName;
    @JsonProperty("BusinessType")
    public ArrayList<String> businessType;

    // Buyer Class//
    @JsonProperty("BuyerAgencyCompensation")
    public String buyerAgencyCompensation;
    @JsonProperty("BuyerAgencyCompensationType")
    public String buyerAgencyCompensationType;
    @JsonProperty("BuyerAgentAOR")
    public String buyerAgentAOR;
    @JsonProperty("BuyerAgentCellPhone")
    public String buyerAgentCellPhone;
    @JsonProperty("BuyerAgentDesignation")
    public ArrayList<String> buyerAgentDesignation;
    @JsonProperty("BuyerAgentDirectPhone")
    public String buyerAgentDirectPhone;
    @JsonProperty("BuyerAgentEmail")
    public String buyerAgentEmail;
    @JsonProperty("BuyerAgentFax")
    public String buyerAgentFax;
    @JsonProperty("BuyerAgentFirstName")
    public String buyerAgentFirstName;
    @JsonProperty("BuyerAgentFullName")
    public String buyerAgentFullName;
    @JsonProperty("BuyerAgentHomePhone")
    public String buyerAgentHomePhone;
    @JsonProperty("BuyerAgentKey")
    public String buyerAgentKey;
    @JsonProperty("BuyerAgentKeyNumeric")
    public String buyerAgentKeyNumeric;
    @JsonProperty("BuyerAgentLastName")
    public String buyerAgentLastName;
    @JsonProperty("BuyerAgentMiddleName")
    public String buyerAgentMiddleName;
    @JsonProperty("BuyerAgentMlsId")
    public String buyerAgentMlsId;
    @JsonProperty("BuyerAgentNamePrefix")
    public String buyerAgentNamePrefix;
    @JsonProperty("BuyerAgentNameSuffix")
    public String buyerAgentNameSuffix;
    @JsonProperty("BuyerAgentOfficePhone")
    public String buyerAgentOfficePhone;
    @JsonProperty("BuyerAgentOfficePhoneExt")
    public String buyerAgentOfficePhoneExt;
    @JsonProperty("BuyerAgentPager")
    public String buyerAgentPager;
    @JsonProperty("BuyerAgentPreferredPhone")
    public String buyerAgentPreferredPhone;
    @JsonProperty("BuyerAgentPreferredPhoneExt")
    public String buyerAgentPreferredPhoneExt;
    @JsonProperty("BuyerAgentStateLicense")
    public String buyerAgentStateLicense;
    @JsonProperty("BuyerAgentTollFreePhone")
    public String buyerAgentTollFreePhone;
    @JsonProperty("BuyerAgentURL")
    public String buyerAgentURL;
    @JsonProperty("BuyerAgentVoiceMail")
    public String buyerAgentVoiceMail;
    @JsonProperty("BuyerAgentVoiceMailExt")
    public String buyerAgentVoiceMailExt;
    @JsonProperty("BuyerOfficeAOR")
    public String buyerOfficeAOR;
    @JsonProperty("BuyerOfficeEmail")
    public String buyerOfficeEmail;
    @JsonProperty("BuyerOfficeFax")
    public String buyerOfficeFax;
    @JsonProperty("BuyerOfficeKey")
    public String buyerOfficeKey;
    @JsonProperty("BuyerOfficeKeyNumeric")
    public String buyerOfficeKeyNumeric;
    @JsonProperty("BuyerOfficeMlsId")
    public String buyerOfficeMlsId;
    @JsonProperty("BuyerOfficeName")
    public String buyerOfficeName;
    @JsonProperty("BuyerOfficePhone")
    public String buyerOfficePhone;
    @JsonProperty("BuyerOfficePhoneExt")
    public String buyerOfficePhoneExt;
    @JsonProperty("BuyerOfficeURL")
    public String buyerOfficeURL;
    @JsonProperty("BuyerTeamKey")
    public String buyerTeamKey;
    @JsonProperty("BuyerTeamKeyNumeric")
    public Long buyerTeamKeyNumeric;
    @JsonProperty("BuyerTeamName")
    public String buyerTeamName;
    @JsonProperty("CableTvExpense")
    public Double cableTvExpense;
    @JsonProperty("CapRate")
    public Double capRate;
    @JsonProperty("CarrierRoute")
    public String carrierRoute;
    @JsonProperty("CityRegion")
    public String cityRegion;

    // CoBuyer Class//
    @JsonProperty("CoBuyerAgentAOR")
    public String coBuyerAgentAOR;
    @JsonProperty("CoBuyerAgentCellPhone")
    public String coBuyerAgentCellPhone;
    @JsonProperty("CoBuyerAgentDesignation")
    public ArrayList<String> coBuyerAgentDesignation;
    @JsonProperty("CoBuyerAgentDirectPhone")
    public String coBuyerAgentDirectPhone;
    @JsonProperty("CoBuyerAgentEmail")
    public String coBuyerAgentEmail;
    @JsonProperty("CoBuyerAgentFax")
    public String coBuyerAgentFax;
    @JsonProperty("CoBuyerAgentFirstName")
    public String coBuyerAgentFirstName;
    @JsonProperty("CoBuyerAgentFullName")
    public String coBuyerAgentFullName;
    @JsonProperty("CoBuyerAgentHomePhone")
    public String coBuyerAgentHomePhone;
    @JsonProperty("CoBuyerAgentKey")
    public String coBuyerAgentKey;
    @JsonProperty("CoBuyerAgentKeyNumeric")
    public Long coBuyerAgentKeyNumeric;
    @JsonProperty("CoBuyerAgentLastName")
    public String coBuyerAgentLastName;
    @JsonProperty("CoBuyerAgentMiddleName")
    public String coBuyerAgentMiddleName;
    @JsonProperty("CoBuyerAgentMlsId")
    public String coBuyerAgentMlsId;
    @JsonProperty("CoBuyerAgentNamePrefix")
    public String coBuyerAgentNamePrefix;
    @JsonProperty("CoBuyerAgentNameSuffix")
    public String coBuyerAgentNameSuffix;
    @JsonProperty("CoBuyerAgentOfficePhone")
    public String coBuyerAgentOfficePhone;
    @JsonProperty("CoBuyerAgentOfficePhoneExt")
    public String coBuyerAgentOfficePhoneExt;
    @JsonProperty("CoBuyerAgentPager")
    public String coBuyerAgentPager;
    @JsonProperty("CoBuyerAgentPreferredPhone")
    public String coBuyerAgentPreferredPhone;
    @JsonProperty("CoBuyerAgentPreferredPhoneExt")
    public String coBuyerAgentPreferredPhoneExt;
    @JsonProperty("CoBuyerAgentStateLicense")
    public String coBuyerAgentStateLicense;
    @JsonProperty("CoBuyerAgentTollFreePhone")
    public String coBuyerAgentTollFreePhone;
    @JsonProperty("CoBuyerAgentURL")
    public String coBuyerAgentURL;
    @JsonProperty("CoBuyerAgentVoiceMail")
    public String coBuyerAgentVoiceMail;
    @JsonProperty("CoBuyerAgentVoiceMailExt")
    public String coBuyerAgentVoiceMailExt;
    @JsonProperty("CoBuyerOfficeAOR")
    public String coBuyerOfficeAOR;
    @JsonProperty("CoBuyerOfficeEmail")
    public String coBuyerOfficeEmail;
    @JsonProperty("CoBuyerOfficeFax")
    public String coBuyerOfficeFax;
    @JsonProperty("CoBuyerOfficeKey")
    public String coBuyerOfficeKey;
    @JsonProperty("CoBuyerOfficeKeyNumeric")
    public Long coBuyerOfficeKeyNumeric;
    @JsonProperty("CoBuyerOfficeMlsId")
    public String coBuyerOfficeMlsId;
    @JsonProperty("CoBuyerOfficeName")
    public String coBuyerOfficeName;
    @JsonProperty("CoBuyerOfficePhone")
    public String coBuyerOfficePhone;
    @JsonProperty("CoBuyerOfficePhoneExt")
    public String coBuyerOfficePhoneExt;
    @JsonProperty("CoBuyerOfficeURL")
    public String coBuyerOfficeURL;

    // CoListing Class//
    @JsonProperty("CoListAgentAOR")
    public String coListAgentAOR;
    @JsonProperty("CoListAgentCellPhone")
    public String coListAgentCellPhone;
    @JsonProperty("CoListAgentDesignation")
    public String coListAgentDesignation;
    @JsonProperty("CoListAgentDirectPhone")
    public String coListAgentDirectPhone;
    @JsonProperty("CoListAgentEmail")
    public String coListAgentEmail;
    @JsonProperty("CoListAgentFax")
    public String coListAgentFax;
    @JsonProperty("CoListAgentFirstName")
    public String coListAgentFirstName;
    @JsonProperty("CoListAgentFullName")
    public String coListAgentFullName;
    @JsonProperty("CoListAgentHomePhone")
    public String coListAgentHomePhone;
    @JsonProperty("CoListAgentKey")
    public String coListAgentKey;
    @JsonProperty("CoListAgentKeyNumeric")
    public Long coListAgentKeyNumeric;
    @JsonProperty("CoListAgentLastName")
    public String coListAgentLastName;
    @JsonProperty("CoListAgentMiddleName")
    public String coListAgentMiddleName;
    @JsonProperty("CoListAgentMlsId")
    public String coListAgentMlsId;
    @JsonProperty("CoListAgentNamePrefix")
    public String coListAgentNamePrefix;
    @JsonProperty("CoListAgentNameSuffix")
    public String coListAgentNameSuffix;
    @JsonProperty("CoListAgentOfficePhone")
    public String coListAgentOfficePhone;
    @JsonProperty("CoListAgentOfficePhoneExt")
    public String coListAgentOfficePhoneExt;
    @JsonProperty("CoListAgentPager")
    public String coListAgentPager;
    @JsonProperty("CoListAgentPreferredPhone")
    public String coListAgentPreferredPhone;
    @JsonProperty("CoListAgentPreferredPhoneExt")
    public String coListAgentPreferredPhoneExt;
    @JsonProperty("CoListAgentStateLicense")
    public String coListAgentStateLicense;
    @JsonProperty("CoListAgentTollFreePhone")
    public String coListAgentTollFreePhone;
    @JsonProperty("CoListAgentURL")
    public String coListAgentURL;
    @JsonProperty("CoListAgentVoiceMail")
    public String coListAgentVoiceMail;
    @JsonProperty("CoListAgentVoiceMailExt")
    public String coListAgentVoiceMailExt;
    @JsonProperty("CoListOfficeAOR")
    public String coListOfficeAOR;
    @JsonProperty("CoListOfficeEmail")
    public String coListOfficeEmail;
    @JsonProperty("CoListOfficeFax")
    public String coListOfficeFax;
    @JsonProperty("CoListOfficeKey")
    public String coListOfficeKey;
    @JsonProperty("CoListOfficeKeyNumeric")
    public Long coListOfficeKeyNumeric;
    @JsonProperty("CoListOfficeMlsId")
    public String coListOfficeMlsId;
    @JsonProperty("CoListOfficeName")
    public String coListOfficeName;
    @JsonProperty("CoListOfficePhone")
    public String coListOfficePhone;
    @JsonProperty("CoListOfficePhoneExt")
    public String coListOfficePhoneExt;
    @JsonProperty("CoListOfficeURL")
    public String coListOfficeURL;



    @JsonProperty("CommonWalls")
    public ArrayList<String> commonWalls;

    // Conession Class//
    @JsonProperty("Concessions")
    public String concessions;
    @JsonProperty("ConcessionsAmount")
    public Double concessionsAmount;
    @JsonProperty("ConcessionsComments")
    public String concessionsComments;

    @JsonProperty("ContinentRegion")
    public String continentRegion;
    @JsonProperty("CoolingYN")
    public boolean coolingYN;
    @JsonProperty("CountryRegion")
    public String countryRegion;
    @JsonProperty("CropsIncludedYN")
    public Boolean cropsIncludedYN;
    @JsonProperty("CrossStreet")
    public String crossStreet;
    @JsonProperty("CultivatedArea")
    public Double cultivatedArea;
    @JsonProperty("CumulativeDaysOnMarket")
    public Double cumulativeDaysOnMarket;

    @JsonProperty("CurrentUse")
    public ArrayList<String> currentUse;
    @JsonProperty("DOH1")
    public String dOH1;
    @JsonProperty("DOH2")
    public String dOH2;
    @JsonProperty("DOH3")
    public String dOH3;


    ///Development status
    @JsonProperty("DevelopmentStatus")
    public ArrayList<String> developmentStatus;
    @JsonProperty("DistanceToBusComments")
    public String distanceToBusComments;
    @JsonProperty("DistanceToBusNumeric")
    public Double distanceToBusNumeric;
    @JsonProperty("DistanceToBusUnits")
    public String distanceToBusUnits;
    @JsonProperty("DistanceToElectricComments")
    public String distanceToElectricComments;
    @JsonProperty("DistanceToElectricNumeric")
    public Double distanceToElectricNumeric;
    @JsonProperty("DistanceToElectricUnits")
    public String distanceToElectricUnits;
    @JsonProperty("DistanceToFreewayComments")
    public String distanceToFreewayComments;
    @JsonProperty("DistanceToFreewayNumeric")
    public Double distanceToFreewayNumeric;
    @JsonProperty("DistanceToFreewayUnits")
    public String distanceToFreewayUnits;
    @JsonProperty("DistanceToGasComments")
    public String distanceToGasComments;
    @JsonProperty("DistanceToGasNumeric")
    public Double distanceToGasNumeric;
    @JsonProperty("DistanceToGasUnits")
    public String distanceToGasUnits;
    @JsonProperty("DistanceToPhoneServiceComments")
    public String distanceToPhoneServiceComments;
    @JsonProperty("DistanceToPhoneServiceNumeric")
    public Double distanceToPhoneServiceNumeric;
    @JsonProperty("DistanceToPhoneServiceUnits")
    public String distanceToPhoneServiceUnits;
    @JsonProperty("DistanceToPlaceofWorshipComments")
    public String distanceToPlaceofWorshipComments;
    @JsonProperty("DistanceToPlaceofWorshipNumeric")
    public Double distanceToPlaceofWorshipNumeric;
    @JsonProperty("DistanceToPlaceofWorshipUnits")
    public String distanceToPlaceofWorshipUnits;
    @JsonProperty("DistanceToSchoolBusComments")
    public String distanceToSchoolBusComments;
    @JsonProperty("DistanceToSchoolBusNumeric")
    public Double distanceToSchoolBusNumeric;
    @JsonProperty("DistanceToSchoolBusUnits")
    public String distanceToSchoolBusUnits;
    @JsonProperty("DistanceToSchoolsComments")
    public String distanceToSchoolsComments;
    @JsonProperty("DistanceToSchoolsNumeric")
    public Double distanceToSchoolsNumeric;
    @JsonProperty("DistanceToSchoolsUnits")
    public String distanceToSchoolsUnits;
    @JsonProperty("DistanceToSewerComments")
    public String distanceToSewerComments;
    @JsonProperty("DistanceToSewerNumeric")
    public Double distanceToSewerNumeric;
    @JsonProperty("DistanceToSewerUnits")
    public String distanceToSewerUnits;
    @JsonProperty("DistanceToShoppingComments")
    public String distanceToShoppingComments;

    @JsonProperty("DistanceToShoppingNumeric")
    public Double distanceToShoppingNumeric;
    @JsonProperty("DistanceToShoppingUnits")
    public String distanceToShoppingUnits;
    @JsonProperty("DistanceToStreetComments")
    public String distanceToStreetComments;
    @JsonProperty("DistanceToStreetNumeric")
    public Double distanceToStreetNumeric;
    @JsonProperty("DistanceToStreetUnits")
    public String distanceToStreetUnits;
    @JsonProperty("DistanceToWaterComments")
    public String distanceToWaterComments;
    @JsonProperty("DistanceToWaterNumeric")
    public Double distanceToWaterNumeric;
    @JsonProperty("DistanceToWaterUnits")
    public String distanceToWaterUnits;
    @JsonProperty("DocumentsAvailable")
    public ArrayList<String> documentsAvailable;
    @JsonProperty("DocumentsChangeTimestamp")
    public String documentsChangeTimestamp;
    @JsonProperty("DocumentsCount")
    public Long documentsCount;
    @JsonProperty("DoorFeatures")
    public ArrayList<String> doorFeatures;

    // Electric Class//
    @JsonProperty("Electric")
    public ArrayList<String> electric;
    @JsonProperty("ElectricExpense")
    public Double electricExpense;
    @JsonProperty("ElectricOnPropertyYN")
    public boolean electricOnPropertyYN;
    @JsonProperty("EntryLevel")
    public Long entryLevel;

    @JsonProperty("ExistingLeaseType")
    public ArrayList<String> existingLeaseType;
    @JsonProperty("FarmCreditServiceInclYN")
    public Boolean farmCreditServiceInclYN;
    @JsonProperty("FarmLandAreaSource")
    public String farmLandAreaSource;
    @JsonProperty("FarmLandAreaUnits")
    public String farmLandAreaUnits;
    @JsonProperty("Fencing")
    public ArrayList<String> fencing;
    @JsonProperty("FireplaceYN")
    public boolean fireplaceYN;
    @JsonProperty("FuelExpense")
    public Double fuelExpense;

    @JsonProperty("Furnished")
    public String furnished;

    @JsonProperty("FurnitureReplacementExpense")
    public Double furnitureReplacementExpense;
    @JsonProperty("GardnerExpense")
    public Double gardnerExpense;
    @JsonProperty("GrazingPermitsBlmYN")
    public Boolean grazingPermitsBlmYN;
    @JsonProperty("GrazingPermitsForestServiceYN")
    public Boolean grazingPermitsForestServiceYN;
    @JsonProperty("GrazingPermitsPrivateYN")
    public Boolean grazingPermitsPrivateYN;
    @JsonProperty("GreenEnergyGeneration")
    public ArrayList<String> greenEnergyGeneration;
    @JsonProperty("GreenIndoorAirQuality")
    public  ArrayList<String> greenIndoorAirQuality;
    @JsonProperty("GreenLocation")
    public  ArrayList<String> greenLocation;
    @JsonProperty("GreenSustainability")
    public  ArrayList<String> greenSustainability;
    @JsonProperty("GreenWaterConservation")
    public  ArrayList<String> greenWaterConservation;
    @JsonProperty("GrossIncome")
    public Double grossIncome;
    @JsonProperty("GrossScheduledIncome")
    public Double grossScheduledIncome;
    @JsonProperty("HabitableResidenceYN")
    public Boolean habitableResidenceYN;
    @JsonProperty("HeatingYN")
    public Boolean heatingYN;
    @JsonProperty("HorseAmenities")
    public ArrayList<String> horseAmenities;
    @JsonProperty("HoursDaysOfOperation")
    public ArrayList<String> hoursDaysOfOperation;
    @JsonProperty("HoursDaysofOperationDescription")
    public String hoursDaysofOperationDescription;
    @JsonProperty("IncomeIncludes")
    public ArrayList<String> incomeIncludes;
    @JsonProperty("InsuranceExpense")
    public Double insuranceExpense;
    @JsonProperty("IrrigationSource")
    public ArrayList<String> irrigationSource;
    @JsonProperty("IrrigationWaterRightsAcres")
    public Double irrigationWaterRightsAcres;

    ////////////////////
    @JsonProperty("IrrigationWaterRightsYN")
    public Boolean irrigationWaterRightsYN;
    @JsonProperty("LaborInformation")
    public ArrayList<String> laborInformation;
    @JsonProperty("LandLeaseExpirationDate")
    public String landLeaseExpirationDate;
    @JsonProperty("LeasableArea")
    public Double leasableArea;
    @JsonProperty("LeasableAreaUnits")
    public String leasableAreaUnits;
    @JsonProperty("LeaseAmount")
    public Double leaseAmount;
    @JsonProperty("LeaseAmountFrequency")
    public String leaseAmountFrequency;
    @JsonProperty("LeaseAssignableYN")
    public Boolean leaseAssignableYN;
    @JsonProperty("LeaseExpiration")
    public String leaseExpiration;
    @JsonProperty("LeaseRenewalCompensation")
    public ArrayList<String> leaseRenewalCompensation;
    @JsonProperty("LeaseRenewalOptionYN")
    public Boolean leaseRenewalOptionYN;
    @JsonProperty("LeaseTerm")
    public String leaseTerm;
    @JsonProperty("License1")
    public String license1;
    @JsonProperty("License2")
    public String license2;
    @JsonProperty("License3")
    public String license3;
    @JsonProperty("LicensesExpense")
    public Double licensesExpense;

    // listAgent class
    @JsonProperty("ListAOR")
    public String listAOR;
    @JsonProperty("ListAgentAOR")
    public String listAgentAOR;

    @JsonProperty("ListAgentCellPhone")
    public String listAgentCellPhone;
    @JsonProperty("ListAgentDesignation")
    public ArrayList<String> listAgentDesignation;
    @JsonProperty("ListAgentDirectPhone")
    public String listAgentDirectPhone;
    @JsonProperty("ListAgentEmail")
    public String listAgentEmail;
    @JsonProperty("ListAgentFax")
    public String listAgentFax;
    @JsonProperty("ListAgentFirstName")
    public String listAgentFirstName;
    @JsonProperty("ListAgentFullName")
    public String listAgentFullName;
    @JsonProperty("ListAgentHomePhone")
    public String listAgentHomePhone;
    @JsonProperty("ListAgentKey")
    public String listAgentKey;
    @JsonProperty("ListAgentKeyNumeric")
    public Double listAgentKeyNumeric;
    @JsonProperty("ListAgentLastName")
    public String listAgentLastName;
    @JsonProperty("ListAgentMiddleName")
    public String listAgentMiddleName;
    @JsonProperty("ListAgentMlsId")
    public String listAgentMlsId;
    @JsonProperty("ListAgentNamePrefix")
    public String listAgentNamePrefix;
    @JsonProperty("ListAgentNameSuffix")
    public String listAgentNameSuffix;
    @JsonProperty("ListAgentOfficePhone")
    public String listAgentOfficePhone;
    @JsonProperty("ListAgentOfficePhoneExt")
    public String listAgentOfficePhoneExt;
    @JsonProperty("ListAgentPager")
    public String listAgentPager;
    @JsonProperty("ListAgentPreferredPhone")
    public String listAgentPreferredPhone;
    @JsonProperty("ListAgentPreferredPhoneExt")
    public String listAgentPreferredPhoneExt;
    @JsonProperty("ListAgentStateLicense")
    public String listAgentStateLicense;
    @JsonProperty("ListAgentTollFreePhone")
    public String listAgentTollFreePhone;
    @JsonProperty("ListAgentURL")
    public String listAgentURL;
    @JsonProperty("ListAgentVoiceMail")
    public String listAgentVoiceMail;
    @JsonProperty("ListAgentVoiceMailExt")
    public String listAgentVoiceMailExt;
    @JsonProperty("ListOfficeAOR")
    public String listOfficeAOR;
    @JsonProperty("ListOfficeEmail")
    public String listOfficeEmail;
    @JsonProperty("ListOfficeFax")
    public String listOfficeFax;
    @JsonProperty("ListOfficeKey")
    public String listOfficeKey;
    @JsonProperty("ListOfficeKeyNumeric")
    public Double listOfficeKeyNumeric;
    @JsonProperty("ListOfficeMlsId")
    public String listOfficeMlsId;
    @JsonProperty("ListOfficeName")
    public String listOfficeName;
    @JsonProperty("ListOfficePhone")
    public String listOfficePhone;
    @JsonProperty("ListOfficePhoneExt")
    public String listOfficePhoneExt;
    @JsonProperty("ListOfficeURL")
    public String listOfficeURL;
    @JsonProperty("ListPriceLow")
    public Double listPriceLow;
    @JsonProperty("ListTeamKey")
    public String listTeamKey;
    @JsonProperty("ListTeamKeyNumeric")
    public Double listTeamKeyNumeric;
    @JsonProperty("ListTeamName")
    public String listTeamName;
    @JsonProperty("ListingAgreement")
    public String listingAgreement;
    @JsonProperty("ListingKeyNumeric")
    public Double listingKeyNumeric;
    @JsonProperty("LotDimensionsSource")
    public String lotDimensionsSource;
    @JsonProperty("LotSizeArea")
    public Double lotSizeArea;
    @JsonProperty("LotSizeUnits")
    public String lotSizeUnits;
    @JsonProperty("MLSAreaMajor")
    public String mLSAreaMajor;
    @JsonProperty("MLSAreaMinor")
    public String mLSAreaMinor;

    @JsonProperty("MainLevelBedrooms")
    public Long mainLevelBedrooms;
    @JsonProperty("MaintenanceExpense")
    public Double maintenanceExpense;
    @JsonProperty("MajorChangeTimestamp")
    public String majorChangeTimestamp;
    @JsonProperty("Make")
    public String make;
    @JsonProperty("ManagerExpense")
    public Double managerExpense;
    @JsonProperty("MapCoordinate")
    public String mapCoordinate;
    @JsonProperty("MapCoordinateSource")
    public String mapCoordinateSource;
    @JsonProperty("MapURL")
    public String mapURL;
    @JsonProperty("MobileDimUnits")
    public String mobileDimUnits;
    @JsonProperty("MobileHomeRemainsYN")
    public Boolean mobileHomeRemainsYN;
    @JsonProperty("MobileLength")
    public Double mobileLength;
    @JsonProperty("MobileWidth")
    public Double mobileWidth;
    @JsonProperty("Model")
    public String dto;
    @JsonProperty("NetOperatingIncome")
    public Double netOperatingIncome;
    @JsonProperty("NewTaxesExpense")
    public Double newTaxesExpense;
    @JsonProperty("NumberOfBuildings")
    public Long numberOfBuildings;
    @JsonProperty("NumberOfFullTimeEmployees")
    public Long numberOfFullTimeEmployees;
    @JsonProperty("NumberOfLots")
    public Long numberOfLots;
    @JsonProperty("NumberOfPads")
    public Long numberOfPads;
    @JsonProperty("NumberOfPartTimeEmployees")
    public Long numberOfPartTimeEmployees;
    @JsonProperty("NumberOfSeparateElectricMeters")
    public Long numberOfSeparateElectricMeters;
    @JsonProperty("NumberOfSeparateGasMeters")
    public Long numberOfSeparateGasMeters;
    @JsonProperty("NumberOfSeparateWaterMeters")
    public Long numberOfSeparateWaterMeters;
    @JsonProperty("NumberOfUnitsInCommunity")
    public Long numberOfUnitsInCommunity;
    @JsonProperty("NumberOfUnitsLeased")
    public Long numberOfUnitsLeased;
    @JsonProperty("NumberOfUnitsMoMo")
    public Long numberOfUnitsMoMo;
    @JsonProperty("NumberOfUnitsVacant")
    public Long numberOfUnitsVacant;
    @JsonProperty("OffMarketTimestamp")
    public String offMarketTimestamp;
    @JsonProperty("OnMarketTimestamp")
    public String onMarketTimestamp;
    @JsonProperty("OpenParkingSpaces")
    public Long openParkingSpaces;
    @JsonProperty("OperatingExpense")
    public Double operatingExpense;
    @JsonProperty("OperatingExpenseIncludes")
    public ArrayList<String> operatingExpenseIncludes;
    @JsonProperty("OriginatingSystemID")
    public String originatingSystemID;
    @JsonProperty("OriginatingSystemName")
    public String originatingSystemName;
    @JsonProperty("OtherEquipment")
    public ArrayList<String> otherEquipment;

    @JsonProperty("OtherExpense")
    public Double otherExpense;
    @JsonProperty("OtherParking")
    public String otherParking;
    @JsonProperty("OwnerName")
    public String ownerName;
    @JsonProperty("OwnerPays")
    public ArrayList<String> ownerPays;
    @JsonProperty("OwnerPhone")
    public String ownerPhone;
    @JsonProperty("OwnershipType")
    public String ownershipType;
    @JsonProperty("ParkManagerName")
    public String parkManagerName;
    @JsonProperty("ParkManagerPhone")
    public String parkManagerPhone;
    @JsonProperty("ParkName")
    public String parkName;
    @JsonProperty("ParkingFeatures")
    public ArrayList<String> parkingFeatures;
    @JsonProperty("PastureArea")
    public Double pastureArea;
    @JsonProperty("PestControlExpense")
    public Double pestControlExpense;
    @JsonProperty("PhotosChangeTimestamp")
    public String photosChangeTimestamp;
    @JsonProperty("PoolExpense")
    public Double poolExpense;
    @JsonProperty("PossibleUse")
    public ArrayList<String> possibleUse;
    @JsonProperty("PostalCity")
    public String postalCity;
    @JsonProperty("PostalCodePlus4")
    public String postalCodePlus4;
    @JsonProperty("ProfessionalManagementExpense")
    public Double professionalManagementExpense;
    @JsonProperty("PropertyCondition")
    public ArrayList<String> propertyCondition;
    @JsonProperty("PublicSurveyRange")
    public String publicSurveyRange;
    @JsonProperty("PublicSurveySection")
    public String publicSurveySection;
    @JsonProperty("PublicSurveyTownship")
    public String publicSurveyTownship;
    @JsonProperty("RVParkingDimensions")
    public String rVParkingDimensions;
    @JsonProperty("RangeArea")
    public Double rangeArea;
    @JsonProperty("RentControlYN")
    public Boolean rentControlYN;
    @JsonProperty("RentIncludes")
    public ArrayList<String> rentIncludes;
    @JsonProperty("SeatingCapacity")
    public Long seatingCapacity;
    @JsonProperty("SecurityFeatures")
    public ArrayList<String> securityFeatures;
    @JsonProperty("SerialU")
    public String serialU;
    @JsonProperty("SerialX")
    public String serialX;
    @JsonProperty("SerialXX")
    public String serialXX;
    @JsonProperty("ShowingContactPhoneExt")
    public String showingContactPhoneExt;
    @JsonProperty("Skirt")
    public ArrayList<String> skirt;

    // source
    @JsonProperty("SourceSystemID")
    public String sourceSystemID;
    @JsonProperty("SourceSystemKey")
    public String sourceSystemKey;
    @JsonProperty("SourceSystemName")
    public String sourceSystemName;
    @JsonProperty("SpaFeatures")
    public ArrayList<String> spaFeatures;
    @JsonProperty("SpecialLicenses")
    public  ArrayList<String> specialLicenses;
    @JsonProperty("StateRegion")
    public String stateRegion;
    @JsonProperty("StreetAdditionalInfo")
    public String streetAdditionalInfo;
    @JsonProperty("StreetDirPrefix")
    public String streetDirPrefix;
    @JsonProperty("StreetDirSuffix")
    public String streetDirSuffix;
    @JsonProperty("StreetNumberNumeric")
    public Long streetNumberNumeric;
    @JsonProperty("StreetSuffix")
    public String streetSuffix;
    @JsonProperty("StreetSuffixModifier")
    public String streetSuffixModifier;
    @JsonProperty("StructureType")
    public ArrayList<String> structureType;

    @JsonProperty("SubAgencyCompensation")
    public String subAgencyCompensation;
    @JsonProperty("SubAgencyCompensationType")
    public String subAgencyCompensationType;
    @JsonProperty("SuppliesExpense")
    public Double suppliesExpense;
    @JsonProperty("SyndicationRemarks")
    public String syndicationRemarks;
    @JsonProperty("TaxBookNumber")
    public String taxBookNumber;
    @JsonProperty("TaxExemptions")
    public ArrayList<String> taxExemptions;
    @JsonProperty("TaxMapNumber")
    public String taxMapNumber;
    @JsonProperty("TaxOtherAnnualAssessmentAmount")
    public Double taxOtherAnnualAssessmentAmount;
    @JsonProperty("TaxParcelLetter")
    public String taxParcelLetter;
    @JsonProperty("TenantPays")
    public ArrayList<String> tenantPays;
    @JsonProperty("Topography")
    public String topography;
    @JsonProperty("TotalActualRent")
    public Double totalActualRent;
    @JsonProperty("Township")
    public String township;
    @JsonProperty("TransactionBrokerCompensation")
    public String transactionBrokerCompensation;
    @JsonProperty("TransactionBrokerCompensationType")
    public String transactionBrokerCompensationType;
    @JsonProperty("TrashExpense")
    public Double trashExpense;
    @JsonProperty("UnitsFurnished")
    public String unitsFurnished;
    @JsonProperty("Utilities")
    public ArrayList<String> utilities;
    @JsonProperty("VacancyAllowance")
    public Double vacancyAllowance;
    @JsonProperty("VacancyAllowanceRate")
    public Double vacancyAllowanceRate;
    @JsonProperty("Vegetation")
    public ArrayList<String> vegetation;
    @JsonProperty("VideosChangeTimestamp")
    public String videosChangeTimestamp;
    @JsonProperty("VideosCount")
    public Long videosCount;
    @JsonProperty("VirtualTourURLBranded")
    public String virtualTourURLBranded;
    @JsonProperty("VirtualTourURLUnbranded")
    public String virtualTourURLUnbranded;
    @JsonProperty("WalkScore")
    public Double walkScore;
    @JsonProperty("WaterBodyName")
    public String waterBodyName;
    @JsonProperty("WaterSewerExpense")
    public Double waterSewerExpense;
    @JsonProperty("WaterfrontFeatures")
    public ArrayList<String> waterfrontFeatures;
    @JsonProperty("WindowFeatures")
    public ArrayList<String> windowFeatures;
    @JsonProperty("WoodedArea")
    public Double woodedArea;
    @JsonProperty("WorkmansCompensationExpense")
    public Double workmansCompensationExpense;
    @JsonProperty("YearEstablished")
    public Long yearEstablished;
    @JsonProperty("YearsCurrentOwner")
    public Long yearsCurrentOwner;
    @JsonProperty("IDXParticipationYN")
    public boolean iDXParticipationYN;
    @JsonProperty("url")
    public String url;

*/

    @JsonProperty("StreetDirPrefix")
    public Object streetDirPrefix;
    @JsonProperty("DistanceToStreetComments")
    public Object distanceToStreetComments;
    @JsonProperty("PublicSurveyRange")
    public Object publicSurveyRange;
    @JsonProperty("LeaseAssignableYN")
    public Object leaseAssignableYN;
    @JsonProperty("GreenWaterConservation")
    public ArrayList<Object> greenWaterConservation;
    @JsonProperty("NumberOfUnitsMoMo")
    public Object numberOfUnitsMoMo;
    @JsonProperty("LivingAreaUnits")
    public String livingAreaUnits;
    @JsonProperty("CoListAgentCellPhone")
    public Object coListAgentCellPhone;
    @JsonProperty("SeatingCapacity")
    public Object seatingCapacity;
    @JsonProperty("TaxLegalDescription")
    public String taxLegalDescription;
    @JsonProperty("LockBoxLocation")
    public String lockBoxLocation;
    @JsonProperty("BuyerAgentDesignation")
    public ArrayList<Object> buyerAgentDesignation;
    @JsonProperty("YearEstablished")
    public Object yearEstablished;
    @JsonProperty("BuyerTeamKey")
    public Object buyerTeamKey;
    @JsonProperty("ListPriceLow")
    public Object listPriceLow;
    @JsonProperty("ContingentDate")
    public String contingentDate;
    @JsonProperty("LaundryFeatures")
    public ArrayList<String> laundryFeatures;
    @JsonProperty("Flooring")
    public ArrayList<String> flooring;
    @JsonProperty("PhotosCount")
    public int photosCount;
    @JsonProperty("FireplacesTotal")
    public int fireplacesTotal;
    @JsonProperty("ListTeamKey")
    public Object listTeamKey;
    @JsonProperty("AdditionalParcelsYN")
    public boolean additionalParcelsYN;
    @JsonProperty("CoBuyerAgentDirectPhone")
    public Object coBuyerAgentDirectPhone;
    @JsonProperty("WaterfrontFeatures")
    public ArrayList<Object> waterfrontFeatures;
    @JsonProperty("PastureArea")
    public Object pastureArea;
    @JsonProperty("SubAgencyCompensation")
    public Object subAgencyCompensation;
    @JsonProperty("ViewYN")
    public boolean viewYN;
    @JsonProperty("SeniorCommunityYN")
    public boolean seniorCommunityYN;
    @JsonProperty("Cooling")
    public ArrayList<String> cooling;
    @JsonProperty("ExteriorFeatures")
    public ArrayList<String> exteriorFeatures;
    @JsonProperty("CountryRegion")
    public Object countryRegion;
    @JsonProperty("OtherParking")
    public Object otherParking;
    @JsonProperty("IrrigationWaterRightsAcres")
    public Object irrigationWaterRightsAcres;
    @JsonProperty("SourceSystemID")
    public Object sourceSystemID;
    @JsonProperty("StatusChangeTimestamp")
    public Date statusChangeTimestamp;
    @JsonProperty("SecurityFeatures")
    public ArrayList<Object> securityFeatures;
    @JsonProperty("BuyerAgentFullName")
    public Object buyerAgentFullName;
    @JsonProperty("RVParkingDimensions")
    public Object rVParkingDimensions;
    @JsonProperty("CoBuyerAgentDesignation")
    public ArrayList<Object> coBuyerAgentDesignation;
    @JsonProperty("CoBuyerAgentNamePrefix")
    public Object coBuyerAgentNamePrefix;
    @JsonProperty("CoBuyerAgentLastName")
    public Object coBuyerAgentLastName;
    @JsonProperty("PrivateOfficeRemarks")
    public String privateOfficeRemarks;
    @JsonProperty("DocumentsCount")
    public int documentsCount;
    @JsonProperty("CancelationDate")
    public Object cancelationDate;
    @JsonProperty("AssociationName")
    public String associationName;
    @JsonProperty("DistanceToBusComments")
    public Object distanceToBusComments;
    @JsonProperty("TaxExemptions")
    public ArrayList<Object> taxExemptions;
    @JsonProperty("CoListAgentURL")
    public Object coListAgentURL;
    @JsonProperty("BuildingName")
    public String buildingName;
    @JsonProperty("YearsCurrentOwner")
    public Object yearsCurrentOwner;
    @JsonProperty("DistanceToSchoolsComments")
    public Object distanceToSchoolsComments;
    @JsonProperty("ListAgentPreferredPhoneExt")
    public Object listAgentPreferredPhoneExt;
    @JsonProperty("AssociationFeeFrequency")
    public String associationFeeFrequency;
    @JsonProperty("CrossStreet")
    public Object crossStreet;
    @JsonProperty("OccupantPhone")
    public String occupantPhone;
    @JsonProperty("HeatingYN")
    public boolean heatingYN;
    @JsonProperty("CoBuyerAgentStateLicense")
    public Object coBuyerAgentStateLicense;
    @JsonProperty("WaterBodyName")
    public Object waterBodyName;
    @JsonProperty("ManagerExpense")
    public Object managerExpense;
    @JsonProperty("DistanceToSewerNumeric")
    public Object distanceToSewerNumeric;
    @JsonProperty("DistanceToGasComments")
    public Object distanceToGasComments;
    @JsonProperty("CoBuyerAgentMiddleName")
    public Object coBuyerAgentMiddleName;
    @JsonProperty("AboveGradeFinishedArea")
    public int aboveGradeFinishedArea;
    @JsonProperty("BuyerAgentFax")
    public Object buyerAgentFax;
    @JsonProperty("MajorChangeType")
    public String majorChangeType;
    @JsonProperty("ListingKeyNumeric")
    public Object listingKeyNumeric;
    @JsonProperty("Appliances")
    public ArrayList<String> appliances;
    @JsonProperty("MLSAreaMajor")
    public Object mLSAreaMajor;
    @JsonProperty("TaxAnnualAmount")
    public int taxAnnualAmount;
    @JsonProperty("LandLeaseAmount")
    public long landLeaseAmount;
    @JsonProperty("CoBuyerAgentPreferredPhoneExt")
    public Object coBuyerAgentPreferredPhoneExt;
    @JsonProperty("CoListAgentPreferredPhone")
    public Object coListAgentPreferredPhone;
    @JsonProperty("CurrentUse")
    public ArrayList<Object> currentUse;
    @JsonProperty("OriginatingSystemKey")
    public String originatingSystemKey;
    @JsonProperty("CountyOrParish")
    public String countyOrParish;
    @JsonProperty("PropertyType")
    public String propertyType;
    @JsonProperty("BathroomsTotalDecimal")
    public double bathroomsTotalDecimal;
    @JsonProperty("NumberOfPads")
    public Object numberOfPads;
    @JsonProperty("TaxParcelLetter")
    public Object taxParcelLetter;
    @JsonProperty("OriginatingSystemName")
    public Object originatingSystemName;
    @JsonProperty("AssociationYN")
    public boolean associationYN;
    @JsonProperty("MlsStatus")
    public String mlsStatus;
    @JsonProperty("CarrierRoute")
    public Object carrierRoute;
    @JsonProperty("BuyerOfficeURL")
    public Object buyerOfficeURL;
    @JsonProperty("StreetNumber")
    public String streetNumber;
    @JsonProperty("GrossScheduledIncome")
    public Object grossScheduledIncome;
    @JsonProperty("LeaseTerm")
    public Object leaseTerm;
    @JsonProperty("ListingKey")
    public String listingKey;
    @JsonProperty("CoBuyerAgentNameSuffix")
    public Object coBuyerAgentNameSuffix;
    @JsonProperty("CoListAgentNamePrefix")
    public Object coListAgentNamePrefix;
    @JsonProperty("AssociationPhone2")
    public String associationPhone2;
    @JsonProperty("CommonWalls")
    public ArrayList<String> commonWalls;
    @JsonProperty("ListAgentVoiceMail")
    public Object listAgentVoiceMail;
    @JsonProperty("CommonInterest")
    public Object commonInterest;
    @JsonProperty("ListAgentKeyNumeric")
    public Object listAgentKeyNumeric;
    @JsonProperty("CoListAgentLastName")
    public Object coListAgentLastName;
    @JsonProperty("ShowingContactType")
    public ArrayList<String> showingContactType;
    @JsonProperty("CoBuyerAgentMobilePhone")
    public Object coBuyerAgentMobilePhone;
    @JsonProperty("Vegetation")
    public ArrayList<Object> vegetation;
    @JsonProperty("IrrigationWaterRightsYN")
    public Object irrigationWaterRightsYN;
    @JsonProperty("BuyerAgentMiddleName")
    public Object buyerAgentMiddleName;
    @JsonProperty("ElementarySchool")
    public String elementarySchool;
    @JsonProperty("DistanceToFreewayComments")
    public Object distanceToFreewayComments;
    @JsonProperty("StreetDirSuffix")
    public Object streetDirSuffix;
    @JsonProperty("DistanceToSchoolsNumeric")
    public Object distanceToSchoolsNumeric;
    @JsonProperty("CoBuyerOfficePhone")
    public Object coBuyerOfficePhone;
    @JsonProperty("CoListOfficePhoneExt")
    public Object coListOfficePhoneExt;
    @JsonProperty("ListAgentFirstName")
    public String listAgentFirstName;
    @JsonProperty("DistanceToShoppingNumeric")
    public Object distanceToShoppingNumeric;
    @JsonProperty("TaxMapNumber")
    public Object taxMapNumber;
    @JsonProperty("Directions")
    public String directions;
    @JsonProperty("Concessions")
    public String concessions;
    @JsonProperty("AttachedGarageYN")
    public boolean attachedGarageYN;
    @JsonProperty("OnMarketTimestamp")
    public Object onMarketTimestamp;
    @JsonProperty("DistanceToBusNumeric")
    public Object distanceToBusNumeric;
    @JsonProperty("StandardStatus")
    public String standardStatus;
    @JsonProperty("CultivatedArea")
    public Object cultivatedArea;
    @JsonProperty("Roof")
    public ArrayList<String> roof;
    @JsonProperty("BuyerAgentNamePrefix")
    public Object buyerAgentNamePrefix;
    @JsonProperty("ParkingTotal")
    public int parkingTotal;
    @JsonProperty("ContinentRegion")
    public Object continentRegion;
    @JsonProperty("ListAgentOfficePhone")
    public Object listAgentOfficePhone;
    @JsonProperty("ListAgentHomePhone")
    public Object listAgentHomePhone;
    @JsonProperty("BuyerTeamName")
    public Object buyerTeamName;
    @JsonProperty("CoListOfficeKeyNumeric")
    public Object coListOfficeKeyNumeric;
    @JsonProperty("DistanceToElectricUnits")
    public Object distanceToElectricUnits;
    @JsonProperty("PoolPrivateYN")
    public boolean poolPrivateYN;
    @JsonProperty("PropertyUniversalID")
    public Object propertyUniversalID;
    @JsonProperty("AdditionalParcelsDescription")
    public Object additionalParcelsDescription;
    @JsonProperty("Township")
    public Object township;
    @JsonProperty("ListingTerms")
    public ArrayList<String> listingTerms;
    @JsonProperty("NumberOfUnitsLeased")
    public Object numberOfUnitsLeased;
    @JsonProperty("FurnitureReplacementExpense")
    public Object furnitureReplacementExpense;
    @JsonProperty("DistanceToStreetUnits")
    public Object distanceToStreetUnits;
    @JsonProperty("BuyerAgentNameSuffix")
    public Object buyerAgentNameSuffix;
    @JsonProperty("GardenerExpense")
    public Object gardenerExpense;
    @JsonProperty("DistanceToSchoolBusUnits")
    public Object distanceToSchoolBusUnits;
    @JsonProperty("BuilderName")
    public String builderName;
    @JsonProperty("BuyerAgentStateLicense")
    public Object buyerAgentStateLicense;
    @JsonProperty("ListOfficeEmail")
    public Object listOfficeEmail;
    @JsonProperty("PropertySubType")
    public String propertySubType;
    @JsonProperty("CoListAgentFirstName")
    public Object coListAgentFirstName;
    @JsonProperty("BuyerAgentDirectPhone")
    public Object buyerAgentDirectPhone;
    @JsonProperty("CoBuyerAgentPreferredPhone")
    public Object coBuyerAgentPreferredPhone;
    @JsonProperty("OtherExpense")
    public Object otherExpense;
    @JsonProperty("Possession")
    public ArrayList<String> possession;
    @JsonProperty("CoListAgentOfficePhone")
    public Object coListAgentOfficePhone;
    @JsonProperty("WaterfrontYN")
    public boolean waterfrontYN;
    @JsonProperty("BathroomsFull")
    public int bathroomsFull;
    @JsonProperty("LotSizeAcres")
    public int lotSizeAcres;
    @JsonProperty("SubdivisionName")
    public String subdivisionName;
    @JsonProperty("SpecialLicenses")
    public ArrayList<Object> specialLicenses;
    @JsonProperty("BuyerOfficeAOR")
    public Object buyerOfficeAOR;
    @JsonProperty("InternetAddressDisplayYN")
    public boolean internetAddressDisplayYN;
    @JsonProperty("Fencing")
    public ArrayList<String> fencing;
    @JsonProperty("LotSizeSource")
    public String lotSizeSource;
    @JsonProperty("WithdrawnDate")
    public Object withdrawnDate;
    @JsonProperty("DistanceToWaterNumeric")
    public Object distanceToWaterNumeric;
    @JsonProperty("VideosCount")
    public Object videosCount;
    @JsonProperty("Contingency")
    public String contingency;
    @JsonProperty("FarmCreditServiceInclYN")
    public Object farmCreditServiceInclYN;
    @JsonProperty("ListingService")
    public String listingService;
    @JsonProperty("Elevation")
    public int elevation;
    @JsonProperty("WaterSource")
    public ArrayList<String> waterSource;
    @JsonProperty("Topography")
    public Object topography;
    @JsonProperty("SubAgencyCompensationType")
    public Object subAgencyCompensationType;
    @JsonProperty("ProfessionalManagementExpense")
    public Object professionalManagementExpense;
    @JsonProperty("DistanceToFreewayUnits")
    public Object distanceToFreewayUnits;
    @JsonProperty("DoorFeatures")
    public ArrayList<String> doorFeatures;
    @JsonProperty("StoriesTotal")
    public int storiesTotal;
    @JsonProperty("YearBuilt")
    public int yearBuilt;
    @JsonProperty("ElectricOnPropertyYN")
    public boolean electricOnPropertyYN;
    @JsonProperty("MapCoordinateSource")
    public Object mapCoordinateSource;
    @JsonProperty("StateRegion")
    public Object stateRegion;
    @JsonProperty("IrrigationSource")
    public ArrayList<Object> irrigationSource;
    @JsonProperty("BathroomsPartial")
    public int bathroomsPartial;
    @JsonProperty("CoListOfficeFax")
    public Object coListOfficeFax;
    @JsonProperty("Disclaimer")
    public String disclaimer;
    @JsonProperty("ZoningDescription")
    public String zoningDescription;
    @JsonProperty("PreviousListPrice")
    public int previousListPrice;
    @JsonProperty("LandLeaseYN")
    public boolean landLeaseYN;
    @JsonProperty("VacancyAllowanceRate")
    public Object vacancyAllowanceRate;
    @JsonProperty("NumberOfSeparateWaterMeters")
    public Object numberOfSeparateWaterMeters;
    @JsonProperty("DaysOnMarket")
    public int daysOnMarket;
    @JsonProperty("PetsAllowed")
    public ArrayList<String> petsAllowed;
    @JsonProperty("CoBuyerAgentVoiceMailExt")
    public Object coBuyerAgentVoiceMailExt;
    @JsonProperty("BuyerAgencyCompensationType")
    public Object buyerAgencyCompensationType;
    @JsonProperty("ListAgentFax")
    public Object listAgentFax;
    @JsonProperty("NetOperatingIncome")
    public Object netOperatingIncome;
    @JsonProperty("SerialXX")
    public Object serialXX;
    @JsonProperty("OccupantType")
    public String occupantType;
    @JsonProperty("OtherStructures")
    public ArrayList<String> otherStructures;
    @JsonProperty("AssociationAmenities")
    public ArrayList<String> associationAmenities;
    @JsonProperty("BodyType")
    public ArrayList<Object> bodyType;
    @JsonProperty("ClosePrice")
    public Object closePrice;
    @JsonProperty("VirtualTourURLZillow")
    public Object virtualTourURLZillow;
    @JsonProperty("ListAgentDesignation")
    public ArrayList<Object> listAgentDesignation;
    @JsonProperty("BuyerAgentPreferredPhone")
    public Object buyerAgentPreferredPhone;
    @JsonProperty("DistanceToPhoneServiceComments")
    public Object distanceToPhoneServiceComments;
    @JsonProperty("PoolExpense")
    public Object poolExpense;
    @JsonProperty("PendingTimestamp")
    public Date pendingTimestamp;
    @JsonProperty("CoBuyerAgentURL")
    public Object coBuyerAgentURL;
    @JsonProperty("StreetNumberNumeric")
    public Object streetNumberNumeric;
    @JsonProperty("ListAgentCellPhone")
    public Object listAgentCellPhone;
    @JsonProperty("CoListAgentOfficePhoneExt")
    public Object coListAgentOfficePhoneExt;
    @JsonProperty("IncomeIncludes")
    public ArrayList<Object> incomeIncludes;
    @JsonProperty("CoBuyerAgentVoiceMail")
    public Object coBuyerAgentVoiceMail;
    @JsonProperty("LivingArea")
    public int livingArea;
    @JsonProperty("TaxAssessedValue")
    public int taxAssessedValue;
    @JsonProperty("BuyerTeamKeyNumeric")
    public Object buyerTeamKeyNumeric;
    @JsonProperty("CoListAgentKeyNumeric")
    public Object coListAgentKeyNumeric;
    @JsonProperty("CumulativeDaysOnMarket")
    public Object cumulativeDaysOnMarket;
    @JsonProperty("CoListAgentStateLicense")
    public Object coListAgentStateLicense;
    @JsonProperty("ParkingFeatures")
    public ArrayList<Object> parkingFeatures;
    @JsonProperty("PostalCodePlus4")
    public Object postalCodePlus4;
    @JsonProperty("ListAgentPreferredPhone")
    public String listAgentPreferredPhone;
    @JsonProperty("CoBuyerAgentHomePhone")
    public Object coBuyerAgentHomePhone;
    @JsonProperty("BuyerOfficePhoneExt")
    public Object buyerOfficePhoneExt;
    @JsonProperty("PoolFeatures")
    public ArrayList<String> poolFeatures;
    @JsonProperty("BuyerAgentOfficePhoneExt")
    public Object buyerAgentOfficePhoneExt;
    @JsonProperty("NumberOfUnitsInCommunity")
    public Object numberOfUnitsInCommunity;
    @JsonProperty("Heating")
    public ArrayList<String> heating;
    @JsonProperty("StructureType")
    public ArrayList<Object> structureType;
    @JsonProperty("BuildingAreaSource")
    public String buildingAreaSource;
    @JsonProperty("BathroomsOneQuarter")
    public int bathroomsOneQuarter;
    @JsonProperty("BuilderModel")
    public String builderModel;
    @JsonProperty("CoBuyerAgentTollFreePhone")
    public Object coBuyerAgentTollFreePhone;
    @JsonProperty("TotalActualRent")
    public Object totalActualRent;
    @JsonProperty("TrashExpense")
    public Object trashExpense;
    @JsonProperty("CoListAgentMlsId")
    public Object coListAgentMlsId;
    @JsonProperty("DistanceToStreetNumeric")
    public Object distanceToStreetNumeric;
    @JsonProperty("PublicSurveyTownship")
    public Object publicSurveyTownship;
    @JsonProperty("ListAgentMiddleName")
    public String listAgentMiddleName;
    @JsonProperty("OwnerPays")
    public ArrayList<Object> ownerPays;
    @JsonProperty("BedroomsPossible")
    public int bedroomsPossible;
    @JsonProperty("BuyerAgentVoiceMailExt")
    public Object buyerAgentVoiceMailExt;
    @JsonProperty("BuyerOfficePhone")
    public Object buyerOfficePhone;
    @JsonProperty("RoadResponsibility")
    public ArrayList<String> roadResponsibility;
    @JsonProperty("ListingAgreement")
    public Object listingAgreement;
    @JsonProperty("PublicSurveySection")
    public Object publicSurveySection;
    @JsonProperty("CoListOfficeEmail")
    public Object coListOfficeEmail;
    @JsonProperty("AssociationName2")
    public String associationName2;
    @JsonProperty("ListingId")
    public String listingId;
    @JsonProperty("DocumentsChangeTimestamp")
    public Object documentsChangeTimestamp;
    @JsonProperty("CommunityFeatures")
    public ArrayList<String> communityFeatures;
    @JsonProperty("ShowingStartTime")
    public Object showingStartTime;
    @JsonProperty("BathroomsTotalInteger")
    public int bathroomsTotalInteger;
    @JsonProperty("ParkManagerName")
    public Object parkManagerName;
    @JsonProperty("MapCoordinate")
    public Object mapCoordinate;
    @JsonProperty("RoomsTotal")
    public int roomsTotal;
    @JsonProperty("DistanceToPlaceofWorshipComments")
    public Object distanceToPlaceofWorshipComments;
    @JsonProperty("ListAgentOfficePhoneExt")
    public Object listAgentOfficePhoneExt;
    @JsonProperty("BuildingAreaUnits")
    public String buildingAreaUnits;
    @JsonProperty("City")
    public String city;
    @JsonProperty("OwnerPhone")
    public Object ownerPhone;
    @JsonProperty("InternetEntireListingDisplayYN")
    public boolean internetEntireListingDisplayYN;
    @JsonProperty("CropsIncludedYN")
    public Object cropsIncludedYN;
    @JsonProperty("BuyerAgentOfficePhone")
    public Object buyerAgentOfficePhone;
    @JsonProperty("GrazingPermitsBlmYN")
    public Object grazingPermitsBlmYN;
    @JsonProperty("BuyerAgencyCompensation")
    public Object buyerAgencyCompensation;
    @JsonProperty("CoBuyerOfficeKeyNumeric")
    public Object coBuyerOfficeKeyNumeric;
    @JsonProperty("LeaseExpiration")
    public Object leaseExpiration;
    @JsonProperty("ListAgentNameSuffix")
    public Object listAgentNameSuffix;
    @JsonProperty("ShowingAdvanceNotice")
    public Object showingAdvanceNotice;
    @JsonProperty("SerialX")
    public Object serialX;
    @JsonProperty("InternetAutomatedValuationDisplayYN")
    public boolean internetAutomatedValuationDisplayYN;
    @JsonProperty("BuyerAgentTollFreePhone")
    public Object buyerAgentTollFreePhone;
    @JsonProperty("SerialU")
    public Object serialU;
    @JsonProperty("TaxYear")
    public int taxYear;
    @JsonProperty("Telephone")
    public ArrayList<String> telephone;
    @JsonProperty("DirectionFaces")
    public String directionFaces;
    @JsonProperty("SourceSystemName")
    public Object sourceSystemName;
    @JsonProperty("PossibleUse")
    public ArrayList<Object> possibleUse;
    @JsonProperty("Furnished")
    public Object furnished;
    @JsonProperty("DistanceToSchoolBusComments")
    public Object distanceToSchoolBusComments;
    @JsonProperty("ConstructionMaterials")
    public ArrayList<String> constructionMaterials;
    @JsonProperty("SuppliesExpense")
    public Object suppliesExpense;
    @JsonProperty("ListOfficeURL")
    public Object listOfficeURL;
    @JsonProperty("RangeArea")
    public Object rangeArea;
    @JsonProperty("ListingInputOriginalMedia")
    public Object listingInputOriginalMedia;
    @JsonProperty("OccupantName")
    public String occupantName;
    @JsonProperty("BuyerOfficeKey")
    public Object buyerOfficeKey;
    @JsonProperty("ShowingEndTime")
    public Object showingEndTime;
    @JsonProperty("TaxOtherAnnualAssessmentAmount")
    public Object taxOtherAnnualAssessmentAmount;
    @JsonProperty("PrivateRemarks")
    public String privateRemarks;
    @JsonProperty("InternetConsumerCommentYN")
    public boolean internetConsumerCommentYN;
    @JsonProperty("BuildingAreaTotal")
    public int buildingAreaTotal;
    @JsonProperty("YearBuiltSource")
    public String yearBuiltSource;
    @JsonProperty("OtherEquipment")
    public ArrayList<String> otherEquipment;
    @JsonProperty("HabitableResidenceYN")
    public Object habitableResidenceYN;
    @JsonProperty("PestControlExpense")
    public Object pestControlExpense;
    @JsonProperty("LaborInformation")
    public ArrayList<Object> laborInformation;
    @JsonProperty("LandLeaseAmountFrequency")
    public String landLeaseAmountFrequency;
    @JsonProperty("BedroomsTotal")
    public int bedroomsTotal;
    @JsonProperty("ShowingInstructions")
    public String showingInstructions;
    @JsonProperty("CoBuyerOfficeEmail")
    public Object coBuyerOfficeEmail;
    @JsonProperty("CoListAgentDesignation")
    public ArrayList<Object> coListAgentDesignation;
    @JsonProperty("CoListAgentDirectPhone")
    public Object coListAgentDirectPhone;
    @JsonProperty("CoolingYN")
    public boolean coolingYN;
    @JsonProperty("GreenSustainability")
    public ArrayList<Object> greenSustainability;
    @JsonProperty("InsuranceExpense")
    public Object insuranceExpense;
    @JsonProperty("ListAgentKey")
    public String listAgentKey;
    @JsonProperty("OnMarketDate")
    public String onMarketDate;
    @JsonProperty("CarportSpaces")
    public int carportSpaces;
    @JsonProperty("LotSizeUnits")
    public Object lotSizeUnits;
    @JsonProperty("ListAgentEmail")
    public Object listAgentEmail;
    @JsonProperty("ContractStatusChangeDate")
    public String contractStatusChangeDate;
    @JsonProperty("BuyerAgentHomePhone")
    public Object buyerAgentHomePhone;
    @JsonProperty("LeaseAmountFrequency")
    public Object leaseAmountFrequency;
    @JsonProperty("MajorChangeTimestamp")
    public Object majorChangeTimestamp;
    @JsonProperty("ElevationUnits")
    public String elevationUnits;
    @JsonProperty("CoBuyerAgentEmail")
    public Object coBuyerAgentEmail;
    @JsonProperty("WalkScore")
    public Object walkScore;
    @JsonProperty("GarageYN")
    public boolean garageYN;
    @JsonProperty("HoursDaysOfOperation")
    public ArrayList<Object> hoursDaysOfOperation;
    @JsonProperty("BuyerAgentPreferredPhoneExt")
    public Object buyerAgentPreferredPhoneExt;
    @JsonProperty("DistanceToWaterUnits")
    public Object distanceToWaterUnits;
    @JsonProperty("Make")
    public Object make;
    @JsonProperty("Longitude")
    public double longitude;
    @JsonProperty("AvailabilityDate")
    public String availabilityDate;
    @JsonProperty("TaxTract")
    public String taxTract;
    @JsonProperty("Skirt")
    public ArrayList<Object> skirt;
    @JsonProperty("BuyerAgentURL")
    public Object buyerAgentURL;
    @JsonProperty("BuyerOfficeFax")
    public Object buyerOfficeFax;
    @JsonProperty("CarportYN")
    public boolean carportYN;
    @JsonProperty("PublicRemarks")
    public String publicRemarks;
    @JsonProperty("FinancialDataSource")
    public ArrayList<String> financialDataSource;
    @JsonProperty("CoBuyerAgentKey")
    public Object coBuyerAgentKey;
    @JsonProperty("PostalCity")
    public Object postalCity;
    @JsonProperty("CurrentFinancing")
    public ArrayList<String> currentFinancing;
    @JsonProperty("CableTvExpense")
    public Object cableTvExpense;
    @JsonProperty("NumberOfSeparateElectricMeters")
    public Object numberOfSeparateElectricMeters;
    @JsonProperty("ElementarySchoolDistrict")
    public String elementarySchoolDistrict;
    @JsonProperty("NumberOfFullTimeEmployees")
    public Object numberOfFullTimeEmployees;
    @JsonProperty("OffMarketTimestamp")
    public Object offMarketTimestamp;
    @JsonProperty("CoBuyerOfficeFax")
    public Object coBuyerOfficeFax;
    @JsonProperty("CoBuyerAgentFirstName")
    public Object coBuyerAgentFirstName;
    @JsonProperty("CoBuyerAgentPager")
    public Object coBuyerAgentPager;
    @JsonProperty("CoListOfficeName")
    public Object coListOfficeName;
    @JsonProperty("PurchaseContractDate")
    public Object purchaseContractDate;
    @JsonProperty("ListAgentVoiceMailExt")
    public Object listAgentVoiceMailExt;
    @JsonProperty("RoadSurfaceType")
    public ArrayList<String> roadSurfaceType;
    @JsonProperty("ListAgentPager")
    public Object listAgentPager;
    @JsonProperty("PriceChangeTimestamp")
    public Date priceChangeTimestamp;
    @JsonProperty("MapURL")
    public Object mapURL;
    @JsonProperty("CoListAgentPager")
    public Object coListAgentPager;
    @JsonProperty("LeasableArea")
    public Object leasableArea;
    @JsonProperty("ListingContractDate")
    public String listingContractDate;
    @JsonProperty("CoListOfficeKey")
    public Object coListOfficeKey;
    @JsonProperty("MLSAreaMinor")
    public Object mLSAreaMinor;
    @JsonProperty("FarmLandAreaUnits")
    public Object farmLandAreaUnits;
    @JsonProperty("Zoning")
    public String zoning;
    @JsonProperty("ListAgentAOR")
    public Object listAgentAOR;
    @JsonProperty("CoBuyerAgentKeyNumeric")
    public Object coBuyerAgentKeyNumeric;
    @JsonProperty("GreenIndoorAirQuality")
    public ArrayList<Object> greenIndoorAirQuality;
    @JsonProperty("LivingAreaSource")
    public String livingAreaSource;
    @JsonProperty("MaintenanceExpense")
    public Object maintenanceExpense;
    @JsonProperty("BuyerAgentVoiceMail")
    public Object buyerAgentVoiceMail;
    @JsonProperty("DistanceToElectricNumeric")
    public Object distanceToElectricNumeric;
    @JsonProperty("ListAOR")
    public Object listAOR;
    @JsonProperty("BelowGradeFinishedArea")
    public int belowGradeFinishedArea;
    @JsonProperty("CoBuyerOfficeName")
    public Object coBuyerOfficeName;
    @JsonProperty("ListOfficeName")
    public String listOfficeName;
    @JsonProperty("TaxBlock")
    public String taxBlock;
    @JsonProperty("CoListAgentTollFreePhone")
    public Object coListAgentTollFreePhone;
    @JsonProperty("BuyerFinancing")
    public ArrayList<String> buyerFinancing;
    @JsonProperty("GreenLocation")
    public ArrayList<Object> greenLocation;
    @JsonProperty("MobileWidth")
    public Object mobileWidth;
    @JsonProperty("GrazingPermitsPrivateYN")
    public Object grazingPermitsPrivateYN;
    @JsonProperty("Basement")
    public ArrayList<String> basement;
    @JsonProperty("BusinessType")
    public ArrayList<String> businessType;
    @JsonProperty("DualVariableCompensationYN")
    public boolean dualVariableCompensationYN;
    @JsonProperty("Latitude")
    public double latitude;
    @JsonProperty("NumberOfSeparateGasMeters")
    public Object numberOfSeparateGasMeters;
    @JsonProperty("PhotosChangeTimestamp")
    public Object photosChangeTimestamp;
    @JsonProperty("ListPrice")
    public int listPrice;
    @JsonProperty("RoadFrontageType")
    public ArrayList<String> roadFrontageType;
    @JsonProperty("BuyerAgentKeyNumeric")
    public Object buyerAgentKeyNumeric;
    @JsonProperty("ListAgentTollFreePhone")
    public Object listAgentTollFreePhone;
    @JsonProperty("DistanceToGasUnits")
    public Object distanceToGasUnits;
    @JsonProperty("DistanceToPlaceofWorshipNumeric")
    public Object distanceToPlaceofWorshipNumeric;
    @JsonProperty("ListOfficePhone")
    public Object listOfficePhone;
    @JsonProperty("CoListAgentFax")
    public Object coListAgentFax;
    @JsonProperty("GreenEnergyGeneration")
    public ArrayList<Object> greenEnergyGeneration;
    @JsonProperty("DOH1")
    public Object dOH1;
    @JsonProperty("DOH2")
    public Object dOH2;
    @JsonProperty("FoundationArea")
    public int foundationArea;
    @JsonProperty("DOH3")
    public Object dOH3;
    @JsonProperty("BelowGradeFinishedAreaSource")
    public String belowGradeFinishedAreaSource;
    @JsonProperty("CoBuyerOfficeKey")
    public Object coBuyerOfficeKey;
    @JsonProperty("CoListAgentHomePhone")
    public Object coListAgentHomePhone;
    @JsonProperty("ElectricExpense")
    public Object electricExpense;
    @JsonProperty("CoListOfficeMlsId")
    public Object coListOfficeMlsId;
    @JsonProperty("DistanceToElectricComments")
    public Object distanceToElectricComments;
    @JsonProperty("CoBuyerOfficePhoneExt")
    public Object coBuyerOfficePhoneExt;
    @JsonProperty("AssociationFee2Frequency")
    public String associationFee2Frequency;
    @JsonProperty("CoListAgentVoiceMailExt")
    public Object coListAgentVoiceMailExt;
    @JsonProperty("StateOrProvince")
    public String stateOrProvince;
    @JsonProperty("AboveGradeFinishedAreaUnits")
    public String aboveGradeFinishedAreaUnits;
    @JsonProperty("DistanceToSewerComments")
    public Object distanceToSewerComments;
    @JsonProperty("ListOfficeAOR")
    public Object listOfficeAOR;
    @JsonProperty("StreetAdditionalInfo")
    public Object streetAdditionalInfo;
    @JsonProperty("GreenBuildingVerificationType")
    public Object greenBuildingVerificationType;
    @JsonProperty("CoveredSpaces")
    public int coveredSpaces;
    @JsonProperty("MiddleOrJuniorSchool")
    public String middleOrJuniorSchool;
    @JsonProperty("AssociationFeeIncludes")
    public ArrayList<String> associationFeeIncludes;
    @JsonProperty("CoListAgentMobilePhone")
    public Object coListAgentMobilePhone;
    @JsonProperty("ConcessionsComments")
    public Object concessionsComments;
    @JsonProperty("SyndicateTo")
    public ArrayList<String> syndicateTo;
    @JsonProperty("VirtualTourURLUnbranded")
    public Object virtualTourURLUnbranded;
    @JsonProperty("Gas")
    public ArrayList<String> gas;
    @JsonProperty("CoListAgentEmail")
    public Object coListAgentEmail;
    @JsonProperty("LandLeaseExpirationDate")
    public Object landLeaseExpirationDate;
    @JsonProperty("FrontageLength")
    public String frontageLength;
    @JsonProperty("WorkmansCompensationExpense")
    public Object workmansCompensationExpense;
    @JsonProperty("ListOfficeKeyNumeric")
    public Object listOfficeKeyNumeric;
    @JsonProperty("CoListOfficeAOR")
    public Object coListOfficeAOR;
    @JsonProperty("Disclosures")
    public ArrayList<String> disclosures;
    @JsonProperty("ListOfficeKey")
    public String listOfficeKey;
    @JsonProperty("DistanceToGasNumeric")
    public Object distanceToGasNumeric;
    @JsonProperty("FireplaceYN")
    public boolean fireplaceYN;
    @JsonProperty("BathroomsThreeQuarter")
    public int bathroomsThreeQuarter;
    @JsonProperty("CoBuyerAgentCellPhone")
    public Object coBuyerAgentCellPhone;
    @JsonProperty("BridgeModificationTimestamp")
    public Date bridgeModificationTimestamp;
    @JsonProperty("YearBuiltEffective")
    public Object yearBuiltEffective;
    @JsonProperty("EntryLevel")
    public Object entryLevel;
    @JsonProperty("ListAgentFullName")
    public String listAgentFullName;
    @JsonProperty("TaxBookNumber")
    public Object taxBookNumber;
    @JsonProperty("DistanceToSchoolBusNumeric")
    public Object distanceToSchoolBusNumeric;
    @JsonProperty("ListAgentMobilePhone")
    public Object listAgentMobilePhone;
    @JsonProperty("ShowingContactPhoneExt")
    public Object showingContactPhoneExt;
    @JsonProperty("MainLevelBathrooms")
    public int mainLevelBathrooms;
    @JsonProperty("PropertyCondition")
    public ArrayList<Object> propertyCondition;
    @JsonProperty("FrontageType")
    public ArrayList<String> frontageType;
    @JsonProperty("Stories")
    public int stories;
    @JsonProperty("DevelopmentStatus")
    public ArrayList<Object> developmentStatus;
    @JsonProperty("GrossIncome")
    public Object grossIncome;
    @JsonProperty("ParcelNumber")
    public String parcelNumber;
    @JsonProperty("ShowingDays")
    public Object showingDays;
    @JsonProperty("CoBuyerAgentAOR")
    public Object coBuyerAgentAOR;
    @JsonProperty("ShowingRequirements")
    public Object showingRequirements;
    @JsonProperty("UnitsFurnished")
    public Object unitsFurnished;
    @JsonProperty("FuelExpense")
    public Object fuelExpense;
    @JsonProperty("CoListAgentVoiceMail")
    public Object coListAgentVoiceMail;
    @JsonProperty("FoundationDetails")
    public ArrayList<String> foundationDetails;
    @JsonProperty("View")
    public ArrayList<String> view;
    @JsonProperty("SignOnPropertyYN")
    public boolean signOnPropertyYN;
    @JsonProperty("OperatingExpense")
    public Object operatingExpense;
    @JsonProperty("LeaseRenewalOptionYN")
    public Object leaseRenewalOptionYN;
    @JsonProperty("LeaseRenewalCompensation")
    public ArrayList<Object> leaseRenewalCompensation;
    @JsonProperty("YearBuiltDetails")
    public String yearBuiltDetails;
    @JsonProperty("BuyerAgentPager")
    public Object buyerAgentPager;
    @JsonProperty("HighSchool")
    public String highSchool;
    @JsonProperty("LeaseConsideredYN")
    public boolean leaseConsideredYN;
    @JsonProperty("HomeWarrantyYN")
    public boolean homeWarrantyYN;
    @JsonProperty("Levels")
    public ArrayList<String> levels;
    @JsonProperty("OperatingExpenseIncludes")
    public ArrayList<Object> operatingExpenseIncludes;
    @JsonProperty("StreetSuffixModifier")
    public Object streetSuffixModifier;
    @JsonProperty("IDXParticipationYN")
    public boolean iDXParticipationYN;
    @JsonProperty("DistanceToFreewayNumeric")
    public Object distanceToFreewayNumeric;
    @JsonProperty("ListAgentLastName")
    public String listAgentLastName;
    @JsonProperty("ListAgentURL")
    public Object listAgentURL;
    @JsonProperty("InteriorFeatures")
    public ArrayList<String> interiorFeatures;
    @JsonProperty("LockBoxType")
    public ArrayList<String> lockBoxType;
    @JsonProperty("OffMarketDate")
    public Object offMarketDate;
    @JsonProperty("CoBuyerAgentMlsId")
    public Object coBuyerAgentMlsId;
    @JsonProperty("PowerProductionType")
    public Object powerProductionType;
    @JsonProperty("DistanceToPhoneServiceNumeric")
    public Object distanceToPhoneServiceNumeric;
    @JsonProperty("DistanceToWaterComments")
    public Object distanceToWaterComments;
    @JsonProperty("CloseDate")
    public String closeDate;
    @JsonProperty("ApprovalStatus")
    public Object approvalStatus;
    @JsonProperty("StreetSuffix")
    public Object streetSuffix;
    @JsonProperty("DistanceToPhoneServiceUnits")
    public Object distanceToPhoneServiceUnits;
    @JsonProperty("HorseAmenities")
    public ArrayList<Object> horseAmenities;
    @JsonProperty("ListAgentMlsId")
    public String listAgentMlsId;
    @JsonProperty("CoListAgentNameSuffix")
    public Object coListAgentNameSuffix;
    @JsonProperty("ListOfficePhoneExt")
    public Object listOfficePhoneExt;
    @JsonProperty("WaterSewerExpense")
    public Object waterSewerExpense;
    @JsonProperty("GrazingPermitsForestServiceYN")
    public Object grazingPermitsForestServiceYN;
    @JsonProperty("LotSizeDimensions")
    public String lotSizeDimensions;
    @JsonProperty("ModificationTimestamp")
    public Date modificationTimestamp;
    @JsonProperty("PropertyAttachedYN")
    public boolean propertyAttachedYN;
    @JsonProperty("BuyerAgentKey")
    public Object buyerAgentKey;
    @JsonProperty("TaxLot")
    public String taxLot;
    @JsonProperty("BusinessName")
    public String businessName;
    @JsonProperty("BuyerAgentEmail")
    public Object buyerAgentEmail;
    @JsonProperty("Coordinates")
    public ArrayList<Double> coordinates;
    @JsonProperty("AccessCode")
    public String accessCode;
    @JsonProperty("CoBuyerOfficeMlsId")
    public Object coBuyerOfficeMlsId;
    @JsonProperty("ListAgentNamePrefix")
    public Object listAgentNamePrefix;
    @JsonProperty("OriginatingSystemID")
    public String originatingSystemID;
    @JsonProperty("HorseYN")
    public boolean horseYN;
    @JsonProperty("LotDimensionsSource")
    public String lotDimensionsSource;
    @JsonProperty("Country")
    public String country;
    @JsonProperty("UnitNumber")
    public String unitNumber;
    @JsonProperty("CoListAgentPreferredPhoneExt")
    public Object coListAgentPreferredPhoneExt;
    @JsonProperty("OpenParkingYN")
    public boolean openParkingYN;
    @JsonProperty("TransactionBrokerCompensation")
    public Object transactionBrokerCompensation;
    @JsonProperty("LeasableAreaUnits")
    public Object leasableAreaUnits;
    @JsonProperty("MobileLength")
    public Object mobileLength;
    @JsonProperty("CoBuyerOfficeAOR")
    public Object coBuyerOfficeAOR;
    @JsonProperty("NumberOfUnitsVacant")
    public Object numberOfUnitsVacant;
    @JsonProperty("ListOfficeMlsId")
    public String listOfficeMlsId;
    @JsonProperty("Inclusions")
    public String inclusions;
    @JsonProperty("ListTeamKeyNumeric")
    public Object listTeamKeyNumeric;
    @JsonProperty("ListAgentDirectPhone")
    public Object listAgentDirectPhone;
    @JsonProperty("CoBuyerAgentOfficePhone")
    public Object coBuyerAgentOfficePhone;
    @JsonProperty("VacancyAllowance")
    public Object vacancyAllowance;
    @JsonProperty("AssociationPhone")
    public String associationPhone;
    @JsonProperty("ConcessionsAmount")
    public double concessionsAmount;
    @JsonProperty("VirtualTourURLBranded")
    public Object virtualTourURLBranded;
    @JsonProperty("RoomType")
    public Object roomType;
    @JsonProperty("CoListAgentFullName")
    public Object coListAgentFullName;
    @JsonProperty("CoListAgentKey")
    public Object coListAgentKey;
    @JsonProperty("BelowGradeFinishedAreaUnits")
    public String belowGradeFinishedAreaUnits;
    @JsonProperty("CoListAgentMiddleName")
    public Object coListAgentMiddleName;
    @JsonProperty("CoListOfficeURL")
    public Object coListOfficeURL;
    @JsonProperty("RentControlYN")
    public Object rentControlYN;
    @JsonProperty("EntryLocation")
    public String entryLocation;
    @JsonProperty("BuyerAgentMobilePhone")
    public Object buyerAgentMobilePhone;
    @JsonProperty("SpaYN")
    public boolean spaYN;
    @JsonProperty("SpaFeatures")
    public ArrayList<Object> spaFeatures;
    @JsonProperty("ShowingContactPhone")
    public String showingContactPhone;
    @JsonProperty("BuyerAgentFirstName")
    public Object buyerAgentFirstName;
    @JsonProperty("DistanceToPlaceofWorshipUnits")
    public Object distanceToPlaceofWorshipUnits;
    @JsonProperty("ExistingLeaseType")
    public ArrayList<Object> existingLeaseType;
    @JsonProperty("BathroomsHalf")
    public int bathroomsHalf;
    @JsonProperty("GardnerExpense")
    public Object gardnerExpense;
    @JsonProperty("LotSizeArea")
    public Object lotSizeArea;
    @JsonProperty("Sewer")
    public ArrayList<String> sewer;
    @JsonProperty("ExpirationDate")
    public Object expirationDate;
    @JsonProperty("SyndicationRemarks")
    public Object syndicationRemarks;
    @JsonProperty("Model")
    public Object model;
    @JsonProperty("BuyerAgentLastName")
    public Object buyerAgentLastName;
    @JsonProperty("MaloneId")
    public Object maloneId;
    @JsonProperty("ListAgentStateLicense")
    public Object listAgentStateLicense;
    @JsonProperty("StreetName")
    public String streetName;
    @JsonProperty("ShowingAttendedYN")
    public Object showingAttendedYN;
    @JsonProperty("AboveGradeFinishedAreaSource")
    public String aboveGradeFinishedAreaSource;
    @JsonProperty("ListOfficeFax")
    public Object listOfficeFax;
    @JsonProperty("AnchorsCoTenants")
    public String anchorsCoTenants;
    @JsonProperty("PatioAndPorchFeatures")
    public ArrayList<String> patioAndPorchFeatures;
    @JsonProperty("BuyerAgentCellPhone")
    public Object buyerAgentCellPhone;
    @JsonProperty("NumberOfLots")
    public Object numberOfLots;
    @JsonProperty("ParkManagerPhone")
    public Object parkManagerPhone;
    @JsonProperty("ListTeamName")
    public Object listTeamName;
    @JsonProperty("MainLevelBedrooms")
    public Object mainLevelBedrooms;
    @JsonProperty("CityRegion")
    public String cityRegion;
    @JsonProperty("NumberOfPartTimeEmployees")
    public Object numberOfPartTimeEmployees;
    @JsonProperty("LockBoxSerialNumber")
    public String lockBoxSerialNumber;
    @JsonProperty("DistanceToBusUnits")
    public Object distanceToBusUnits;
    @JsonProperty("Utilities")
    public ArrayList<Object> utilities;
    @JsonProperty("FireplaceFeatures")
    public ArrayList<String> fireplaceFeatures;
    @JsonProperty("WindowFeatures")
    public ArrayList<Object> windowFeatures;
    @JsonProperty("SpecialListingConditions")
    public ArrayList<String> specialListingConditions;
    @JsonProperty("NewConstructionYN")
    public boolean newConstructionYN;
    @JsonProperty("BuyerAgentAOR")
    public Object buyerAgentAOR;
    @JsonProperty("ParkName")
    public Object parkName;
    @JsonProperty("NumberOfBuildings")
    public Object numberOfBuildings;
    @JsonProperty("GarageSpaces")
    public int garageSpaces;
    @JsonProperty("OriginalListPrice")
    public int originalListPrice;
    @JsonProperty("AssociationFee2")
    public int associationFee2;
    @JsonProperty("HoursDaysOfOperationDescription")
    public Object hoursDaysOfOperationDescription;
    @JsonProperty("GreenEnergyEfficient")
    public ArrayList<String> greenEnergyEfficient;
    @JsonProperty("Media")
    public ArrayList<MediumDTO> media;
    @JsonProperty("CapRate")
    public Object capRate;
    @JsonProperty("RentIncludes")
    public ArrayList<Object> rentIncludes;
    @JsonProperty("DistanceToSchoolsUnits")
    public Object distanceToSchoolsUnits;
    @JsonProperty("BuyerOfficeKeyNumeric")
    public Object buyerOfficeKeyNumeric;
    @JsonProperty("UnitTypeType")
    public Object unitTypeType;
    @JsonProperty("AccessibilityFeatures")
    public ArrayList<String> accessibilityFeatures;
    @JsonProperty("FarmLandAreaSource")
    public Object farmLandAreaSource;
    @JsonProperty("HighSchoolDistrict")
    public String highSchoolDistrict;
    @JsonProperty("OriginalEntryTimestamp")
    public Date originalEntryTimestamp;
    @JsonProperty("BuildingFeatures")
    public ArrayList<String> buildingFeatures;
    @JsonProperty("OwnershipType")
    public Object ownershipType;
    @JsonProperty("SourceSystemKey")
    public Object sourceSystemKey;
    @JsonProperty("Ownership")
    public String ownership;
    @JsonProperty("BuyerAgentMlsId")
    public Object buyerAgentMlsId;
    @JsonProperty("OwnerName")
    public Object ownerName;
    @JsonProperty("Exclusions")
    public String exclusions;
    @JsonProperty("CopyrightNotice")
    public String copyrightNotice;
    @JsonProperty("ShowingContactName")
    public String showingContactName;
    @JsonProperty("MobileDimUnits")
    public Object mobileDimUnits;
    @JsonProperty("LotFeatures")
    public ArrayList<String> lotFeatures;
    @JsonProperty("CoBuyerAgentOfficePhoneExt")
    public Object coBuyerAgentOfficePhoneExt;
    @JsonProperty("License3")
    public Object license3;
    @JsonProperty("PostalCode")
    public String postalCode;
    @JsonProperty("License1")
    public Object license1;
    @JsonProperty("License2")
    public Object license2;
    @JsonProperty("BuyerOfficeMlsId")
    public Object buyerOfficeMlsId;
    @JsonProperty("DocumentsAvailable")
    public ArrayList<Object> documentsAvailable;
    @JsonProperty("DistanceToShoppingUnits")
    public Object distanceToShoppingUnits;
    @JsonProperty("NumberOfUnitsTotal")
    public int numberOfUnitsTotal;
    @JsonProperty("BuyerOfficeName")
    public Object buyerOfficeName;
    @JsonProperty("AssociationFee")
    public int associationFee;
    @JsonProperty("LeaseAmount")
    public Object leaseAmount;
    @JsonProperty("LotSizeSquareFeet")
    public int lotSizeSquareFeet;
    @JsonProperty("DistanceToSewerUnits")
    public Object distanceToSewerUnits;
    @JsonProperty("CoBuyerAgentFullName")
    public Object coBuyerAgentFullName;
    @JsonProperty("TenantPays")
    public ArrayList<Object> tenantPays;
    @JsonProperty("MiddleOrJuniorSchoolDistrict")
    public String middleOrJuniorSchoolDistrict;
    @JsonProperty("DistanceToShoppingComments")
    public Object distanceToShoppingComments;
    @JsonProperty("Electric")
    public ArrayList<Object> electric;
    @JsonProperty("ArchitecturalStyle")
    public ArrayList<String> architecturalStyle;
    @JsonProperty("MobileHomeRemainsYN")
    public Object mobileHomeRemainsYN;
    @JsonProperty("NewTaxesExpense")
    public Object newTaxesExpense;
    @JsonProperty("VideosChangeTimestamp")
    public Object videosChangeTimestamp;
    @JsonProperty("CoBuyerOfficeURL")
    public Object coBuyerOfficeURL;
    @JsonProperty("TaxStatusCurrent")
    public ArrayList<String> taxStatusCurrent;
    @JsonProperty("UnparsedAddress")
    public String unparsedAddress;
    @JsonProperty("OpenParkingSpaces")
    public int openParkingSpaces;
    @JsonProperty("CoListOfficePhone")
    public Object coListOfficePhone;
    @JsonProperty("TransactionBrokerCompensationType")
    public Object transactionBrokerCompensationType;
    @JsonProperty("WoodedArea")
    public Object woodedArea;
    @JsonProperty("LicensesExpense")
    public Object licensesExpense;
    @JsonProperty("BuyerOfficeEmail")
    public Object buyerOfficeEmail;
    @JsonProperty("CoListAgentAOR")
    public Object coListAgentAOR;
    @JsonProperty("CoBuyerAgentFax")
    public Object coBuyerAgentFax;
    @JsonProperty("FeedTypes")
    public ArrayList<Object> feedTypes;
    public String url;



}
