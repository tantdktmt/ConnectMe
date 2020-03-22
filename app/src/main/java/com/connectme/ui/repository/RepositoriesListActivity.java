package com.connectme.ui.repository;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.connectme.ConnectMeApplication;
import com.connectme.core.BaseActivity;

import javax.inject.Inject;

public class RepositoriesListActivity extends BaseActivity {

    @Inject
    RepositoriesListContract.Presenter mPresenter;

    private RepositoriesListActivityComponent mActivityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setupActivityComponent() {
        mActivityComponent = ConnectMeApplication.getInstance().getUserComponent().plus(new RepositoriesListActivityModule(this));
        mActivityComponent.inject(this);
    }

    @Override
    protected void releaseActivityComponent() {
        mActivityComponent = null;
        // Release UserComponent object
        ConnectMeApplication.getInstance().releaseUserComponent();
    }
}
