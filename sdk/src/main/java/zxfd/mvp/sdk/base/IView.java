package zxfd.mvp.sdk.base;

/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/hz_online/main_btn_mnks
 * Update:2018/hz_online/main_btn_mnks
 * Description:
 * *******************************************************
 */


public interface IView {

    void showLoading();

    void hideLoading();

    void showNetError();

    void showEmptyView(String msg);

    void showToastError();

}
