package com.api.dataforge.response;

import com.api.dataforge.dto.AssesmentDTO;

import java.util.ArrayList;

public class ParcelAssesmentsResponse {

    public boolean success;
    public int status;
    public ArrayList<AssesmentDTO> bundle;
    public int total;
}
