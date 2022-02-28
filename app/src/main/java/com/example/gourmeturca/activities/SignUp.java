package com.example.gourmeturca.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gourmeturca.R;

public class SignUp extends AppCompatActivity {

    Spinner spinner;
    TextView loginFromSignup;


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        spinner = (Spinner) findViewById(R.id.country_list);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.countryCodes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        loginFromSignup = findViewById(R.id.signin_from_signup);
        loginFromSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }
        });

    }


}