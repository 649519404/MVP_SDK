package zxfd.mvp.sdk.di.module;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import zxfd.mvp.sdk.http.service.UserInfoService;

/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/hz_online/main_btn_mnks
 * Update:2018/hz_online/main_btn_mnks
 * Description:
 * *******************************************************
 */
@Module
public class ServiceModule {

    @Singleton
    @Provides
    UserInfoService provideUserInfoService(Retrofit retrofit) {
        return retrofit.create(UserInfoService.class);
    }
}
