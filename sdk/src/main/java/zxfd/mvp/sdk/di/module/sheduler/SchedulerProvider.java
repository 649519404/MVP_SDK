package zxfd.mvp.sdk.di.module.sheduler;

import io.reactivex.Scheduler;

/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/main_btn_yd/main_btn_mnks
 * Update:2018/main_btn_yd/main_btn_mnks
 * Description:
 * *******************************************************
 */

public interface SchedulerProvider {

    Scheduler ui();

    Scheduler io();

}
