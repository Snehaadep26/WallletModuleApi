package com.example.wallletmoduleapi.WalletApi;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class GetCFRTResponse {
    public String status;

    public GetCFRTResponse(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}

