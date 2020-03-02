package com.connectme;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

import androidx.multidex.MultiDex;

import com.connectme.util.CommonUtils;
import com.connectme.util.NGPrefUtils;

/**
 * Created by tantd on 2/7/2020.
 */
public class ConnectMeApplication extends Application {
    public static final String TAG = ConnectMeApplication.class.getSimpleName();
    private static ConnectMeApplication mInstance;

    public static void setLanguage(Context context) {
        String lang = NGPrefUtils.getLanguage();
        if (lang != null && !lang.isEmpty()) {
            CommonUtils.setLanguage(context, lang);
        } else CommonUtils.setLanguage(context, "vi");

    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        setLanguage(getApplicationContext());
    }

    public static synchronized ConnectMeApplication getInstance() {
        return mInstance;
    }

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setLanguage(getApplicationContext());
    }
}
