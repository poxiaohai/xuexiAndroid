package com.example.cheng.android.Scroll.View;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by cheng on 2018/5/8.
 */

public class DragView4 extends View {
    int lastX = 0;
    int lastY = 0;
    public DragView4(Context context) {
        super(context);
    }

    public DragView4(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DragView4(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int rawX = (int) event.getRawX();//触摸点到x轴距离
        int rawY = (int) event.getRawY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                //记录触摸点的坐标
                lastX = rawX;
                lastY = rawY;
                break;
            case MotionEvent.ACTION_MOVE:
                //计算偏移量
                int officeX = rawX - lastX;
                int officeY = rawY - lastY;
                //在当前的left,top,right,bottom基础上加上偏移量
                Log.e("=========","officeX=======>"+officeX+"=====officeY==>"+officeY);
                ((View)getParent()).scrollBy((0-officeX),(0-officeY));
                //重新设置初始值
                lastX = rawX;
                lastY = rawY;
                break;
            case MotionEvent.ACTION_UP:
                //处理输入的离开动作
                break;
        }
        return true;
    }
}
