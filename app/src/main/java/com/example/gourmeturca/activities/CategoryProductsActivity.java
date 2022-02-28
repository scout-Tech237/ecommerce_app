package com.example.gourmeturca.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gourmeturca.Adapters.CategoryProductsAdapter;
import com.example.gourmeturca.Adapters.SearchListAdapter;
import com.example.gourmeturca.ApiClient;
import com.example.gourmeturca.R;
import com.example.gourmeturca.modalclasses.Datum1;
import com.example.gourmeturca.modalclasses.ProductResponse;
import com.example.gourmeturca.utils.GlobalMethods;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CategoryProductsActivity extends AppCompatActivity {

    String categoryName,categoryID;
    TextView heading;
    RecyclerView productsRecycler;
    CategoryProductsAdapter categoryProductsAdapter;
    private List<Datum1> productlist;
    GlobalMethods globalMethods = new GlobalMethods();
    String token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_products_acticity);


        heading = findViewById(R.id.category_products_toolbar_title);
        productsRecycler = findViewById(R.id.category_product_list);

        categoryID = getIntent().getExtras().getString("categoryID");
        categoryName = getIntent().getExtras().getString("categoryName");

        heading.setText(categoryName);

        productlist = new ArrayList<>();

        productsRecycler.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2, LinearLayoutManager.VERTICAL,false);
        productsRecycler.setLayoutManager(gridLayoutManager);
        productsRecycler.setHasFixedSize(true);

        //get token from shared preference
        SharedPreferences mPref = getSharedPreferences("Token", Context.MODE_PRIVATE);

        token = mPref.getString("token", null);

        getCategoryProducts();


    }

    private void getCategoryProducts() {

        Call<ProductResponse> productResponseCall = ApiClient.getUserService().getProductsById(token,categoryID);

        productResponseCall.enqueue(new Callback<ProductResponse>() {
            @Override
            public void onResponse(Call<ProductResponse> call, Response<ProductResponse> response) {

                if(!response.isSuccessful()){
                    Toast.makeText(CategoryProductsActivity.this,"Connection error please try again later!", Toast.LENGTH_LONG).show();
                    //refresh token
                    globalMethods.refreshToken(getApplicationContext());
                    finish();
                    startActivity(getIntent());

                }else {
                    productlist = response.body().getData();

                    categoryProductsAdapter = new CategoryProductsAdapter(getApplicationContext(), productlist);
                    productsRecycler.setAdapter(categoryProductsAdapter);
                    categoryProductsAdapter.notifyDataSetChanged();

                }

            }

            @Override
            public void onFailure(Call<ProductResponse> call, Throwable t) {

                Toast.makeText(CategoryProductsActivity.this,"Connection error please try again later!", Toast.LENGTH_LONG).show();
                //refresh token
                globalMethods.refreshToken(getApplicationContext());
                finish();
                startActivity(getIntent());

            }
        });

    }
}