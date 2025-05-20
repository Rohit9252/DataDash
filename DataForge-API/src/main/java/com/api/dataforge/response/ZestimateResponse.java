package com.api.dataforge.response;

import com.api.dataforge.dto.ZestimateDTO;

import java.util.ArrayList;

public class ZestimateResponse {

    public boolean success;
    public int status;
    public ArrayList<ZestimateDTO> bundle;
    public int total;
}
