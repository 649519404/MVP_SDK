package zxfd.mvp.app.mvp.ui.activity;

import android.view.View;

import com.tencent.mars.xlog.Log;

import zxfd.mvp.app.R;
import zxfd.mvp.app.databinding.ActivityMainBinding;
import zxfd.mvp.app.mvp.contract.MainContract;
import zxfd.mvp.app.mvp.presenter.MainPresenter;
import zxfd.mvp.sdk.base.BaseActivity;


public class MainActivity extends BaseActivity<MainPresenter, ActivityMainBinding> implements MainContract.View {
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initToolbar() {
        super.initToolbar();
    }

    @Override
    protected void initView() {
        Log.d("TAG","sssssssssssssssss===================");
        mVaryViewHelperController.showEmpty("暂时没有数据");
    }

    @Override
    protected View getLoadingTargetView() {
        return b.rv;
    }

    @Override
    protected void initData() {

    }


}
