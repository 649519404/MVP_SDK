package zxfd.mvp.sdk.di.module;

import android.text.TextUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import zxfd.mvp.sdk.http.base.interceptor.HttpRequestHandler;


/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/hz_online/main_btn_mnks
 * Update:2018/hz_online/main_btn_mnks
 * Description:
 * *******************************************************
 */
@Module
public class GlobalConfigModule {

    private HttpUrl mApiUrl;
    private List<Interceptor> mInterceptors;
    private File mCacheFile;
    private HttpRequestHandler mHandler;


    private GlobalConfigModule(Buidler buidler) {
        this.mApiUrl = buidler.apiUrl;
        this.mHandler = buidler.handler;
        this.mInterceptors = buidler.interceptors;
        this.mCacheFile = buidler.cacheFile;
    }

    public static Buidler buidler() {
        return new Buidler();
    }

    @Singleton
    @Provides
    List<Interceptor> provideInterceptors() {
        return mInterceptors;
    }

    @Singleton
    @Provides
    HttpUrl provideBaseUrl() {
        return mApiUrl;
    }

    @Singleton
    @Provides
    HttpRequestHandler provideHttpRequestHandler() {
        return mHandler == null ? HttpRequestHandler.EMPTY : mHandler;//打印请求信息
    }

    public static final class Buidler {
        private HttpUrl apiUrl = HttpUrl.parse("https://api.github.com/");
        private List<Interceptor> interceptors = new ArrayList<>();
        private HttpRequestHandler handler;
        private File cacheFile;

        private Buidler() {
        }

        public Buidler baseurl(String baseurl) {
            if (TextUtils.isEmpty(baseurl)) {
                throw new IllegalArgumentException("baseurl can not be empty");
            }
            this.apiUrl = HttpUrl.parse(baseurl);
            return this;
        }

        public Buidler globeHttpHandler(HttpRequestHandler handler) {// handle the http response before displaying it to users
            this.handler = handler;
            return this;
        }

        public Buidler addInterceptor(Interceptor interceptor) {
            this.interceptors.add(interceptor);
            return this;
        }

        public Buidler cacheFile(File cacheFile) {
            this.cacheFile = cacheFile;
            return this;
        }

        public GlobalConfigModule build() {
            return new GlobalConfigModule(this);
        }
    }

}
