package com.connectme;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

import com.androidnetworking.AndroidNetworking;

/**
 * Created by tantd on 2/7/2020.
 */
public class ConnectMeApplication extends Application {
    public static final String TAG = ConnectMeApplication.class.getSimpleName();
    private static ConnectMeApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        AndroidNetworking.initialize(getApplicationContext());
    }

    public static synchronized ConnectMeApplication getInstance() {
        return mInstance;
    }

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }
}
