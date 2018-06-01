package com.example.cheng.android.view.SubView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by cheng on 2018/6/1.
 */

public class CanvaView extends View {
    public CanvaView(Context context) {
        super(context);
    }

    public CanvaView(Context context, @Nullable AttributeSet attrs) {
        super(context,attrs);
    }

    public CanvaView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setAntiAlias(false);
        //画笔空心效果
//        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        //画笔实心效果
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        canvas.drawPoint(100,100,paint);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);

    }
}
