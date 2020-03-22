package com.connectme.ui.schedule;

import com.connectme.ui.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ScheduleActivityModule {

    private ScheduleActivity mActivity;

    public ScheduleActivityModule(ScheduleActivity activity) {
        mActivity = activity;
    }

    @ActivityScope
    @Provides
    public ScheduleActivity provideActivity() {
        return mActivity;
    }

    @ActivityScope
    @Provides
    public ScheduleContract.Presenter providePresenter() {
        return new SchedulePresenter(mActivity);
    }
}
