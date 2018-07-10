package zxfd.mvp.app;


import zxfd.mvp.app.di.DaggerModuleAppComponent;
import zxfd.mvp.sdk.base.BaseApplication;

/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/hz_online/main_btn_mnks
 * Update:2018/hz_online/main_btn_mnks
 * Description:
 * *******************************************************
 */

public class AppApplication extends BaseApplication {
    @Override
    protected void injectApp() {
        DaggerModuleAppComponent.builder()
                .appModule(getAppModule())
                .cacheModule(getCacheModule())
                .globalConfigModule(getGlobalConfigModule())
                .httpClientModule(getHttpClientModule())

                .serviceModule(getServiceModule()).build().inject(this);
    }


}
