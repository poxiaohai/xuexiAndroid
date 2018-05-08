package com.example.cheng.android.Scroll.View;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by cheng on 2018/5/8.
 */

public class DragView extends View {
    int lastX = 0;
    int lastY = 0;
    public DragView(Context context) {
        super(context);
    }

    public DragView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DragView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
                layout(getLeft()+officeX,getTop()+officeY,getRight()+officeX,getBottom()+officeY);
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
