package com.api.dataforge.response;

import com.api.dataforge.dto.AgentResponseDTO;

import java.util.ArrayList;

public class AgentResponse {
    public boolean success;
    public int status;
    public ArrayList<AgentResponseDTO> bundle;
    public int total;
}
