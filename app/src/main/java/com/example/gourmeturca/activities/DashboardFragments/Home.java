package com.example.gourmeturca.activities.DashboardFragments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.gourmeturca.Adapters.CategoriesAdapter;
import com.example.gourmeturca.Adapters.FavouriteAdapter;
import com.example.gourmeturca.Adapters.Recylcler2Adapter;
import com.example.gourmeturca.Adapters.Recylcler3Adapter;
import com.example.gourmeturca.Adapters.SearchListAdapter;
import com.example.gourmeturca.ApiClient;
import com.example.gourmeturca.R;
import com.example.gourmeturca.activities.CampaignsPage;
import com.example.gourmeturca.activities.CategoryActivity;
import com.example.gourmeturca.activities.SearchActivty;
import com.example.gourmeturca.modalclasses.Datum1;
import com.example.gourmeturca.modalclasses.FavouriteModalClass;
import com.example.gourmeturca.modalclasses.ProductResponse;
import com.example.gourmeturca.utils.GlobalMethods;
import com.example.gourmeturca.utils.SharedPrefUtils;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Home extends Fragment {

    //widgets
    ImageSlider view_fliper ;
    RecyclerView categories, offre_recycle, recycle2, recycle3;

    //firebase
    DatabaseReference myRef;
    //FirebaseDatabase mDatabase;
    //DatabaseReference mRef, mRef1,mRef2,mRef3, mRef4, mRef5, mRef6, mRef7;

    //variables
    List<SlideModel> slideModels;
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mTitles = new ArrayList<>();
    private ArrayList<FavouriteModalClass> favouriteModalClassArrayList;
    private ArrayList<FavouriteModalClass> favouriteModalClassArrayList2;
    private ArrayList<FavouriteModalClass> favouriteModalClassArrayList3;
    private FavouriteAdapter favouriteAdapter;
    private Recylcler2Adapter recylcler2Adapter;
    private Recylcler3Adapter recylcler3Adapter;
    String token, cus;
    GlobalMethods globalMethods = new GlobalMethods();
    private List<Datum1> productlist;

    CardView searsh_btn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        view_fliper =  view.findViewById(R.id.view_fliper);
        slideModels = new ArrayList<>();
        categories = view.findViewById(R.id.categories);
        offre_recycle = view.findViewById(R.id.offre_recycle);
        recycle2 = view.findViewById(R.id.recycle2);
        recycle3 = view.findViewById(R.id.recycle3);
        
        
        /** 
         * test for retrieve shared preferences 
         * */
        SharedPreferences mPref = getActivity().getSharedPreferences("Token", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = mPref.edit();
        
        token = mPref.getString("token", null);



        //Add campaign images
        slideModels.add(new SlideModel("https://www.gourmeturca.com/Data/EditorFiles/campaignsNew/weeklyOffers/slider5c.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.gourmeturca.com/Data/EditorFiles/campaignsNew/weeklyOffers/chestnutslider.jpg",  ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.gourmeturca.com/Data/EditorFiles/campaignsNew/weeklyOffers/app-download.jpg",  ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.gourmeturca.com/Data/EditorFiles/campaignsNew/weeklyOffers/only1dolars.jpg", ScaleTypes.FIT));

        view_fliper.setImageList(slideModels);

        view_fliper.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemSelected(int i) {
                startActivity(new Intent(getActivity(), CampaignsPage.class));
            }
        });
        //////////////////

        //Category Recyclerview
            categories.setHasFixedSize(true);
            LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
            categories.setLayoutManager(layoutManager);
            getImages();
            CategoriesAdapter adapter = new CategoriesAdapter(getActivity(), mImageUrls, mTitles);
            categories.setAdapter(adapter);
        //////////////:

        //Favourite Recyclerview
            offre_recycle.setHasFixedSize(true);
            LinearLayoutManager layoutManager1 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
            offre_recycle.setLayoutManager(layoutManager1);

            //clear list before inflate
            ClearAll();

            //get list data from firebase
            getFavourites();

        ////////////////////

        //Recycle2 Recyclerview
            recycle2.setHasFixedSize(true);
            LinearLayoutManager layoutManager2 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
            recycle2.setLayoutManager(layoutManager2);

            //clear list before inflate
            ClearAll1();

            //get list data from firebase
            getRecycle2();
        ////////////////////

        //Recycle3 Recyclerview
            recycle3.setHasFixedSize(true);
            LinearLayoutManager layoutManager3 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
            recycle3.setLayoutManager(layoutManager3);

            //clear list before inflate
            ClearAll2();

            //get list data from firebase
            getRecycle3();
        ////////////////////


        searsh_btn = view.findViewById(R.id.searsh_btn);

        return view;
    }


    private void getRecycle2()  {



        Call<ProductResponse> bigBestSellerResponse = ApiClient.getUserService().getActualProducts(token,"10");
        bigBestSellerResponse.enqueue(new Callback<ProductResponse>() {
            @Override
            public void onResponse(Call<ProductResponse> call, Response<ProductResponse> response) {
                if(!response.isSuccessful()){
                    Toast.makeText(getActivity(),"Connection error please try again later!", Toast.LENGTH_LONG).show();
                    //refresh token
                    globalMethods.refreshToken(getContext());


                }else {
                    productlist = response.body().getData();

                    recylcler2Adapter = new Recylcler2Adapter(getContext(), productlist);
                    recycle2.setAdapter(recylcler2Adapter);
                    recylcler2Adapter.notifyDataSetChanged();

                }
            }

            @Override
            public void onFailure(Call<ProductResponse> call, Throwable t) {
                Toast.makeText(getContext(),"Connection error please try again later!", Toast.LENGTH_LONG).show();
                //refresh token
                globalMethods.refreshToken(getActivity());
            }
        });


    }

    private void getRecycle3() {


        Call<ProductResponse> newProducts = ApiClient.getUserService().getActualProducts(token, "10");
        newProducts.enqueue(new Callback<ProductResponse>() {
            @Override
            public void onResponse(Call<ProductResponse> call, Response<ProductResponse> response) {
                if(!response.isSuccessful()){
                    Toast.makeText(getActivity(),"Connection error please try again later!", Toast.LENGTH_LONG).show();
                    //refresh token
                    globalMethods.refreshToken(getContext());


                }else {
                    productlist = response.body().getData();

                    recylcler3Adapter = new Recylcler3Adapter(getContext(), productlist);
                    recycle3.setAdapter(recylcler3Adapter);
                    recylcler3Adapter.notifyDataSetChanged();

                }
            }

            @Override
            public void onFailure(Call<ProductResponse> call, Throwable t) {
                Toast.makeText(getContext(),"Connection error please try again later!", Toast.LENGTH_LONG).show();
                //refresh token
                globalMethods.refreshToken(getActivity());
            }
        });

    }

    private void getFavourites() {

        Call<ProductResponse> fastGourmeProductsBestSeller = ApiClient.getUserService().getActualProducts(token, "10");
        fastGourmeProductsBestSeller.enqueue(new Callback<ProductResponse>() {
            @Override
            public void onResponse(Call<ProductResponse> call, Response<ProductResponse> response) {
                if(!response.isSuccessful()){
                    Toast.makeText(getActivity(),"Connection error please try again later!", Toast.LENGTH_LONG).show();
                    //refresh token
                    globalMethods.refreshToken(getContext());


                }else {
                    productlist = response.body().getData();

                    favouriteAdapter = new FavouriteAdapter(getContext(), productlist);
                    offre_recycle.setAdapter(favouriteAdapter);
                    favouriteAdapter.notifyDataSetChanged();

                }
            }

            @Override
            public void onFailure(Call<ProductResponse> call, Throwable t) {
                Toast.makeText(getContext(),"Connection error please try again later!", Toast.LENGTH_LONG).show();
                //refresh token
                globalMethods.refreshToken(getActivity());
            }
        });

    }

    private void ClearAll(){
        if (productlist != null){
            productlist.clear();
            if (favouriteAdapter != null){
                favouriteAdapter.notifyDataSetChanged();
            }
        }
        productlist = new ArrayList<>();
    }

    private void ClearAll1(){
        if (favouriteModalClassArrayList2 != null){
            favouriteModalClassArrayList2.clear();
            if (recylcler2Adapter != null){
                recylcler2Adapter.notifyDataSetChanged();
            }
        }
        favouriteModalClassArrayList2 = new ArrayList<>();
    }

    private void ClearAll2(){
        if (favouriteModalClassArrayList3 != null){
            favouriteModalClassArrayList3.clear();
            if (recylcler3Adapter != null){
                recylcler3Adapter.notifyDataSetChanged();
            }
        }
        favouriteModalClassArrayList3 = new ArrayList<>();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        searsh_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(getActivity(), CategoryActivity.class));
                startActivity(new Intent(getActivity(), SearchActivty.class));
            }
        });

    }

    private void getImages(){
        mImageUrls.add("https://www.gourmeturca.com/Data/Kategori/88.jpg");
        mTitles.add("Spread");

        mImageUrls.add("https://www.gourmeturca.com/Data/EditorFiles/fastCategory/dessert.jpg");
        mTitles.add("Dessert & Bakery");

        mImageUrls.add("https://www.gourmeturca.com/Data/EditorFiles/moreCategory/home.jpg");
        mTitles.add("Home Decoration");

        mImageUrls.add("https://www.gourmeturca.com/Data/EditorFiles/moreCategory/bath.jpg");
        mTitles.add("Bath");

        mImageUrls.add("https://www.gourmeturca.com/Data/EditorFiles/moreCategory/beverages.jpg");
        mTitles.add("Beverages");

        mImageUrls.add("https://www.gourmeturca.com/Data/EditorFiles/fastCategory/kitchen.jpg");
        mTitles.add("Kitchen & Dinning");


    }





}