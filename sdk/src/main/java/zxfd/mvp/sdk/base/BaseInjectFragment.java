package zxfd.mvp.sdk.base;

import android.app.Activity;
import android.support.v4.app.Fragment;

import dagger.android.support.AndroidSupportInjection;

/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/hz_online/main_btn_mnks
 * Update:2018/hz_online/main_btn_mnks
 * Description:
 * *******************************************************
 */

public abstract class BaseInjectFragment extends Fragment {

    protected void inject() {
        AndroidSupportInjection.inject(this);
//        if (injectRouter())
//            ARouter.getInstance().inject(this);
    }

    protected boolean injectRouter() {
        return false;
    }

    @Override
    public void onAttach(Activity activity) {
        inject();
        super.onAttach(activity);
    }
}
