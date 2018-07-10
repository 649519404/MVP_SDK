package zxfd.mvp.sdk.base;

import android.arch.lifecycle.Lifecycle;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.uber.autodispose.AutoDisposeConverter;

import javax.inject.Inject;

import zxfd.mvp.sdk.util.RxLifecycleUtils;
import zxfd.mvp.sdk.vary.VaryViewHelperController;


/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/hz_online/main_btn_mnks
 * Update:2018/hz_online/main_btn_mnks
 * Description:
 * *******************************************************
 */
public abstract class BaseActivity<P extends IPresenter, B extends ViewDataBinding> extends BaseInjectActivity implements IActivity {

    protected B b;
    @Inject
    protected P presenter;
    private Toolbar toolBar;
    private int states=3;
    protected VaryViewHelperController mVaryViewHelperController;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//

        setContentView(getLayoutId());
        b = DataBindingUtil.setContentView(this, getLayoutId());
        if (null != getLoadingTargetView()) {
            mVaryViewHelperController = new VaryViewHelperController(getLoadingTargetView());
        }
        initLifecycleObserver(getLifecycle());
        initView();
        initToolbar();
        initData();



    }

    protected  void setBack(int id){
        View view= findViewById(id);
        if(null!=view)
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
    };

    protected <T extends View>T getView(int resourcesId){
        return (T) findViewById(resourcesId);
    }
    protected void initToolbar(){
//        toolBar = getView(R.id.toolbar);
//        setSupportActionBar(toolBar);
    }

    protected <T> AutoDisposeConverter<T> bindLifecycle() {
        return RxLifecycleUtils.bindLifecycle(this);
    }

    @MainThread
    protected abstract int getLayoutId();

    @MainThread
    protected View getLoadingTargetView() {
        return null;
    }

    @CallSuper
    @MainThread
    protected void initLifecycleObserver(@NonNull Lifecycle lifecycle) {
        lifecycle.addObserver(presenter);
    }

    @MainThread
    protected abstract void initView();

@MainThread
    protected abstract void initData();

    @MainThread
    @Override
    public void showLoading() {
        if (mVaryViewHelperController == null) {
            throw new IllegalStateException("no ViewHelperController");
        }
        mVaryViewHelperController.showLoading();
    }

    @MainThread
    @Override
    public void hideLoading() {
        if (mVaryViewHelperController == null) {
            throw new IllegalStateException("no ViewHelperController");
        }
        mVaryViewHelperController.restore();
    }
    @MainThread
    @Override
    public void showEmptyView(String msg) {
        if (mVaryViewHelperController == null) {
            throw new IllegalStateException("no ViewHelperController");
        }
        mVaryViewHelperController.showEmpty(msg);
    }
    @MainThread
    @Override
    public void showNetError() {

    }
    @MainThread
    @Override
    public void showToastError() {

    }

    /**
     * 设置 app 不随着系统字体的调整而变化
     */
    @Override
    public Resources getResources() {

        Resources resources = super.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.fontScale=1;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return resources;
    }
}
