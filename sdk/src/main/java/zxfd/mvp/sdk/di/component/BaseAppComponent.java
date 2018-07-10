package zxfd.mvp.sdk.di.component;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;
import okhttp3.OkHttpClient;
import zxfd.mvp.sdk.base.BaseApplication;
import zxfd.mvp.sdk.di.module.AppModule;
import zxfd.mvp.sdk.di.module.CacheModule;
import zxfd.mvp.sdk.di.module.GlobalConfigModule;
import zxfd.mvp.sdk.di.module.HttpClientModule;
import zxfd.mvp.sdk.di.module.ServiceModule;
import zxfd.mvp.sdk.http.service.ServiceManager;

/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/hz_online/main_btn_mnks
 * Update:2018/hz_online/main_btn_mnks
 * Description:
 * *******************************************************
 */
@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        AppModule.class,
        HttpClientModule.class,
        GlobalConfigModule.class,
        ServiceModule.class,
        CacheModule.class,
})
public interface BaseAppComponent {

    Gson gson();

    ServiceManager serviceManager();

    OkHttpClient okHttpClient();

    BaseApplication baseApplication();

    void inject(BaseApplication application);
}
