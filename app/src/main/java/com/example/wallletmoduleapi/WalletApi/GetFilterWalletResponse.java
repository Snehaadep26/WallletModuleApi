package com.example.wallletmoduleapi.WalletApi;

import java.util.ArrayList;
import java.util.Date;

public class GetFilterWalletResponse {
    public ArrayList<Transaction> transactions;

    public GetFilterWalletResponse(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}


