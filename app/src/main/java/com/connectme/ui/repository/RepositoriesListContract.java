package com.connectme.ui.repository;

import com.connectme.core.BasePresenter;
import com.connectme.core.IView;

public interface RepositoriesListContract {

    interface View extends IView<Presenter> {

    }

    abstract class Presenter extends BasePresenter<View> {

    }
}
