package com.example.gourmeturca.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.SearchManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.Toast;

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

public class SearchActivty extends AppCompatActivity {

    RecyclerView search_list, fastRecycler, bigRecycler, otherRecycler;
    LinearLayout apply_filter;
    CardView filter_btn, hide_filter;
    SearchListAdapter searchListAdapter;
    private List<Datum1> productlist;
    GlobalMethods globalMethods = new GlobalMethods();
    String token;
    SearchView searchView;

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_activty);

        search_list = findViewById(R.id.search_list);
        searchView = findViewById(R.id.search_view);
        productlist = new ArrayList<>();

        search_list.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2, LinearLayoutManager.VERTICAL,false);
        search_list.setLayoutManager(gridLayoutManager);
        search_list.setHasFixedSize(true);

        //get token from shared preference
        SharedPreferences mPref = getSharedPreferences("Token", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = mPref.edit();

        token = mPref.getString("token", null);


        //searching setup
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName())
        );
        searchView.setIconifiedByDefault(false);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                getSearch(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                getSearch(newText);
                return false;
            }
        });



    }

    private void getSearch(String key) {

        Call<ProductResponse> searchResponseCall = ApiClient.getUserService().getSearchResults(token,key);

        searchResponseCall.enqueue(new Callback<ProductResponse>() {
            @Override
            public void onResponse(Call<ProductResponse> call, Response<ProductResponse> response) {

                if(!response.isSuccessful()){
                    Toast.makeText(SearchActivty.this,"Connection error please try again later!", Toast.LENGTH_LONG).show();
                    //refresh token
                    globalMethods.refreshToken(getApplicationContext());
                    finish();
                    startActivity(getIntent());

                }else {
                    productlist = response.body().getData();

                    searchListAdapter = new SearchListAdapter(getApplicationContext(), productlist);
                    search_list.setAdapter(searchListAdapter);
                    searchListAdapter.notifyDataSetChanged();

                }

            }

            @Override
            public void onFailure(Call<ProductResponse> call, Throwable t) {
                Toast.makeText(SearchActivty.this,"Connection error please try again later!", Toast.LENGTH_LONG).show();
                //refresh token
                globalMethods.refreshToken(getApplicationContext());
                finish();
                startActivity(getIntent());
            }
        });



    }

    private void setFilter(View view) {
        if (view.getId() == R.id.filter_btn){
            apply_filter.setVisibility(View.VISIBLE);
            return;
        }
        apply_filter.setVisibility(View.GONE);
    }
}