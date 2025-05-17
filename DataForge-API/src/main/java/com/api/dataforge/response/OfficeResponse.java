package com.api.dataforge.response;

import com.api.dataforge.dto.OfficeResponseDTO;

import java.util.ArrayList;

public class OfficeResponse {

    public boolean success;
    public int status;
    public ArrayList<OfficeResponseDTO> bundle;
    public int total;
}
