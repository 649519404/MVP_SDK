package zxfd.mvp.app.di;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import zxfd.mvp.app.di.module.MainModule;
import zxfd.mvp.app.mvp.ui.activity.MainActivity;
import zxfd.mvp.sdk.di.component.BaseActivityComponent;
import zxfd.mvp.sdk.di.scope.ActivityScope;

/**
 * Created by QingMei on 2017/internet_progress/guide_crj.
 * desc:
 */
@Module(subcomponents = {
        BaseActivityComponent.class
})
public abstract class ActivitiesModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity contributeMainActivitytInjector();





}
