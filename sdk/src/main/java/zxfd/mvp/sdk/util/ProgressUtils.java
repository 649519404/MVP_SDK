package zxfd.mvp.sdk.util;

import android.app.Activity;
import android.app.ProgressDialog;

import java.lang.ref.WeakReference;

import io.reactivex.MaybeTransformer;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Action;

public class ProgressUtils {
    static ProgressDialog dialogUtils=null;
    public static <T> MaybeTransformer<T, T> applyProgressBar(
            @NonNull final Activity activity, String msg) {
        final WeakReference<Activity> activityWeakReference = new WeakReference<>(activity);

        return observable -> {
            return observable.doOnSubscribe(disposable -> {
                dialogUtils = new ProgressDialog(activityWeakReference.get());
                dialogUtils.setTitle("数据加载中,请稍后。。。");
                dialogUtils.setCanceledOnTouchOutside(true);
                dialogUtils.show();
                dialogUtils.setOnCancelListener(dialog -> {
                    disposable.dispose();
                    dialogUtils.dismiss();
                    dialogUtils = null;
                });
            }).doOnComplete(new Action() {
                @Override
                public void run() throws Exception {
                    dialogUtils.dismiss();
                    dialogUtils = null;
                }
            }).doOnSuccess(user -> {
                dialogUtils.dismiss();
                dialogUtils = null;
            });
        };
    }

    public static <T> MaybeTransformer<T, T> applyProgressBar(
            @NonNull final Activity activity) {
        return applyProgressBar(activity, "");
    }
}