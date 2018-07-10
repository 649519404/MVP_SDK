package zxfd.mvp.sdk.base;


import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;

import com.uber.autodispose.AutoDisposeConverter;


import io.reactivex.disposables.CompositeDisposable;
import lombok.Getter;
import zxfd.mvp.sdk.util.RxLifecycleUtils;

/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/main_btn_yd/main_btn_mnks
 * Update:2018/main_btn_yd/main_btn_mnks
 * Description:
 * *******************************************************
 */
public class BasePresenter<V extends IView, M extends IModel> implements IPresenter {

    private static final String TAG = "core.base.BasePresenter";
    protected   Activity activity;
    protected CompositeDisposable compositeDisposable=new CompositeDisposable();
    @Getter
    protected V mRootView;

    @Getter
    protected M mModel;
    @Getter
    protected Context context;

    private LifecycleOwner lifecycleOwner;

    public BasePresenter(V rootView, M model,Activity activity) {
        this.mRootView = rootView;
        this.mModel = model;
        this.activity=activity;
    }

    protected <T> AutoDisposeConverter<T> bindLifecycle() {
        if (null == lifecycleOwner)
            throw new NullPointerException("lifecycleOwner == null");
        return RxLifecycleUtils.bindLifecycle(lifecycleOwner);
    }

    @Override
    @CallSuper
    @MainThread
    public void onLifecycleChanged(@NonNull LifecycleOwner owner, @NonNull Lifecycle.Event event) {

    }

    @Override
    @CallSuper
    @MainThread
    public void onCreate(@NonNull LifecycleOwner owner) {
        this.lifecycleOwner = owner;
    }

    @Override
    @CallSuper
    @MainThread
    public void onStart(@NonNull LifecycleOwner owner) {
    }

    @Override
    @CallSuper
    @MainThread
    public void onResume(@NonNull LifecycleOwner owner) {

    }

    @Override
    @CallSuper
    @MainThread
    public void onPause(@NonNull LifecycleOwner owner) {

    }

    @Override
    @CallSuper
    @MainThread
    public void onStop(@NonNull LifecycleOwner owner) {

    }

    @Override
    @CallSuper
    @MainThread
    public void onDestroy(@NonNull LifecycleOwner owner) {
        this.lifecycleOwner = null;
        if(compositeDisposable.size()!=0){
            compositeDisposable.clear();
        }
        if (mModel != null) {
            mModel.onDestroy();
            this.mModel = null;
        }
        if(activity!=null){
            activity=null;
        }
        this.mRootView = null;
    }

}
