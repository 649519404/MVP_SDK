package zxfd.mvp.sdk.http.service;


import io.reactivex.Maybe;
import retrofit2.http.Body;
import retrofit2.http.POST;
import zxfd.mvp.sdk.http.entity.HttpResult;
import zxfd.mvp.sdk.http.entity.PushEntry;

/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/hz_online/main_btn_mnks
 * Update:2018/hz_online/main_btn_mnks
 * Description:
 * *******************************************************
 */
public interface UserInfoService {
    //http://127.0.0.1:8090/api/push?type=2&title=%22%E6%B5%8B%E8%AF%95%E4%BF%A1%E6%81%AF%22&content=%22%E6%B5%8B%E8%AF%95%E5%86%85%E5%AE%B9%22&osName=android
    @POST("push")
    Maybe<HttpResult> push(@Body PushEntry pushEntry);

}
