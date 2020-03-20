package com.connectme.ui.splash;

import com.connectme.ui.ActivityScope;

import dagger.Component;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {SplashActivityModule.class})
public interface SplashActivityComponent {
}
