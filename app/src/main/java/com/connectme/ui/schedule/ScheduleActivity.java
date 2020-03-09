package com.connectme.ui.schedule;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.connectme.R;
import com.connectme.core.BaseActivity;
import com.connectme.util.FragmentController;

/**
 * Created by tantd on 2/7/2020.
 */
public class ScheduleActivity extends BaseActivity {

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
}
