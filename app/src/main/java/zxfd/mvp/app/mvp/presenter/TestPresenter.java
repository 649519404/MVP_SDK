package zxfd.mvp.app.mvp.presenter;


import javax.inject.Inject;

import zxfd.mvp.app.mvp.contract.TestContract;
import zxfd.mvp.app.mvp.ui.activity.TestActivity;
import zxfd.mvp.sdk.base.BasePresenter;


public class TestPresenter extends BasePresenter<TestContract.View, TestContract.Model> {


    @Inject
    public TestPresenter(TestContract.Model model, TestContract.View rootView, TestActivity activity) {
        super(rootView, model, activity);
    }


}
