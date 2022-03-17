package com.example.wallletmoduleapi.WalletApi;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class TotalLinksRequested {
    public int count;
    public String amount;

    public TotalLinksRequested(int count, String amount) {
        this.count = count;
        this.amount = amount;
    }

    public int getCount() {
        return count;
    }

    public String getAmount() {
        return amount;
    }
}
