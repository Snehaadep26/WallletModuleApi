package com.example.wallletmoduleapi.WalletApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface LogInService {


    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTE3MSwicGhvbmUiOiIrOTE5MzgyNzE1Njc4IiwidXJsIjoidGVzdC50aGVjbGFzc3Jvb20uYml6Iiwib3JnSWQiOiI0Y2IyNTA5ZC03MGY1LTQzNWUtODc5Mi1kMjQ5Mzc3NDNiNTMiLCJicm93c2VyTG9naW5Db2RlIjpudWxsLCJkZXZpY2VMb2dpbkNvZGUiOiIrOTE5MzgyNzE1Njc4MTE3MWU2NDNjZTgzLWUwZDAtNDU0ZC04YjA1LTU2MTY5YzM3YmYzZiIsImlhdCI6MTY0NzQ0MDMyNX0.lkXjCmzMJ779Hi7lt0tm71BPEJMtDcIXzU5Tgndv5QM",
            "orgurl:test.theclassroom.biz"})
    @GET("fee/filterwallet")
    Call<GetFilterWalletResponse> filterWalletCall(@Query("status") String status);

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTE3MSwicGhvbmUiOiIrOTE5MzgyNzE1Njc4IiwidXJsIjoidGVzdC50aGVjbGFzc3Jvb20uYml6Iiwib3JnSWQiOiI0Y2IyNTA5ZC03MGY1LTQzNWUtODc5Mi1kMjQ5Mzc3NDNiNTMiLCJicm93c2VyTG9naW5Db2RlIjpudWxsLCJkZXZpY2VMb2dpbkNvZGUiOiIrOTE5MzgyNzE1Njc4MTE3MWU2NDNjZTgzLWUwZDAtNDU0ZC04YjA1LTU2MTY5YzM3YmYzZiIsImlhdCI6MTY0NzQ0MDMyNX0.lkXjCmzMJ779Hi7lt0tm71BPEJMtDcIXzU5Tgndv5QM",
            "orgurl:test.theclassroom.biz"})
    @GET("fee/wallet")
    Call<GetWalletResponse> getWalletCall();

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTE3MSwicGhvbmUiOiIrOTE5MzgyNzE1Njc4IiwidXJsIjoidGVzdC50aGVjbGFzc3Jvb20uYml6Iiwib3JnSWQiOiI0Y2IyNTA5ZC03MGY1LTQzNWUtODc5Mi1kMjQ5Mzc3NDNiNTMiLCJicm93c2VyTG9naW5Db2RlIjpudWxsLCJkZXZpY2VMb2dpbkNvZGUiOiIrOTE5MzgyNzE1Njc4MTE3MWU2NDNjZTgzLWUwZDAtNDU0ZC04YjA1LTU2MTY5YzM3YmYzZiIsImlhdCI6MTY0NzQ0MDMyNX0.lkXjCmzMJ779Hi7lt0tm71BPEJMtDcIXzU5Tgndv5QM",
            "orgurl:test.theclassroom.biz"})
    @PATCH("user/update-contact-info")
    Call<PatchUpdateContactInfoResponse> updateContactInfoCall(@Body PatchUpdateContactInfoRequest patchUpdateContactInfoRequest);

    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTE3MSwicGhvbmUiOiIrOTE5MzgyNzE1Njc4IiwidXJsIjoidGVzdC50aGVjbGFzc3Jvb20uYml6Iiwib3JnSWQiOiI0Y2IyNTA5ZC03MGY1LTQzNWUtODc5Mi1kMjQ5Mzc3NDNiNTMiLCJicm93c2VyTG9naW5Db2RlIjpudWxsLCJkZXZpY2VMb2dpbkNvZGUiOiIrOTE5MzgyNzE1Njc4MTE3MWU2NDNjZTgzLWUwZDAtNDU0ZC04YjA1LTU2MTY5YzM3YmYzZiIsImlhdCI6MTY0NzQ0MDMyNX0.lkXjCmzMJ779Hi7lt0tm71BPEJMtDcIXzU5Tgndv5QM",
            "orgurl:test.theclassroom.biz"})
    @GET("fee/attempt")
    Call<GetAttemptWalletResponse> getAttemptWalletCall(@Query("id") int id,@Query("value") String value);


    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTE3MSwicGhvbmUiOiIrOTE5MzgyNzE1Njc4IiwidXJsIjoidGVzdC50aGVjbGFzc3Jvb20uYml6Iiwib3JnSWQiOiI0Y2IyNTA5ZC03MGY1LTQzNWUtODc5Mi1kMjQ5Mzc3NDNiNTMiLCJicm93c2VyTG9naW5Db2RlIjpudWxsLCJkZXZpY2VMb2dpbkNvZGUiOiIrOTE5MzgyNzE1Njc4MTE3MWU2NDNjZTgzLWUwZDAtNDU0ZC04YjA1LTU2MTY5YzM3YmYzZiIsImlhdCI6MTY0NzQ0MDMyNX0.lkXjCmzMJ779Hi7lt0tm71BPEJMtDcIXzU5Tgndv5QM",
            "orgurl:test.theclassroom.biz"})
    @GET("fee/getcfrt")
    Call<GetCFRTResponse> getCFRTCall(@Query( "orderId") String orderId,@Query("orderAmount") int orderAmount,@Query("orderCurrency") String orderCurrency,@Query("id") int id);


    @Headers({"Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTE3MSwicGhvbmUiOiIrOTE5MzgyNzE1Njc4IiwidXJsIjoidGVzdC50aGVjbGFzc3Jvb20uYml6Iiwib3JnSWQiOiI0Y2IyNTA5ZC03MGY1LTQzNWUtODc5Mi1kMjQ5Mzc3NDNiNTMiLCJicm93c2VyTG9naW5Db2RlIjpudWxsLCJkZXZpY2VMb2dpbkNvZGUiOiIrOTE5MzgyNzE1Njc4MTE3MWU2NDNjZTgzLWUwZDAtNDU0ZC04YjA1LTU2MTY5YzM3YmYzZiIsImlhdCI6MTY0NzQ0MDMyNX0.lkXjCmzMJ779Hi7lt0tm71BPEJMtDcIXzU5Tgndv5QM",
            "orgurl:test.theclassroom.biz"})
    @POST("fee/update")
    Call<PostUpdateFeeResponse> updateFeeCall(@Body PostUpdateFeeRequest postUpdateFeeRequest);


}
