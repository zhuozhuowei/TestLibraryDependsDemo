package com.example.toastlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * 吐司工具类
 *
 * @author wxf
 * @date 18/7/30
 */
public class ToastUtils {

    /**
     * 显示吐司
     *
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
