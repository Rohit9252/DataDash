package com.api.dataforge.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;



public class ListingResponse {
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
    public String model;
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







}
