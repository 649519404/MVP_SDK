package zxfd.mvp.app.mvp.ui.activity;

import zxfd.mvp.app.databinding.ActivityTestBinding;
import zxfd.mvp.app.mvp.contract.TestContract;
import zxfd.mvp.app.mvp.presenter.TestPresenter;
import zxfd.mvp.sdk.base.BaseActivity;


public class TestActivity extends BaseActivity<TestPresenter, ActivityTestBinding> implements TestContract.View {
    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    protected void initToolbar() {
        super.initToolbar();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

}
