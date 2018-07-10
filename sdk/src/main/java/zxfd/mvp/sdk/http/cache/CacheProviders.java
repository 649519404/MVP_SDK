package zxfd.mvp.sdk.http.cache;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.rx_cache2.internal.RxCache;
import lombok.Getter;
/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/hz_online/main_btn_mnks
 * Update:2018/hz_online/main_btn_mnks
 * Description:
 * *******************************************************
 */
@Singleton
public class CacheProviders {

    @Getter
    private UserInfoCacheProviders userInfoCacheProviders;

    @Inject
    public CacheProviders(RxCache rxCache) {
        this.userInfoCacheProviders = rxCache.using(UserInfoCacheProviders.class);
    }

}
