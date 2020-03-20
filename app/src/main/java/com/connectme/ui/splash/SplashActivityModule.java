package com.connectme.ui.splash;

import com.connectme.ui.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class SplashActivityModule {

    private SplashActivity mActivity;

    public SplashActivityModule(SplashActivity activity) {
        mActivity = activity;
    }

    @ActivityScope
    @Provides
    public SplashActivity provideSplashActivity() {
        return mActivity;
    }
}
