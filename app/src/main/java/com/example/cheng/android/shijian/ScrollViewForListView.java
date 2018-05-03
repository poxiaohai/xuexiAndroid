package com.example.cheng.android.shijian;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ScrollView;

/**
 * Created by cheng on 2018/5/3.
 */

public class ScrollViewForListView extends ScrollView {
    public ScrollViewForListView(Context context) {
        super(context);
    }

    public ScrollViewForListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ScrollViewForListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        boolean flag=super.onTouchEvent(ev);
        Log.e("==========","onTouchEvent"+String.valueOf(flag));
        return super.onTouchEvent(ev);
    }

    @Override
    public boolean onInterceptHoverEvent(MotionEvent event) {
        boolean flag=super.onInterceptHoverEvent(event);
        Log.e("==========","onInterceptHoverEvent"+String.valueOf(flag));
        return super.onInterceptHoverEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        boolean flag=super.dispatchTouchEvent(event);
        Log.e("==========","dispatchTouchEvent"+String.valueOf(flag));

        return super.dispatchTouchEvent(event);
    }
}
