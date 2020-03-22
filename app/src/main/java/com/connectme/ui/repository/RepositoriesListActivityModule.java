package com.connectme.ui.repository;

import com.connectme.ui.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoriesListActivityModule {

    private RepositoriesListActivity mActivity;

    public RepositoriesListActivityModule(RepositoriesListActivity activity) {
        mActivity = activity;
    }

    @ActivityScope
    @Provides
    public RepositoriesListActivity provideActivity() {
        return mActivity;
    }

    @ActivityScope
    @Provides
    public RepositoriesListContract.Presenter providePresenter() {
        return new RepositoriesListPresenter(mActivity);
    }
}
