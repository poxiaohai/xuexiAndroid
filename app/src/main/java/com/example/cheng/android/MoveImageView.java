package com.example.cheng.android;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by aierJun on 2016/12/21.
 */
public class MoveImageView extends ImageView {
    private int _xDelta;
    private int _yDelta;
    public MoveImageView(Context context) {
        super(context);
    }

    public MoveImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MoveImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
// TODO Auto-generated method stub

        final int X = (int) event.getRawX();
        final int Y = (int) event.getRawY();
        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN:
                RelativeLayout.LayoutParams lParams = (RelativeLayout.LayoutParams) getLayoutParams();
                _xDelta = X - lParams.leftMargin;
                _yDelta = Y - lParams.topMargin;
                break;
            case MotionEvent.ACTION_UP:
                break;
            case MotionEvent.ACTION_POINTER_DOWN:
                break;
            case MotionEvent.ACTION_POINTER_UP:
                break;
            case MotionEvent.ACTION_MOVE:
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
                layoutParams.leftMargin = X - _xDelta;
                layoutParams.topMargin = Y - _yDelta;
                //layoutParams.rightMargin = -250;
                //layoutParams.bottomMargin = -250;
                MoveImageView.this.setLayoutParams(layoutParams);      //自己继承VIEW的this
                break;
        }
        invalidate();
        return true;
    }
}
