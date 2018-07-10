package zxfd.mvp.sdk.di.module;

import java.io.File;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.rx_cache2.internal.RxCache;
import io.victoralbertos.jolyglot.GsonSpeaker;

/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/hz_online/main_btn_mnks
 * Update:2018/hz_online/main_btn_mnks
 * Description:
 * *******************************************************
 */
@Module
public class CacheModule {

    private final File cacheDir;

    public CacheModule(File cacheDir) {
        this.cacheDir = cacheDir;
    }

    @Provides
    @Singleton
    RxCache provideRxCache() {
        return new RxCache.Builder()
                .persistence(cacheDir, new GsonSpeaker());
    }

}
