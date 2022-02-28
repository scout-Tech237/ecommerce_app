package com.example.gourmeturca.activities.DashboardFragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.gourmeturca.R;
import com.example.gourmeturca.activities.AccountSetting;
import com.example.gourmeturca.activities.HelpDesk;
import com.example.gourmeturca.activities.Login;
import com.example.gourmeturca.activities.PreviousOrders;
import com.example.gourmeturca.activities.PromoCodes;
import com.example.gourmeturca.activities.ReferFriend;
import com.example.gourmeturca.activities.SignUp;
import com.example.gourmeturca.utils.SharedPrefUtils;

public class Profile extends Fragment {
    CardView setting;

    ConstraintLayout notSignIn;
    LinearLayout signedIn, myOrdersLayout, accSetting, promoCodes, helpDesk, referFriend;
    Button login, register, logoutUser ;
    TextView userName, userNumber;
    CardView numberCardView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        setting = view.findViewById(R.id.setting);
        notSignIn = view.findViewById(R.id.lead_to_sign_in);
        signedIn = view.findViewById(R.id.profile_info);
        login = view.findViewById(R.id.login_btn);
        register = view.findViewById(R.id.getStartedBtn);
        userName = view.findViewById(R.id.user_name);
        userNumber = view.findViewById(R.id.user_mobile_number);
        numberCardView = view.findViewById(R.id.number_view);
        logoutUser = view.findViewById(R.id.logout_user);
        myOrdersLayout = view.findViewById(R.id.my_orders_layout);
        accSetting = view.findViewById(R.id.account_setting);
        promoCodes = view.findViewById(R.id.promo_codes);
        helpDesk = view.findViewById(R.id.help_desk);
        referFriend = view.findViewById(R.id.refer_friend);


        /**
         * check if user is signed in
         */
        String id = SharedPrefUtils.getUserData(getActivity()).get(0);
        if (id != null ){
            notSignIn.setVisibility(View.GONE);
            signedIn.setVisibility(View.VISIBLE);
            userName.setText(SharedPrefUtils.getUserData(getActivity()).get(1) + " " + SharedPrefUtils.getUserData(getActivity()).get(2));
            if ((SharedPrefUtils.getUserData(getActivity()).get(9) == null) || (SharedPrefUtils.getUserData(getActivity()).get(9).equals(""))){
                numberCardView.setVisibility(View.GONE);
            }
            //userName.setText(SharedPrefUtils.getUserData(getActivity()).get(1));
        }else {
            notSignIn.setVisibility(View.VISIBLE);
            signedIn.setVisibility(View.GONE);
        }

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Login.class);
                startActivity(intent);

            }
        });

        logoutUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPrefUtils.logoutUserFromSession(getActivity());
                getActivity().recreate();

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SignUp.class);
                startActivity(intent);
            }
        });

        /**
         * expandables
         */
        myOrdersLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), PreviousOrders.class));
            }
        });

        accSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), AccountSetting.class));
            }
        });

        promoCodes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), PromoCodes.class));
            }
        });

        helpDesk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), HelpDesk.class));
            }
        });

        referFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ReferFriend.class));
            }
        });




        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), SignUp.class));
            }
        });
    }
}