package zxfd.mvp.sdk.di.component;

import android.content.BroadcastReceiver;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/hz_online/main_btn_mnks
 * Update:2018/hz_online/main_btn_mnks
 * Description:
 * *******************************************************
 */
@Subcomponent(modules = {
        AndroidInjectionModule.class,
})
public interface BroadcastsComponent extends AndroidInjector<BroadcastReceiver> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BroadcastReceiver> {
    }
}
