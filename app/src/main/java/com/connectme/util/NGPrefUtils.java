package com.connectme.util;


import android.content.Context;
import android.content.SharedPreferences;

import com.connectme.ConnectMeApplication;

public class NGPrefUtils {
    private static final String PREF_NAME = "dmspro.ngaim.orderentry.pref.NG";
    private static final String PREF_LANGUAGE = "dmspro.ngaim.orderentry.pref.LANGUAGE";

    /**
     * Load value of SharedPreferences
     *
     * @param name : key
     * @return : value
     */
    public static String load(String name) {
        SharedPreferences share = ConnectMeApplication.getInstance().getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        String result = share.getString(name, Constants.EMPTY_TEXT);
        return result;
    }

    /**
     * Save value to SharedPreferences
     *
     * @param name  : key
     * @param value : value
     */
    public static void save(String name, String value) {
        SharedPreferences share = ConnectMeApplication.getInstance().getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = share.edit();
        editor.putString(name, value);
        editor.commit();
    }

    public static void saveLanguage(String language) {
        save(PREF_LANGUAGE, language);
    }

    public static String getLanguage() {
        return load(PREF_LANGUAGE);
    }
}
