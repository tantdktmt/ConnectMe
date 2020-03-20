package com.connectme;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private ConnectMeApplication mApplication;

    public AppModule(ConnectMeApplication application) {
        mApplication = application;
    }

    @AppScope
    @Provides
    ConnectMeApplication provideApplicationContext() {
        return mApplication;
    }
}
