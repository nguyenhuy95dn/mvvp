package com.framgia.fdms.data.source.remote;

import com.framgia.fdms.data.model.Device;
import com.framgia.fdms.data.source.DeviceDataSource;
import com.framgia.fdms.data.source.remote.api.service.NameApi;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;

public class DeviceRemoteDataSource implements DeviceDataSource.RemoteDataSource {
    private NameApi mNameApi;

    public DeviceRemoteDataSource(NameApi nameApi) {
        mNameApi = nameApi;
    }

    @Override
    public Observable<List<Device>> getListDevice() {
        List<Device> devices = new ArrayList<>();
        devices.add(new Device("Toshiba", "1/2/2017", "Ipad", ""));
        devices.add(new Device("Toshiba1", "1/3/2017", "Ipad", ""));
        devices.add(new Device("Toshiba2", "1/4/2017", "Ipad", ""));
        devices.add(new Device("Toshiba3", "1/5/2017", "Ipad", ""));
        devices.add(new Device("Toshiba4", "1/6/2017", "Ipad", ""));
        devices.add(new Device("Toshiba5", "1/7/2017", "Ipad", ""));
        devices.add(new Device("Toshiba6", "2/2/2017", "Ipad", ""));
        devices.add(new Device("Toshiba7", "3/2/2017", "Ipad", ""));
        devices.add(new Device("Toshiba8", "4/2/2017", "Ipad", ""));
        devices.add(new Device("Toshiba9", "5/2/2017", "Ipad", ""));
        devices.add(new Device("Toshiba10", "6/2/2017", "Ipad", ""));
        devices.add(new Device("Toshiba11", "7/2/2017", "Ipad", ""));
        devices.add(new Device("Toshiba12", "8/2/2017", "Ipad", ""));
        devices.add(new Device("Toshiba13", "9/2/2017", "Ipad", ""));
        devices.add(new Device("Toshiba14", "10/2/2017", "Ipad", ""));
        devices.add(new Device("Toshiba15", "11/2/2017", "Ipad", ""));
        devices.add(new Device("Toshiba16", "12/2/2017", "Ipad", ""));
        devices.add(new Device("Toshiba17", "1/8/2017", "Ipad", ""));
        devices.add(new Device("Toshiba18", "1/9/2017", "Ipad", ""));
        devices.add(new Device("Toshiba19", "1/10/2017", "Ipad", ""));
        devices.add(new Device("Toshiba20", "1/11/2017", "Ipad", ""));
        devices.add(new Device("Toshiba21", "1/12/2017", "Ipad", ""));
        return Observable.just(devices);
    }
}
