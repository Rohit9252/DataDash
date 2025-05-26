package com.api.dataforge.entity;

import lombok.Data;

import java.util.List;

@Data
//@Document(collection = "agents")
public class AgentDocument {

    private String id;

    // Listing association
    private String listingId;

    // Primary Agent
    private AgentInfo listAgent;

    // Co-list Agent
    private AgentInfo coListAgent;

    // Buyer Agent (optional)
    private AgentInfo buyerAgent;

    // Co-buyer Agent (optional)
    private AgentInfo coBuyerAgent;

    // Offices
    private OfficeInfo listOffice;
    private OfficeInfo coListOffice;
    private OfficeInfo buyerOffice;
    private OfficeInfo coBuyerOffice;




}