package com.api.dataforge.response;

import com.api.dataforge.dto.OpenHouseResponseDTO;

import java.util.ArrayList;

public class OpenHouseResponse {

    public boolean success;
    public int status;
    public ArrayList<OpenHouseResponseDTO> bundle;
    public int total;
}
