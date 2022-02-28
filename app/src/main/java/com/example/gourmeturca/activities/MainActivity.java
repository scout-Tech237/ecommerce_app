package com.example.gourmeturca.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.text.Html;
import android.util.Log;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gourmeturca.Adapters.SearchListAdapter;
import com.example.gourmeturca.ApiClient;
import com.example.gourmeturca.R;
import com.example.gourmeturca.modalclasses.Datum1;
import com.example.gourmeturca.modalclasses.DatumToken;
import com.example.gourmeturca.modalclasses.ProductResponse;
import com.example.gourmeturca.modalclasses.TokenRequest;
import com.example.gourmeturca.modalclasses.TokenResponse;
import com.example.gourmeturca.utils.Constants;
import com.example.gourmeturca.utils.GlobalMethods;
import com.example.gourmeturca.utils.SharedPrefUtils;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    TextView splashName;
    ImageView logo;
    CharSequence charSequence;
    int index;
    long delay = 200;
    Handler handler = new Handler();
    SharedPreferences firstTimeUser;
    private List<DatumToken> tokenData;
    String token;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //get token
        GlobalMethods globalMethods = new GlobalMethods();
        globalMethods.refreshToken(this);

        //SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        splashName = findViewById(R.id.splash_name);
        logo = findViewById(R.id.logo_image);
        tokenData = new ArrayList<>();



        //Set fill screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN
        ,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        //initialize object animation
        ObjectAnimator objectAnimator = ObjectAnimator.ofPropertyValuesHolder(
           logo,
           PropertyValuesHolder.ofFloat("scaleX", 1.2f),
           PropertyValuesHolder.ofFloat("scaleY", 1.2f)
        );

        //set duration
        objectAnimator.setDuration(500);
        //set repeat count
        objectAnimator.setRepeatCount(ValueAnimator.INFINITE);
        //set repeat mode
        objectAnimator.setRepeatMode(ValueAnimator.REVERSE);
        //START animation
        objectAnimator.start();

        //Set animation text
        animateText(Html.fromHtml("GOURMETURCA.COM<sup>TM</sup>"));

        //initialize top animation
        Animation animation = AnimationUtils.loadAnimation(this,
                R.anim.top_wave);
        //start top animation
        logo.setAnimation(animation);

        //initialize handler
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /**
                 * Check if user is first time user and send them to on boarding
                 */
                firstTimeUser = getSharedPreferences("firstTimeUser", MODE_PRIVATE);
                boolean isFirstTime = firstTimeUser.getBoolean("firstTime", true);

                if (isFirstTime){

                    SharedPreferences.Editor editor = firstTimeUser.edit();
                    editor.putBoolean("firstTime", false);
                    editor.apply();

                    startActivity(new Intent(getApplicationContext(), WalkThroughScreen.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
                } else {
                    //This method will be executed once the timer is over
                    // Start your app main activity
                    startActivity(new Intent(getApplicationContext(), DashboardActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
                    // close this activity
                }
                finish();


            }
        }, 5000);
    }



    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            //when runnable is run
            //set text
            splashName.setText(charSequence.subSequence(0, index++));
            //check condition
            if (index <= charSequence.length()){
                //when i ndex is equal to text length
                //run handler
                handler.postDelayed(runnable, delay);
            }
        }
    };

    //create animated text method
    public void animateText(CharSequence cs){
        //set text
        charSequence = cs;
        //clear index
        index = 0;
        //clear text
        splashName.setText("");
        //remove call back
        handler.removeCallbacks(runnable);
        //run handler
        handler.postDelayed(runnable, delay);
    }



}

