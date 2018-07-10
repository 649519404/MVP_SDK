package zxfd.mvp.sdk.base;

import android.support.annotation.VisibleForTesting;

import javax.inject.Inject;

import zxfd.mvp.sdk.di.module.sheduler.SchedulerProvider;
import zxfd.mvp.sdk.http.base.BaseServiceManager;
import zxfd.mvp.sdk.http.cache.CacheProviders;


/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/hz_online/main_btn_mnks
 * Update:2018/hz_online/main_btn_mnks
 * Description:
 * *******************************************************
 */

public abstract class BaseModel<S extends BaseServiceManager> implements IModel {

    /**
     * Retrofit Service Manager
     */
    @VisibleForTesting
    public S serviceManager;

    @Inject
    protected CacheProviders cacheProviders;

    @Inject
    @VisibleForTesting
    public SchedulerProvider schedulers;

    public BaseModel(S serviceManager) {
        this.serviceManager = serviceManager;
    }


    @Override
    public void onDestroy() {
        serviceManager = null;
    }

}
