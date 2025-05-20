package com.api.dataforge.response;

import com.api.dataforge.dto.TransactionDTO;

import java.util.ArrayList;

public class TransactionResponse {

    public boolean success;
    public int status;
    public ArrayList<TransactionDTO> bundle;
    public int total;
}
