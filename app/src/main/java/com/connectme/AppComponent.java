package com.connectme;

import com.connectme.data.network.UserComponent;
import com.connectme.data.network.UserModule;
import com.connectme.ui.splash.SplashActivityComponent;
import com.connectme.ui.splash.SplashActivityModule;

import dagger.Component;

@AppScope
@Component(modules = {AppModule.class})
public interface AppComponent {

    SplashActivityComponent plus(SplashActivityModule splashActivityModule);

    UserComponent plus(UserModule userModule);
}
