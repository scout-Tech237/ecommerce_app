package com.example.gourmeturca;

import com.example.gourmeturca.modalclasses.CartResponse;
import com.example.gourmeturca.modalclasses.LoginResponse;
import com.example.gourmeturca.modalclasses.ProductResponse;
import com.example.gourmeturca.modalclasses.TokenRequest;
import com.example.gourmeturca.modalclasses.TokenResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UserService {

    //Login
    @FormUrlEncoded
    @POST("customer/check/")
    Call<LoginResponse> userLogin(
            @Field("email") String email,
            @Field("password") String password,
            @Field("token") String token
    );

    //get products group(Category)
    @FormUrlEncoded
    @POST("product/getProducts/")
    Call<ProductResponse> getCategoryProducts(
            @Field("token") String token,
            @Field("f") String search,
            @Field("limit") String limit
    );

    //refresh token
    @FormUrlEncoded
    @POST("auth/login/portal/")
    Call<TokenResponse> getTokenn(
            @Field("user") String user,
            @Field("pass") String pass

    );

    //search by product name
    @FormUrlEncoded
    @POST("product/get")
    Call<ProductResponse> getSearchResults(
            @Field("token") String token,
            @Query("ProductName") String keyword
    );


    //get products singles
    @FormUrlEncoded
    @POST("product/get/")
    Call<ProductResponse> getActualProducts(
            @Field("token") String token,
            @Field("limit") String limit
    );

    //get Cart items
    @FormUrlEncoded
    @POST("https://gourmeturca.com/rest1/cart/getCart/{userId}")
    Call<CartResponse> getCartProducts(
            @Path("userId") String userId,
            @Field("token") String token,
            @Field("customer_id") String customerId,
            @Field("new") String neww
    );

    //get products by CATEGORY ID
    @FormUrlEncoded
    @POST("product/get/")
    Call<ProductResponse> getProductsById(
            @Field("token") String token,
            @Field("CategoryIds") String categoryId
    );

    //get single product
    @FormUrlEncoded
    @POST("product/get/")
    Call<ProductResponse> getSingleProducts(
            @Field("token") String token,
            @Field("ProductId") String productId,
            @Field("FetchDetails") String fetchDetails,
            @Field("FetchImageUrls") String fetchImageUrls
    );


}
