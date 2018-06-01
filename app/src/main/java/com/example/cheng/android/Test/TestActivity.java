package com.example.cheng.android.Test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cheng.android.App;
import com.example.cheng.android.R;
import com.example.cheng.android.diputils.Utils;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Utils.px2dp(App.getInstances(), 10);
    }
}
