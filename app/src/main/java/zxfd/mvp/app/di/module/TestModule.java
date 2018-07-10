package zxfd.mvp.app.di.module;


import dagger.Module;
import dagger.Provides;

import zxfd.mvp.app.mvp.contract.TestContract;
import zxfd.mvp.app.mvp.model.TestModel;
import zxfd.mvp.app.mvp.ui.activity.TestActivity;

import zxfd.mvp.sdk.di.scope.ActivityScope;


@Module
public class TestModule {


    @ActivityScope
    @Provides
    TestContract.View provideTestView(TestActivity activity) {
        return activity;
    }

    @ActivityScope

    @Provides
    TestContract.Model provideTestModel(TestModel model) {
        return model;
    }
}