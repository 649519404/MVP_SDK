package zxfd.mvp.app.mvp.presenter;


import javax.inject.Inject;

import zxfd.mvp.app.mvp.contract.MainContract;
import zxfd.mvp.app.mvp.ui.activity.MainActivity;
import zxfd.mvp.sdk.base.BasePresenter;


public class MainPresenter extends BasePresenter<MainContract.View, MainContract.Model> {


    @Inject
    public MainPresenter(MainContract.Model model, MainContract.View rootView, MainActivity activity) {
        super(rootView, model, activity);
    }



}
