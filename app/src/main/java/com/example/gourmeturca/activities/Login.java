package com.example.gourmeturca.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.gourmeturca.ApiClient;
import com.example.gourmeturca.R;
import com.example.gourmeturca.modalclasses.Datum;
import com.example.gourmeturca.modalclasses.LoginResponse;
import com.example.gourmeturca.modalclasses.Messages;
import com.example.gourmeturca.utils.GlobalMethods;
import com.example.gourmeturca.utils.SharedPrefUtils;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {


    EditText username, password;
    Button btnLogin;
    private List<Datum> arraylist;
    private List<Messages> messagesList;
    String error, token;
    GlobalMethods globalMethods = new GlobalMethods();
    boolean is_logged_in;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //Initializing views
        username = findViewById(R.id.edUsername);
        password = findViewById(R.id.edPassword);
        btnLogin = findViewById(R.id.btnLogin);
        arraylist = new ArrayList<>();
        messagesList = new ArrayList<>();

        //get or refresh token
        SharedPreferences mPref = this.getSharedPreferences("Token", Context.MODE_PRIVATE);
        //SharedPreferences.Editor editor = mPref.edit();

        token = mPref.getString("token", null);



        //login button clicked
        btnLogin.setOnClickListener(view -> {

            if(TextUtils.isEmpty(Objects.requireNonNull(username.getText()).toString()) || TextUtils.isEmpty(Objects.requireNonNull(password.getText()).toString())){
                Toast.makeText(Login.this,"Email or password cannot be empty", Toast.LENGTH_LONG).show();
            }else{
                //proceed to login
                login();
            }

        });

    }

    private void login() {

        Call<LoginResponse> loginResponseCall = ApiClient.getUserService().userLogin(Objects.requireNonNull(username.getText()).toString(), Objects.requireNonNull(password.getText()).toString(), token);
        loginResponseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(@NonNull Call<LoginResponse> call, @NonNull Response<LoginResponse> response) {

                if(!response.isSuccessful()){
                    Toast.makeText(Login.this,"Connection error please try again!", Toast.LENGTH_LONG).show();
                    //refresh token
                    globalMethods.refreshToken(getApplicationContext());
                    finish();
                    startActivity(getIntent());

                }else{

                    assert response.body() != null;
                    //get success message
                    Boolean success = response.body().getSuccess();
                    messagesList = response.body().getMessage();
                    //arraylist = response.body().getData();


                    if (success){

                        //get successful data
                        String id = response.body().getData().get(0).getId();
                        String name = response.body().getData().get(0).getName();
                        String surname = response.body().getData().get(0).getSurname();
                        String email = response.body().getData().get(0).getEmail();
                        String Onay = response.body().getData().get(0).getOnay();
                        String mail_notify = response.body().getData().get(0).getMailNotify();
                        String sms_notify = response.body().getData().get(0).getSmsNotify();
                        int cart_total = response.body().getData().get(0).getCartTotalCount();
                        String cart_total_count = String.valueOf(cart_total);
                        String mobile_token = response.body().getData().get(0).getMobileToken();
                        String mobile_phone = response.body().getData().get(0).getMobilePhone();

                        is_logged_in = true;
                        //save user data to sharedpreferences
                        SharedPrefUtils.saveDataOnLogin(is_logged_in, id, name, surname, email, Onay, mail_notify, sms_notify, cart_total_count, mobile_token, mobile_phone, getApplicationContext() );
                        new Handler().postDelayed(() -> startActivity(new Intent(Login.this, DashboardActivity.class)),700);
                    } else {

                        //error message from API
                        error = messagesList.get(0).getText().get(0);

                        //Toast various errors
                        //1.if email or password incorrect
                        if (error.equals("Hatalı veya eksik e-posta adresi veya parola.")) {
                            Toast.makeText(Login.this, "Incorrect email address or password.", Toast.LENGTH_LONG).show();
                        }
                        //2. if token is incorrect
                        else if ((error.equals("Token bulunamadı!")) || (error.equals("Geçersiz token, lütfen giriş yapın!"))){


                            Toast.makeText(Login.this, "Please try again later!", Toast.LENGTH_LONG).show();
                        }
                        //3.Any other error
                        else {
                            Toast.makeText(Login.this, error, Toast.LENGTH_LONG).show();
                        }
                    }


                }

            }

            @Override
            public void onFailure(@NonNull Call<LoginResponse> call, @NonNull Throwable t) {
                Toast.makeText(Login.this,"Throwable "+t.getLocalizedMessage(), Toast.LENGTH_LONG).show();

            }
        });



    }
}