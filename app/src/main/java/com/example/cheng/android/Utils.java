package com.example.cheng.android;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
/**
 * Created by Administrator on 2015/11/28.
 */
public class Utils {

    /**
     * @param context
     * @return int
     * @throws
     * @author chenzheng
     * @Description: 获取屏幕高度
     * @since 2014-5-9
     */
    public static int getScreenH(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;         // 屏幕宽度（像素）
        int height = dm.heightPixels;       // 屏幕高度（像素）
        return height;
    }
    public static int getScreenw(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;         // 屏幕宽度（像素）
        int height = dm.heightPixels;       // 屏幕高度（像素）
        return width;
    }

    /**
     * 根据手机分辨率从 dp 单位 转成 px(像素)
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }







}