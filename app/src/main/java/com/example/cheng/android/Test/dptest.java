package com.example.cheng.android.Test;

import com.example.cheng.android.App;
import com.example.cheng.android.diputils.Utils;

/**
 * Created by cheng on 2018/6/1.
 */

public class dptest {
    public void testdp() {
        Utils.px2dp(App.getInstances(), 10);
    }
}
