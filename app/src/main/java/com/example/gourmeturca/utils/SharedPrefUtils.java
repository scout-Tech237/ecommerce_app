package com.example.gourmeturca.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.gourmeturca.modalclasses.Datum;

import java.util.ArrayList;

public class SharedPrefUtils {

    public SharedPrefUtils() {
    }

    public static boolean saveDataOnLogin(boolean is_logged_in, String id, String name, String surname, String email, String Onay, String mail_notify, String sms_notify, String cart_total_count, String mobile_token, String mobile_phone, Context context){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor prefsEditor = prefs.edit();
        prefsEditor.putBoolean(Constants.IS_LOGGED_IN, is_logged_in);
        prefsEditor.putString(Constants.KEY_ID, id);
        prefsEditor.putString(Constants.KEY_NAME, name);
        prefsEditor.putString(Constants.KEY_SURNAME, surname);
        prefsEditor.putString(Constants.KEY_EMAIL, email);
        prefsEditor.putString(Constants.KEY_ONAY, Onay);
        prefsEditor.putString(Constants.KEY_MAIL_NOTIFY, mail_notify);
        prefsEditor.putString(Constants.KEY_SMS_NOTIFY, sms_notify);
        prefsEditor.putString(Constants.KEY_CART_TOTAL_COUNT, cart_total_count);
        prefsEditor.putString(Constants.KEY_MOBILE_TOKEN, mobile_token);
        prefsEditor.putString(Constants.KEY_MOBILE_PHONE, mobile_phone);

        prefsEditor.apply();
        return true;
    }

    public static ArrayList<String> getUserData(Context context){

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        ArrayList<String> userData = new ArrayList();
        userData.add(prefs.getString(Constants.KEY_ID, null));
        userData.add(prefs.getString(Constants.KEY_NAME, null));
        userData.add(prefs.getString(Constants.KEY_SURNAME, null));
        userData.add(prefs.getString(Constants.KEY_EMAIL, null));
        userData.add(prefs.getString(Constants.KEY_ONAY, null));
        userData.add(prefs.getString(Constants.KEY_MAIL_NOTIFY, null));
        userData.add(prefs.getString(Constants.KEY_SMS_NOTIFY, null));
        userData.add(prefs.getString(Constants.KEY_CART_TOTAL_COUNT, null));
        userData.add(prefs.getString(Constants.KEY_MOBILE_TOKEN, null));
        userData.add(prefs.getString(Constants.KEY_MOBILE_PHONE, null));

        return userData;

    }

    public static boolean refreshCartCount (String cart_total_count, Context context){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor prefsEditor = prefs.edit();

        prefsEditor.putString(Constants.KEY_CART_TOTAL_COUNT, cart_total_count);

        return true;
    }

    public static boolean logoutUserFromSession(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor prefsEditor = prefs.edit();
        prefsEditor.clear();
        prefsEditor.apply();

        return true;
    }


}
