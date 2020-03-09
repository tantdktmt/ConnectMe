package com.connectme.ui.schedule;

import com.connectme.core.BasePresenter;
import com.connectme.core.IView;
import com.connectme.data.network.model.Event;

import java.util.List;

/**
 * Created by HP on 8/21/2017.
 */
public interface ScheduleContract {
    interface View extends IView<Presenter> {
        void showSchedule(List<Event> lstEvent);
    }

    abstract class Presenter extends BasePresenter<View> {
        public abstract void loadSchedule();
    }
}
