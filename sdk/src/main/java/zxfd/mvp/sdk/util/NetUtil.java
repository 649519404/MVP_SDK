package zxfd.mvp.sdk.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/hz_online/main_btn_mnks
 * Update:2018/hz_online/main_btn_mnks
 * Description:
 * *******************************************************
 */

public class NetUtil {

    public static final int NET_CNNT_BAIDU_OK = 1; // NetworkAvailable
    public static final int NET_CNNT_BAIDU_TIMEOUT = 2; // no NetworkAvailable
    public static final int NET_NOT_PREPARE = 3; // Net no ready
    public static final int NET_ERROR = 4; //net error
    private static final int TIMEOUT = 3000; // TIMEOUT

    private NetUtil() {
    }

    /**
     * check NetworkAvailable
     *
     * @param context
     * @return
     */
    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager manager = (ConnectivityManager) context.getApplicationContext().getSystemService(
                Context.CONNECTIVITY_SERVICE);
        if (null == manager)
            return false;
        NetworkInfo info = manager.getActiveNetworkInfo();
        if (null == info || !info.isAvailable())
            return false;
        return true;
    }

}
