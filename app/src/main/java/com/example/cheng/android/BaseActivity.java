package com.example.cheng.android;

import android.app.Activity;

import com.umeng.analytics.MobclickAgent;

/**
 * Created by cheng on 2018/6/13.
 */

public class BaseActivity extends Activity {
    @Override
    public void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }


}
