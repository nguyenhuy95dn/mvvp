package com.framgia.fdms;

import android.app.Application;

import com.framgia.fdms.data.source.remote.api.service.NameServiceClient;
import com.framgia.fdms.data.source.remote.api.service.ServiceClient;

/**
 * Created by Age on 4/3/2017.
 */
public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        NameServiceClient.initialize(this);
    }
}
