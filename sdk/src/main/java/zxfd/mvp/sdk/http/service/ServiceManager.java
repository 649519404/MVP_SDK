package zxfd.mvp.sdk.http.service;


import javax.inject.Inject;
import javax.inject.Singleton;

import zxfd.mvp.sdk.http.base.BaseServiceManager;

/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/hz_online/main_btn_mnks
 * Update:2018/hz_online/main_btn_mnks
 * Description:
 * *******************************************************
 */
@Singleton
public class ServiceManager implements BaseServiceManager {


    public UserInfoService getUserInfoService() {
        return userInfoService;
    }

    private UserInfoService userInfoService;


    @Inject
    public ServiceManager(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }



    @Override
    public void destroy() {
        userInfoService = null;
    }

}
