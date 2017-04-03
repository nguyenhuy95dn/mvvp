package com.framgia.fdms.data.source;

import com.framgia.fdms.data.model.Device;

import java.util.List;

import rx.Observable;

/**
 * Created by Age on 4/3/2017.
 */
public class DeviceDataSource {
    public interface LocalDataSource{}
    public interface RemoteDataSource{
        Observable<List<Device>> getListDevice();
    }
}
