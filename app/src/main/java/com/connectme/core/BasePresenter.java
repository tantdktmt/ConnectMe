package com.connectme.core;

import com.connectme.data.network.ApiHelper;
import com.connectme.data.network.AppApiHelper;
import com.connectme.util.rx.AppSchedulerProvider;
import com.connectme.util.rx.SchedulerProvider;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by tantd on 2/7/2020.
 */
public abstract class BasePresenter<V extends IView> implements IPresenter<V> {

    private static final String TAG = BasePresenter.class.getName();

    protected V view;
    protected final SchedulerProvider schedulerProvider;
    protected final CompositeDisposable compositeDisposable;
    protected final ApiHelper apiHelper;

    public BasePresenter() {
        schedulerProvider = AppSchedulerProvider.getInstance();
        compositeDisposable = new CompositeDisposable();
        apiHelper = AppApiHelper.getInstance();
    }

    @Override
    public void onAttach(V view) {
        this.view = view;
    }

    @Override
    public void onDetach() {
        view = null;
        compositeDisposable.dispose();
    }

    @Override
    public void handleApiError(Throwable error) {
        view.onError(error);
    }
}
