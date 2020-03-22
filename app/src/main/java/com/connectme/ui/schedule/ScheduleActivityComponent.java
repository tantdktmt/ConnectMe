package com.connectme.ui.schedule;

import com.connectme.ui.ActivityScope;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {ScheduleActivityModule.class})
public interface ScheduleActivityComponent {

    void inject(ScheduleActivity activity);

    void inject(ScheduleFragment fragment);
}
