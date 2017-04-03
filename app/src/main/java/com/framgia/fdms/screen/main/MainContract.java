package com.framgia.fdms.screen.main;

import com.framgia.fdms.BasePresenter;
import com.framgia.fdms.BaseViewModel;
import com.framgia.fdms.data.model.Device;

import java.util.List;

/**
 * This specifies the contract between the view and the presenter.
 */
interface MainContract {
    /**
     * View.
     */
    interface ViewModel extends BaseViewModel<Presenter> {

        void onDeviceLoaded(List<Device> devices);

        void onError();
    }

    /**
     * Presenter.
     */
    interface Presenter extends BasePresenter {
        void loadDevice();
    }
}
