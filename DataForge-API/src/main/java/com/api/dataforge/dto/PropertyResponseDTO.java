package com.api.dataforge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;

public class PropertyResponseDTO {

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

}
