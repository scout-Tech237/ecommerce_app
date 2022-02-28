package com.example.gourmeturca.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.gourmeturca.Adapters.Recylcler2Adapter;
import com.example.gourmeturca.Adapters.SingleProductAdapter;
import com.example.gourmeturca.ApiClient;
import com.example.gourmeturca.R;
import com.example.gourmeturca.modalclasses.Datum1;
import com.example.gourmeturca.modalclasses.Image2;
import com.example.gourmeturca.modalclasses.ProductResponse;
import com.example.gourmeturca.modalclasses.SingleProductUrlsModalClass;
import com.example.gourmeturca.utils.GlobalMethods;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SingleProductDetail extends AppCompatActivity {

    String productId;
    RecyclerView sideImages;
    String token;
    GlobalMethods globalMethods = new GlobalMethods();
    private List<Datum1> productlist;
    private List<Image2> productlisturl;
    SingleProductAdapter singleProductAdapter;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_product_detail);


        SharedPreferences mPref = getSharedPreferences("Token", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = mPref.edit();

        token = mPref.getString("token", null);

        productId = getIntent().getStringExtra("productID");
        //Toast.makeText(getApplicationContext(), productId, Toast.LENGTH_LONG).show();
        sideImages = findViewById(R.id.side_img);
        image = findViewById(R.id.imageview_single_item);

        sideImages.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        sideImages.setLayoutManager(layoutManager);

        getData();




    }


    private void getData()  {



        Call<ProductResponse> bigBestSellerResponse = ApiClient.getUserService().getSingleProducts(token,productId,"true","true");
        bigBestSellerResponse.enqueue(new Callback<ProductResponse>() {
            @Override
            public void onResponse(Call<ProductResponse> call, Response<ProductResponse> response) {
                if(!response.isSuccessful()){
                    Toast.makeText(getApplicationContext(),"Connection error please try again later!", Toast.LENGTH_LONG).show();
                    //refresh token
                    globalMethods.refreshToken(getApplicationContext());


                }else {
                    productlisturl = response.body().getData().get(0).getImageUrls();
                    //productlisturl.addAll(response.body().getData().get(0).getImageUrls());

                    singleProductAdapter = new SingleProductAdapter(getApplicationContext(), productlisturl);
                    sideImages.setAdapter(singleProductAdapter);



                    singleProductAdapter.notifyDataSetChanged();

                }
            }

            @Override
            public void onFailure(Call<ProductResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Connection error please try again later!", Toast.LENGTH_LONG).show();
                //refresh token
                globalMethods.refreshToken(getApplicationContext());
            }
        });


    }


}