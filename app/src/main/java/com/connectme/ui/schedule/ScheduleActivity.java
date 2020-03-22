package com.connectme.ui.schedule;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import com.connectme.ConnectMeApplication;
import com.connectme.R;
import com.connectme.core.BaseActivity;
import com.connectme.util.FragmentController;

import javax.inject.Inject;

/**
 * Created by tantd on 2/7/2020.
 */
public class ScheduleActivity extends BaseActivity {

    private ScheduleActivityComponent mActivityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        ScheduleFragment scheduleFragment = (ScheduleFragment) getSupportFragmentManager().findFragmentById(R.id.layout_content);
        if (scheduleFragment == null) {
            scheduleFragment = ScheduleFragment.newInstance();
            FragmentController.addFragmentToActivity(getSupportFragmentManager(), scheduleFragment, R.id.layout_content);
        }
    }

    @Override
    protected void setupActivityComponent() {
        mActivityComponent = ConnectMeApplication.getInstance().getAppComponent().plus(new ScheduleActivityModule(this));
        mActivityComponent.inject(this);
    }

    @Override
    protected void releaseActivityComponent() {
        mActivityComponent = null;
    }

    ScheduleActivityComponent getActivityComponent() {
        return mActivityComponent;
    }
}
