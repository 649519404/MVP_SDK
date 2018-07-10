package zxfd.mvp.app.di;

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
 * Created by QingMei on 2017/internet_progress/guide_hz.
 * desc:
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
        ActivitiesModule.class,
        FragmentsModule.class
})
public interface ModuleAppComponent {

    Gson gson();

    ServiceManager serviceManager();

    OkHttpClient okHttpClient();

    BaseApplication baseApplication();

    void inject(BaseApplication application);
}
