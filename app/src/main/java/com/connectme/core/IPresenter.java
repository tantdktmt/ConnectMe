package com.connectme.core;

/**
 * Created by tantd on 2/7/2020.
 */
public interface IPresenter<V extends IView> {

    void onAttach(V view);

    void onDetach();
}
