package com.example.cheng.android.diputils;

import android.content.Context;

import com.socks.library.KLog;

/**
 * Created by cheng on 2018/6/1.
 */

public class Utils {
    /**
     * 160/240=2/3 得出像素密度为240屏幕上1dp=3/2
     * px所以100dp的长度在像素密度为160的屏幕用100个像素点表示，
     * 而在像素密度为240的屏幕上用150像素点表示因此高密度屏幕上并不会缩短而显示长度一样
     * 按此关系可以得到一个比例  ldpi  :  mdpi  :  hdpi  :  xhdpi : xxhdpi=3:4:6:8:12
     */

    /**
     *     * convert px to its equivalent dp
     * <p>
     *     *
     * <p>
     *     *将px转换为与之相等的dp
     * <p>
     *    
     */

    public static int px2dp(Context context, float pxValue) {

        final float scale = context.getResources().getDisplayMetrics().density;
        KLog.e("======",scale);
        return (int) (pxValue / scale + 0.5f);

    }


}
