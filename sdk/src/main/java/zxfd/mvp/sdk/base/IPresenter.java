package zxfd.mvp.sdk.base;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.annotation.NonNull;

/**
 * Any Presenter should implement {@link IPresenter}, ensure that IPresenter is
 * {@link LifecycleObserver}, observer the {@link BaseActivity} or {@link BaseFragment} lifecycle change.
 * <p>
 */
public interface IPresenter extends LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreate(@NonNull LifecycleOwner owner);

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onStart(@NonNull LifecycleOwner owner);

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume(@NonNull LifecycleOwner owner);

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause(@NonNull LifecycleOwner owner);

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStop(@NonNull LifecycleOwner owner);
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy(@NonNull LifecycleOwner owner);

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    void onLifecycleChanged(@NonNull LifecycleOwner owner,
                            @NonNull Lifecycle.Event event);
}
