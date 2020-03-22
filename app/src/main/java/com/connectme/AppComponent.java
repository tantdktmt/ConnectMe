package com.connectme;

import com.connectme.data.network.UserComponent;
import com.connectme.data.network.UserModule;
import com.connectme.ui.schedule.ScheduleActivityComponent;
import com.connectme.ui.schedule.ScheduleActivityModule;
import com.connectme.ui.splash.SplashActivityComponent;
import com.connectme.ui.splash.SplashActivityModule;

import dagger.Component;

@AppScope
@Component(modules = {AppModule.class})
public interface AppComponent {

    SplashActivityComponent plus(SplashActivityModule module);

    UserComponent plus(UserModule module);

    ScheduleActivityComponent plus(ScheduleActivityModule module);
}
