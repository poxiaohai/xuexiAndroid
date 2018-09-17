package com.example.cheng.android;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;


/**
 * Created by Administrator on 2017/4/13.
 * <p/>
 * 任意移动ImageView,且不会随着页面刷新渲染自动回到初始位置
 */
public class MoveImageVew extends ImageView {

    int startX;
    int startY;
    int left;
    int top;
    int[] temp = new int[]{0, 0};

    public MoveImageVew(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean isMove = false;
        int x = (int) event.getRawX();
        int y = (int) event.getRawY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: // touch down so check if the
                startX = x;
                startY = y;
                temp[0] = (int) event.getX();
                temp[1] = y - getTop();
                Log.e("*************", "x====" + x);
                Log.e("*************", "y====" + y);
                Log.e("*************", "getX====" + event.getX());
                Log.e("*************", "getY====" + event.getY());
                Log.e("*************", "getTop====" + getTop());
                Log.e("*************", "getBottom====" + getBottom());
                Log.e("*************", "getHeight====" + getHeight());
                Log.e("*************", "getScreenH====" + Utils.getScreenH(getContext()));

                break;
            case MotionEvent.ACTION_MOVE: // touch drag with the ball
                left = x - temp[0];
                top = y - temp[1];

                if (left < 0) {//控制左边界不超出
                    left = 0;
                }
                if (top < 150) {//控制顶部边界不超出
                    top = 0;
                }
                layout(left, top, left + getWidth(), top + getHeight());//自由拖拽
                break;
            case MotionEvent.ACTION_UP:

                if (Math.abs(x - startX) > 2 || Math.abs(y - startY) > 2) {//判断是否移动,再一定范围内不算是移动，解决触发事件冲突
                    if (Utils.getScreenH(getContext()) - y> 300) {
                        Log.e("*************", "height====" + (Utils.getScreenH(getContext()) - y));
                        //将最后拖拽的位置定下来，否则页面刷新渲染后按钮会自动回到初始位置
                        //注意父容器
                        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) getLayoutParams();
                        lp.setMargins(left, top + Utils.dip2px(getContext(), 50), 30, 0);
                        setLayoutParams(lp);
                        //确定是拖拽
                        isMove = true;
                    }

                }
                break;
        }
        return isMove ? true : super.onTouchEvent(event);
    }
}
