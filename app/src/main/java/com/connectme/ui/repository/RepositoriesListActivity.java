package com.connectme.ui.repository;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.connectme.ConnectMeApplication;
import com.connectme.core.BaseActivity;

public class RepositoriesListActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setUpActivityComponent() {
        ConnectMeApplication.getInstance().getUserComponent().plus(new RepositoriesListActivityModule(this)).inject(this);
    }

    @Override
    public void finish() {
        // Release UserComponent object
        ConnectMeApplication.getInstance().releaseUserComponent();
        super.finish();
    }
}
