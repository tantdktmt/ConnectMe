package com.connectme.ui.repository;

import com.connectme.ui.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryDetailActivityModule {

    private RepositoryDetailActivity mActivity;

    public RepositoryDetailActivityModule(RepositoryDetailActivity activity) {
        mActivity = activity;
    }

    @ActivityScope
    @Provides
    public RepositoryDetailActivity provideRepositoryDetailActivity() {
        return mActivity;
    }

    @ActivityScope
    @Provides
    public RepositoryDetailContract.Presenter provideRepositoryDetailPresenter() {
        return new RepositoryDetailPresenter(mActivity);
    }
}
