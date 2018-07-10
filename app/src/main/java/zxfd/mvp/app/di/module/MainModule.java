package zxfd.mvp.app.di.module;


import dagger.Module;
import dagger.Provides;
import zxfd.mvp.app.mvp.contract.MainContract;
import zxfd.mvp.app.mvp.model.MainModel;
import zxfd.mvp.app.mvp.ui.activity.MainActivity;
import zxfd.mvp.sdk.di.scope.ActivityScope;


@Module
public class MainModule {


    @ActivityScope
    @Provides
    MainContract.View provideMainView(MainActivity activity) {
        return activity;
    }

    @ActivityScope

    @Provides
    MainContract.Model provideMainModel(MainModel model) {
        return model;
    }
}