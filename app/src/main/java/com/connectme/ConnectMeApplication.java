package com.connectme;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

import com.androidnetworking.AndroidNetworking;
import com.connectme.data.network.UserComponent;
import com.connectme.data.network.UserModule;

/**
 * Created by tantd on 2/7/2020.
 */
public class ConnectMeApplication extends Application {

    public static final String TAG = ConnectMeApplication.class.getSimpleName();
    private static ConnectMeApplication mInstance;

    private AppComponent mAppComponent;
    private UserComponent mUserComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        AndroidNetworking.initialize(getApplicationContext());
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public static synchronized ConnectMeApplication getInstance() {
        return mInstance;
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    public void createUserComponent(UserModule userModule) {
        mUserComponent = mAppComponent.plus(userModule);
    }

    public void releaseUserComponent() {
        mUserComponent = null;
    }

    public UserComponent getUserComponent() {
        return mUserComponent;
    }

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }
}
