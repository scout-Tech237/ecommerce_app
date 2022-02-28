package com.example.gourmeturca.activities.DashboardFragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.gourmeturca.Adapters.CartAdapter;
import com.example.gourmeturca.Adapters.FavouriteAdapter;
import com.example.gourmeturca.Adapters.Recylcler2Adapter;
import com.example.gourmeturca.ApiClient;
import com.example.gourmeturca.R;
import com.example.gourmeturca.modalclasses.CartProduct;
import com.example.gourmeturca.modalclasses.CartResponse;
import com.example.gourmeturca.modalclasses.Datum1;
import com.example.gourmeturca.utils.GlobalMethods;
import com.example.gourmeturca.utils.SharedPrefUtils;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Cart extends Fragment {

    RecyclerView cartList;
    String token, customerId;
    GlobalMethods globalMethods = new GlobalMethods();
    private List<CartProduct> productlist;
    private CartAdapter cartAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        cartList = view.findViewById(R.id.cart_list);

        /**
         * test for retrieve shared preferences
         * */
        SharedPreferences mPref = getActivity().getSharedPreferences("Token", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = mPref.edit();

        token = mPref.getString("token", null);
        customerId = SharedPrefUtils.getUserData(getActivity()).get(0);

        //cart Recyclerview
        cartList.setHasFixedSize(true);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        cartList.setLayoutManager(layoutManager1);

        //clear list before inflate
        //ClearAll();

        //get list data from firebase
        getCart();

        return view;
    }

    private void getCart() {

        Call<CartResponse> cartResponseCall = ApiClient.getUserService().getCartProducts(customerId,token, customerId, "true");
        cartResponseCall.enqueue(new Callback<CartResponse>() {
            @Override
            public void onResponse(Call<CartResponse> call, Response<CartResponse> response) {
                if(!response.isSuccessful()){
                    Toast.makeText(getActivity(),"Connection error please try again later!", Toast.LENGTH_LONG).show();
                    //refresh token
                    globalMethods.refreshToken(getContext());


                }else {
                    productlist = response.body().getData().getProducts();
                    ArrayList<String> ids = new ArrayList<>();
                    for (int i = 0; i <productlist.size(); i++){
                        ids.add(productlist.get(i).getId().toString());
                        Log.d("LIStttttttttt", ids.toString());
                    }

                    cartAdapter = new CartAdapter(getContext(), productlist);
                    cartList.setAdapter(cartAdapter);
                    cartAdapter.notifyDataSetChanged();

                }
            }

            @Override
            public void onFailure(Call<CartResponse> call, Throwable t) {
                Toast.makeText(getContext(),"Connection error please try again later!", Toast.LENGTH_LONG).show();
                //refresh token
                globalMethods.refreshToken(getActivity());
            }
        });

    }


}