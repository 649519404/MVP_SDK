package zxfd.mvp.sdk.di.component;


import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import zxfd.mvp.sdk.base.BaseFragment;

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
public interface BaseFragmentComponent extends AndroidInjector<BaseFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseFragment> {
    }

}
