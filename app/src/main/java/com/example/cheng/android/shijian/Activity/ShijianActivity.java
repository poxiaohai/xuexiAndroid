package com.example.cheng.android.shijian.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import com.example.cheng.android.R;

public class ShijianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shijian);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("===========","ShijianActivity=====>>>onTouchEvent");
        return super.onTouchEvent(event);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("===========","ShijianActivity=====>>>dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }
}
