package com.connectme;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    public AppModule() {

    }

    @AppScope
    @Provides
    ConnectMeApplication provideApplicationContext() {
        return ConnectMeApplication.getInstance();
    }
}
