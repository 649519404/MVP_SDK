package zxfd.mvp.sdk.http.cache;


import java.util.concurrent.TimeUnit;

import io.reactivex.Maybe;
import io.rx_cache2.DynamicKey;
import io.rx_cache2.EvictDynamicKey;
import io.rx_cache2.LifeCache;
import zxfd.mvp.sdk.http.entity.UserInfo;


/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/hz_online/main_btn_mnks
 * Update:2018/hz_online/main_btn_mnks
 * Description:
 * *******************************************************
 */

public interface UserInfoCacheProviders {

    @LifeCache(duration = 10, timeUnit = TimeUnit.SECONDS)
    Maybe<UserInfo> getUserInfo(
            Maybe<UserInfo> userInfoObservable,
            DynamicKey dynamicKey,
            EvictDynamicKey evictDynamicKey
    );

}
