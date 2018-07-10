package zxfd.mvp.sdk.di.module;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import zxfd.mvp.sdk.base.BaseApplication;
import zxfd.mvp.sdk.di.module.sheduler.AppSchedulerProvider;
import zxfd.mvp.sdk.di.module.sheduler.SchedulerProvider;

/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/hz_online/main_btn_mnks
 * Update:2018/hz_online/main_btn_mnks
 * Description:
 * *******************************************************
 */
@Module
public class AppModule {

    private BaseApplication application;

    public AppModule(BaseApplication application) {
        this.application = application;
    }

    @Singleton
    @Provides
    public BaseApplication provideApplication() {
        return application;
    }

    @Singleton
    @Provides
    public SchedulerProvider provideSchedulers() {
        return new AppSchedulerProvider();
    }
}
