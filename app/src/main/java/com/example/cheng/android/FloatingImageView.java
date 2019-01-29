package com.example.cheng.android;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * 可拖拽ImageView
 * Created by admin on 2017/2/21.
 */
public class FloatingImageView extends ImageView {


    int startX;
    int startY;
    int left;
    int top;
    int[] temp = new int[]{0, 0};
    int heght = 0;
    int width = 0;
    private Context mcontext;

    public FloatingImageView(Context context) {
        super(context, null);
        heght = FloatingImageView.this.getHeight();
        width = FloatingImageView.this.getWidth();
        mcontext = context;
    }

    public FloatingImageView(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
        heght = FloatingImageView.this.getHeight();
        width = FloatingImageView.this.getWidth();
        mcontext = context;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public FloatingImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr, 0);
        heght = FloatingImageView.this.getHeight();
        width = FloatingImageView.this.getWidth();
        mcontext = context;
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public FloatingImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        heght = FloatingImageView.this.getHeight();
        width = FloatingImageView.this.getWidth();
        mcontext = context;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getRawX();
        int y = (int) event.getRawY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: // touch down so check if the
                startX = x;
                startY = y;
                temp[0] = (int) event.getX();
                temp[1] = y - getTop();
                break;
            case MotionEvent.ACTION_MOVE: // touch drag with the ball
                left = x - temp[0];
                top = y - temp[1];
                if (left < 0) {//控制左边界不超出
                    left = 0;
                }

                if(top<0){
                    top=0;
                }
                if((top+Utils.dip2px(mcontext,200))>Utils.getScreenH(mcontext)){
                    top=Utils.getScreenH(mcontext)-Utils.dip2px(mcontext,200);
                }
                if(left>Utils.getScreenw(mcontext)-Utils.dip2px(mcontext,200)){
                    left=Utils.getScreenw(mcontext)-Utils.dip2px(mcontext,200);
                }
                layout(left, top, left + getWidth(), top + getHeight());//自由拖拽
                break;
            case MotionEvent.ACTION_UP:
                if (Math.abs(x - startX) > 2 || Math.abs(y - startY) > 2) {//判断是否移动,再一定范围内不算是移动，解决触发事件冲突
                    //将最后拖拽的位置定下来，否则页面刷新渲染后按钮会自动回到初始位置
                    //注意父容器
//  if ((Utils.getScreenH(mcontext) - FloatingImageView.this.getTop()) > heght && (Utils.getScreenw(mcontext) - FloatingImageView.this.getLeft()) > width) {


                    RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) getLayoutParams();
//                    if(top<0){
//                        top=0;
//                    }
//                    if((top+Utils.dip2px(mcontext,200))>Utils.getScreenH(mcontext)){
//                        top=Utils.getScreenH(mcontext)-Utils.dip2px(mcontext,200);
//                    }
//                    if(left>Utils.getScreenw(mcontext)-Utils.dip2px(mcontext,200)){
//                        left=Utils.getScreenw(mcontext)-Utils.dip2px(mcontext,200);
//                    }
//                    if(left)
                        lp.setMargins(left, top, 0, 0);
                        setLayoutParams(lp);
                        Log.e("========",left+"====top==="+top);
                }
                break;
        }
        return true;
    }
}