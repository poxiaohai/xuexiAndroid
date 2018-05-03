package com.example.cheng.android.view.SubView;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by cheng on 2018/5/3.
 */

public class SubViewGroup extends ViewGroup {
    public SubViewGroup(Context context) {
        super(context);
    }

    public SubViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SubViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //ViewGroup主要是一个容器，当ViewGroup的宽高是确切的值的时候，控件的宽高就是它本身设置的值
        //主要是考虑ViewGroup Wrap_content的时，需要计算控件的宽高，控件的宽高根据子View的布局来计算
        int width;
        int height;
        int mWidthMeasureMode = MeasureSpec.getMode(widthMeasureSpec);
        measureChildren(widthMeasureSpec, heightMeasureSpec);//初始化所有子View的宽高

        if (mWidthMeasureMode == MeasureSpec.AT_MOST) {//Wrap_content的情况
            //测量子View的宽  怎么测量子View的宽
            //由于这里只有一个控件，暂时从这个一个控件开始学习
            View childView = getChildAt(0);//获取到这个控件
            width = childView.getMeasuredWidth();
        } else {
            width = MeasureSpec.getSize(widthMeasureSpec);
        }

        int mHeightMeasureMode = MeasureSpec.getMode(heightMeasureSpec);
        if (mHeightMeasureMode == MeasureSpec.AT_MOST) {
            View childView = getChildAt(0);
            height = childView.getMeasuredHeight();

        } else {
            height = MeasureSpec.getSize(heightMeasureSpec);
        }
        setMeasuredDimension(width, height);
    }

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

    }
}
