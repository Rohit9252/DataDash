package com.api.dataforge.dto;

import java.util.ArrayList;
import java.util.Date;

public class TransactionDTO {

    public String id;
    public String parcelID;
    public String fips;
    public String county;
    public String state;
    public String category;
    public String recordType;
    public Date recordingDate;
    public String recordingBookNumber;
    public String recordingPageNumber;
    public Integer documentTypeCode;
    public String documentType;
    public Date documentDate;
    public Object signatureDate;
    public Object effectiveDate;
    public Integer buyerVesting;
    public String buyerMultiVesting;
    public Object partialInterestTransfer;
    public Object partialInterestTransferPercent;
    public Integer salesPrice;
    public Integer cityTransferTax;
    public Integer countyTransferTax;
    public Object stateTransferTax;
    public Integer totalTransferTax;
    public Object intraFamilyTransfer;
    public Object transferTaxExempt;
    public Object borrowerVesting;
    public Object lenderName;
    public Object titleCompanyName;
    public Object lenderType;
    public Integer loanAmount;
    public Object loanAmountDescription;
    public Object maxLoanAmount;
    public Object loanTypeCode;
    public Object loanClosedOrOpenEndedCode;
    public Object loanRateTypeCode;
    public Object loanDueDate;
    public Object loanTermMonths;
    public Object loanTermYears;
    public Object initialInterestRate;
    public Object unpaidBalance;
    public Object totalDelinquentAmount;
    public Object delinquentAsOfDate;
    public Object installmentAmount;
    public Object installmentDueDate;
    public Object origLoanAmount;
    public Object origLoanDocumentDate;
    public Object origLoanRecordingDate;
    public Object origLoanDocumentNumber;
    public Object occupancyStatus;
    public Object trusteeSaleNumber;
    public String auctionAddress;
    public Object auctionDate;
    public Object startingBid;
    public ArrayList<String> buyerName;
    public ArrayList<String> sellerName;
    public ArrayList<ParcelDTO> parcels;
    public String url;

}
