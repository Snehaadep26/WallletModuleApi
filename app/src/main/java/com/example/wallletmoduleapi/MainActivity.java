package com.example.wallletmoduleapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.wallletmoduleapi.WalletApi.ApiClient;
import com.example.wallletmoduleapi.WalletApi.GetAttemptWalletResponse;
import com.example.wallletmoduleapi.WalletApi.GetCFRTResponse;
import com.example.wallletmoduleapi.WalletApi.GetFilterWalletResponse;
import com.example.wallletmoduleapi.WalletApi.GetWalletResponse;
import com.example.wallletmoduleapi.WalletApi.LogInService;
import com.example.wallletmoduleapi.WalletApi.PatchUpdateContactInfoRequest;
import com.example.wallletmoduleapi.WalletApi.PatchUpdateContactInfoResponse;
import com.example.wallletmoduleapi.WalletApi.PostUpdateFeeRequest;
import com.example.wallletmoduleapi.WalletApi.PostUpdateFeeResponse;
import com.example.wallletmoduleapi.WalletApi.Transaction;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    Retrofit retrofit;
    LogInService logInService;
    GetFilterWalletResponse getFilterWalletResponse;
    GetWalletResponse getWalletResponse;
    PatchUpdateContactInfoRequest patchUpdateContactInfoRequest;
    PatchUpdateContactInfoResponse patchUpdateContactInfoResponse;
    GetAttemptWalletResponse getAttemptWalletResponse;
    GetCFRTResponse getCFRTResponse;
    PostUpdateFeeRequest postUpdateFeeRequest;
    PostUpdateFeeResponse postUpdateFeeResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiInIt();
        filterWallet();
        getWallet();
        updateContactInfo();
        getAttempt();
        getCFRT();
        updateFee();
    }
    public void filterWallet()
    {
        Call<GetFilterWalletResponse> call= logInService.filterWalletCall("Link Sent");
        call.enqueue(new Callback<GetFilterWalletResponse>() {
            @Override
            public void onResponse(Call<GetFilterWalletResponse> call, Response<GetFilterWalletResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getFilterWalletResponse=response.body();
                Transaction response1=getFilterWalletResponse.transactions.get(1);
                Toast.makeText(getApplicationContext(), String.valueOf(response1.linkSentBy), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<GetFilterWalletResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error in filter wallet", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void getWallet()
    {
        Call<GetWalletResponse> call=logInService.getWalletCall();
        call.enqueue(new Callback<GetWalletResponse>() {
            @Override
            public void onResponse(Call<GetWalletResponse> call, Response<GetWalletResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getWalletResponse=response.body();
                Toast.makeText(getApplicationContext(), String.valueOf(getWalletResponse.totalLinksRequested.amount), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<GetWalletResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error in wallet", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void updateContactInfo()
    {
        patchUpdateContactInfoRequest=new PatchUpdateContactInfoRequest("jagadevi.vasare+Student1@brigosha.com");
        Call<PatchUpdateContactInfoResponse> call=logInService.updateContactInfoCall(patchUpdateContactInfoRequest);
        call.enqueue(new Callback<PatchUpdateContactInfoResponse>() {
            @Override
            public void onResponse(Call<PatchUpdateContactInfoResponse> call, Response<PatchUpdateContactInfoResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                patchUpdateContactInfoResponse=response.body();
                Toast.makeText(getApplicationContext(), String.valueOf(patchUpdateContactInfoResponse.show.message), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<PatchUpdateContactInfoResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error update contact info", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void getAttempt()
    {
        Call<GetAttemptWalletResponse> call=logInService.getAttemptWalletCall(659,"null");
        call.enqueue(new Callback<GetAttemptWalletResponse>() {
            @Override
            public void onResponse(Call<GetAttemptWalletResponse> call, Response<GetAttemptWalletResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getAttemptWalletResponse=response.body();
                Toast.makeText(getApplicationContext(), String.valueOf(getAttemptWalletResponse.message), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<GetAttemptWalletResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error attempt wallet", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void getCFRT()
    {
        Call<GetCFRTResponse> call=logInService.getCFRTCall("4cb2509d-70f5-435e-8792-d24937743b53",24,"INR",632);
        call.enqueue(new Callback<GetCFRTResponse>() {
            @Override
            public void onResponse(Call<GetCFRTResponse> call, Response<GetCFRTResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getCFRTResponse=response.body();
                Toast.makeText(getApplicationContext(), String.valueOf(getCFRTResponse.status), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<GetCFRTResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error CFRT", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void updateFee()
    {
        postUpdateFeeRequest=new PostUpdateFeeRequest(659,1171,382,"4cb2509d-70f5-435e-8792-d24937743b53","Overdue");
        Call<PostUpdateFeeResponse> call=logInService.updateFeeCall(postUpdateFeeRequest);
        call.enqueue(new Callback<PostUpdateFeeResponse>() {
            @Override
            public void onResponse(Call<PostUpdateFeeResponse> call, Response<PostUpdateFeeResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                postUpdateFeeResponse=response.body();
                Toast.makeText(getApplicationContext(), postUpdateFeeResponse.message, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<PostUpdateFeeResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error in update fee" , Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void apiInIt()
    {
        retrofit= ApiClient.getRetrofit();
        logInService= ApiClient.getLoginService();
    }
}