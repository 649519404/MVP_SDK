package zxfd.mvp.sdk.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Toast;

import java.lang.reflect.Field;

import zxfd.mvp.sdk.base.BaseApplication;


/**
 * *******************************************************
 * Autour: 曲志强
 * CreateDate: 2018/hz_online/main_btn_mnks
 * Update:2018/hz_online/main_btn_mnks
 * Description:
 * *******************************************************
 */

public class ScreenUtil {

    private ScreenUtil() {
    }

    public static LayoutInflater layoutInflater(Context context) {
        return (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public static void toast(Context context, String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    /**
     * get the statusbar height
     *
     * @param context
     * @return
     */
    public static int getStatusbarHeight(Context context) {
        int statusBarHeight = 0;
        try {
            Class<?> c = Class.forName("com.android.internal.R$dimen");
            Object o = c.newInstance();
            Field field = c.getField("status_bar_height");
            int x = (Integer) field.get(o);
            statusBarHeight = context.getResources().getDimensionPixelSize(x);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return statusBarHeight;
    }

    public static int dp2px(final float dpValue) {
        final float scale = BaseApplication.getInstance().getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    public static int getScreenHeight() {
        return BaseApplication.getInstance().getResources().getDisplayMetrics().heightPixels;
    }

    public static int getScreenHeightExcludeStatusbar(Context context) {
        return getScreenHeight() - getStatusbarHeight(context);
    }

}
