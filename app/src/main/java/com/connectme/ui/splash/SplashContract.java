package com.connectme.ui.splash;

import com.connectme.core.BasePresenter;
import com.connectme.core.IView;

public interface SplashContract {

    interface View extends IView<Presenter> {

    }

    abstract class Presenter extends BasePresenter<View> {

    }
}
