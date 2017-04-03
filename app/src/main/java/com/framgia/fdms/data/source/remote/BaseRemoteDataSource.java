package com.framgia.fdms.data.source.remote;

import com.framgia.fdms.data.source.remote.api.service.NameApi;

/**
 * Created by le.quang.dao on 10/03/2017.
 */

public abstract class BaseRemoteDataSource {

    NameApi mNameApi;

    public BaseRemoteDataSource(NameApi nameApi) {
        mNameApi = nameApi;
    }
}
