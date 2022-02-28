package com.example.gourmeturca.utils;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

import com.example.gourmeturca.Adapters.CartAdapter;
import com.example.gourmeturca.Adapters.SearchListAdapter;
import com.example.gourmeturca.ApiClient;
import com.example.gourmeturca.modalclasses.CartResponse;
import com.example.gourmeturca.modalclasses.DatumToken;
import com.example.gourmeturca.modalclasses.TokenRequest;
import com.example.gourmeturca.modalclasses.TokenResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GlobalMethods {

    private List<DatumToken> tokenData;

    public  void refreshToken(Context context){
        TokenRequest tokenRequest = new TokenRequest();
        tokenRequest.setUser("user");
        tokenRequest.setPass("******");

        Call<TokenResponse> tokenResponseCall = ApiClient.getUserService().getTokenn("portal", "238465Ck*");
        tokenResponseCall.enqueue(new Callback<TokenResponse>() {
            @Override
            public void onResponse(Call<TokenResponse> call, Response<TokenResponse> response) {
                tokenData = response.body().getData();
                TokenResponse tokenResponse = response.body();
                Log.d("response", tokenResponse.toString());


                if(tokenResponse.getSuccess()){
                    SharedPreferences.Editor editor = context.getSharedPreferences("Token", MODE_PRIVATE).edit();
                    editor.putString("token", tokenData.get(0).getToken().toString());
                    editor.apply();

                    //Toast.makeText(context, tokenData.get(0).getToken(), Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(context,"Connection error please try again later!", Toast.LENGTH_LONG).show();
                    //finishAndRemoveTask();


                }
            }

            @Override
            public void onFailure(Call<TokenResponse> call, Throwable t) {

            }
        });

    }

    public String refreshCartCount(Context context){

        //get or refresh token
        SharedPreferences mPref = context.getSharedPreferences("Token", Context.MODE_PRIVATE);
        //SharedPreferences.Editor editor = mPref.edit();

        String token = mPref.getString("token", null);
        String id = SharedPrefUtils.getUserData(context).get(0);
        String neww = "true";
        final String[] cart_total_count = new String[1];


        Call<CartResponse> cartCountResponseCall = ApiClient.getUserService().getCartProducts(id, token, id, neww);
        cartCountResponseCall.enqueue(new Callback<CartResponse>() {
            @Override
            public void onResponse(Call<CartResponse> call, Response<CartResponse> response) {

                if(!response.isSuccessful()){
                    Toast.makeText(context,"Connection error please try again later!", Toast.LENGTH_LONG).show();
                    //refresh token
                    //new GlobalMethods() globalMethods.refreshToken(getContext());


                }else {
                    int cart_total = response.body().getData().getCartTotalCount();
                    cart_total_count[0] = String.valueOf(cart_total);


                }

            }

            @Override
            public void onFailure(Call<CartResponse> call, Throwable t) {

            }
        });

        return cart_total_count[0];

    }

    /**
     * global class for add to cart
     */
    public void addTtoCartMethod(Context context, String productId, CardView addtoCart, CardView pmbar, TextView countText){
        //Toast.makeText(context, productId , Toast.LENGTH_SHORT).show();
        addtoCart.setVisibility(View.GONE);
        String currentCount = countText.getText().toString();
        int currentCountInteger = Integer.parseInt(currentCount);
        currentCountInteger++;
        countText.setText(String.valueOf(currentCountInteger));
        pmbar.setVisibility(View.VISIBLE);
    }

    public void plusOneProduct(Context context, String productId, CardView addtoCart, CardView pmbar, TextView countText){

        String currentCount = countText.getText().toString();
        int currentCountInteger = Integer.parseInt(currentCount);
        currentCountInteger++;
        countText.setText(String.valueOf(currentCountInteger));

    }

    public void minusOneProduct(Context context, String productId, CardView addtoCart, CardView pmbar, TextView countText){

        String currentCount = countText.getText().toString();
        int currentCountInteger = Integer.parseInt(currentCount);
        currentCountInteger--;
        countText.setText(String.valueOf(currentCountInteger));

        if (currentCountInteger == 0){
            addtoCart.setVisibility(View.VISIBLE);
            pmbar.setVisibility(View.GONE);
        }

    }


}
