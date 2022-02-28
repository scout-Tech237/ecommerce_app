package com.example.gourmeturca.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.gourmeturca.ApiClient;
import com.example.gourmeturca.R;
import com.example.gourmeturca.activities.DashboardFragments.Cart;
import com.example.gourmeturca.activities.DashboardFragments.Explore;
import com.example.gourmeturca.activities.DashboardFragments.Favorite;
import com.example.gourmeturca.activities.DashboardFragments.Home;
import com.example.gourmeturca.activities.DashboardFragments.Profile;
import com.example.gourmeturca.modalclasses.CartResponse;
import com.example.gourmeturca.utils.GlobalMethods;
import com.example.gourmeturca.utils.SharedPrefUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DashboardActivity extends AppCompatActivity {

    BottomNavigationView bottom_navi;
    BadgeDrawable badge;
    GlobalMethods globalMethods = new GlobalMethods();
    int cart_total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        bottom_navi = findViewById(R.id.bottom_nav_dash);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new Home()).commit();

        //String bad = SharedPrefUtils.getUserData(getApplicationContext()).get(7);
        //String count = globalMethods.refreshCartCount(getApplicationContext());

        //get or refresh token
        SharedPreferences mPref = getSharedPreferences("Token", Context.MODE_PRIVATE);
        //SharedPreferences.Editor editor = mPref.edit();


        String token = mPref.getString("token", null);
        String id = SharedPrefUtils.getUserData(getApplicationContext()).get(0);
        String neww = "true";

        //add badge

        if (id != null ) {
            Call<CartResponse> cartCountResponseCall = ApiClient.getUserService().getCartProducts(id, token, id, neww);
            cartCountResponseCall.enqueue(new Callback<CartResponse>() {
                @Override
                public void onResponse(Call<CartResponse> call, Response<CartResponse> response) {

                    if (!response.isSuccessful()) {
                        Toast.makeText(getApplicationContext(), "Connection error please try again later!", Toast.LENGTH_LONG).show();
                        //refresh token
                        //new GlobalMethods() globalMethods.refreshToken(getContext());


                    } else {
                        cart_total = response.body().getData().getCartTotalCount();
                        badge = bottom_navi.getOrCreateBadge(R.id.cart_icon);
                        badge.setNumber(cart_total);


                    }

                }

                @Override
                public void onFailure(Call<CartResponse> call, Throwable t) {

                }
            });
        }








        bottom_navi.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @org.jetbrains.annotations.NotNull   MenuItem item) {


                Fragment fragment=null;

                switch (item.getItemId()){

                    case R.id.home_icon:
                        fragment = new Home();
                        break;

                    case R.id.explore_icon:
                        fragment = new Explore();
                        break;

                    case R.id.cart_icon:
                        fragment = new Cart();
                        break;

                    case R.id.favorite_icon:
                        fragment = new Favorite();
                        break;

                    case R.id.profile_icon:
                        fragment = new Profile();
                        break;

                    /*default: 
                        throw new IllegalStateException("Unexpected value: " + item.getItemId());*/
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, fragment).commit();

                return true;
            }
        });

    }



}