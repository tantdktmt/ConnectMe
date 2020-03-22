package com.connectme.ui.repository;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.connectme.ConnectMeApplication;
import com.connectme.core.BaseActivity;

import javax.inject.Inject;

public class RepositoryDetailActivity extends BaseActivity {

    @Inject
    RepositoryDetailContract.Presenter mPresenter;

    private RepositoryDetailActivityComponent mActivityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setupActivityComponent() {
        mActivityComponent = ConnectMeApplication.getInstance().getUserComponent().plus(new RepositoryDetailActivityModule(this));
        mActivityComponent.inject(this);
    }

    @Override
    protected void releaseActivityComponent() {
        mActivityComponent = null;
    }
}
