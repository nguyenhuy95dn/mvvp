package com.framgia.fdms.data.source;

import android.databinding.tool.util.L;
import android.support.annotation.NonNull;

import com.framgia.fdms.data.model.Device;
import com.framgia.fdms.data.source.remote.DeviceRemoteDataSource;

import java.util.List;

import rx.Observable;

public class DeviceRepository {
    private DeviceRemoteDataSource mDeviceRemoteDataSource;
    public DeviceRepository(DeviceRemoteDataSource remoteDataSource) {
        mDeviceRemoteDataSource = remoteDataSource;
    }

    public Observable<List<Device>> getListDevice(){
        return mDeviceRemoteDataSource.getListDevice();
        //
    }
}
