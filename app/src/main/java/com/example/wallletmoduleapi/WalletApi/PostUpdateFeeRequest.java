package com.example.wallletmoduleapi.WalletApi;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class PostUpdateFeeRequest {
    public int id;
    public int userId;
    public int standardId;
    public String orgId;
    public String status;

    public PostUpdateFeeRequest(int id, int userId, int standardId, String orgId, String status) {
        this.id = id;
        this.userId = userId;
        this.standardId = standardId;
        this.orgId = orgId;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getStandardId() {
        return standardId;
    }

    public String getOrgId() {
        return orgId;
    }

    public String getStatus() {
        return status;
    }
}

