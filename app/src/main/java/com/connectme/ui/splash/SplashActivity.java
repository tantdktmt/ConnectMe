package com.connectme.ui.splash;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.connectme.ConnectMeApplication;
import com.connectme.core.BaseActivity;
import com.connectme.data.network.UserModule;
import com.connectme.data.network.model.User;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivityComponent() {
        ConnectMeApplication.getInstance().getAppComponent().plus(new SplashActivityModule(this)).inject(this);
    }

    public void gotoRepositoriesListActivity() {
        // Create UserComponent, but Application object will contain this UserComponent, and Application will release it later
        // When exit from RepositoriesListActivity
        User curUser = dummyUserData();
        ConnectMeApplication.getInstance().createUserComponent(new UserModule(curUser));
    }

    private User dummyUserData() {
        // In real application, after authenticating, user object will be created based on data received from server
        return new User("Tran Duc Tan", 30);
    }
}
