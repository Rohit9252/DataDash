package com.api.dataforge.response;

import com.api.dataforge.dto.ParcelDTO;

import java.util.ArrayList;

public class ParcelResponse {
    public boolean success;
    public int status;
    public ArrayList<ParcelDTO> bundle;
    public int total;
}
