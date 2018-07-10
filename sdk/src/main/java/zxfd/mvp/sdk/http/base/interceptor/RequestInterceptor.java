package zxfd.mvp.sdk.http.base.interceptor;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Singleton;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/hz_online/main_btn_mnks
 * Update:2018/hz_online/main_btn_mnks
 * Description:
 * *******************************************************
 */
@Singleton
public class RequestInterceptor implements Interceptor {

    private HttpRequestHandler mHttpRequestHandler;

    @Inject
    public RequestInterceptor(HttpRequestHandler httpRequestHandler) {
        this.mHttpRequestHandler = httpRequestHandler;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        if (mHttpRequestHandler != null) {
            // do something before http request like adding specific headers.
            mHttpRequestHandler.onHttpRequestBefore(chain, request);
        }

        Response originalResponse = chain.proceed(request);
        ResponseBody responseBody = originalResponse.body();

        if (mHttpRequestHandler != null) {
            mHttpRequestHandler.onHttpResultResponse(responseBody.toString(), chain, originalResponse);
        }

        return originalResponse;
    }
}
