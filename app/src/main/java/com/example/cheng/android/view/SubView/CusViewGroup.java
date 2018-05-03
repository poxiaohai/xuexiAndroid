package com.example.cheng.android.view.SubView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * 自定义ViewGroup 按效果显示两个TextView
 */
public class CusViewGroup extends ViewGroup {
    public static final String TAG = "CusViewGroup";
    private int childCount;

    public CusViewGroup(Context context) {
        this(context, null);
    }

    public CusViewGroup(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CusViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 必须实现的方法，自定义ViewGroup的child位置布局
     *
     * @param changed
     * @param l       ViewGroup父类 paddingLeft
     * @param t       paddingTop
     * @param r       paddingRight
     * @param b       paddingBottom
     */
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int cl = 0;
        int ct = 0;
        int cr = 0;
        int cb = 0;

        int h = 0;//由于两个控件垂直放置，需要记录高度
        //为每一个子View指定位置  所需效果：查看mipmap里面的效果图
        for(int i=0;i<childCount;i++){
            View childView = getChildAt(i);
            if(i==0){//第一个放到上面的中间
                cl = (getMeasuredWidth()-childView.getMeasuredWidth())/2;
                ct = 0;
                cr = cl+childView.getMeasuredWidth();
                cb = ct+childView.getMeasuredHeight();
                h = ct+childView.getMeasuredHeight();
            }
            if(i==1){
                cl=0;
                ct=h;
                cr=cl+childView.getMeasuredWidth();
                cb=cb+childView.getMeasuredHeight();
            }
            childView.layout(cl,ct,cr,cb);
        }
    }

    /**
     * 确定ViewGroup的宽高
     *
     * @param widthMeasureSpec  宽参数
     * @param heightMeasureSpec 高参数
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //ViewGroup主要是一个容器，当ViewGroup的宽高是确切的值的时候，控件的宽高就是它本身设置的值
        //主要是考虑ViewGroup Wrap_content的时候，此时就需要计算控件的宽高了，控件的宽高就是子View的总的宽高
        int width = 0;
        int height = 0;
        int mWidthMeasureMode = MeasureSpec.getMode(widthMeasureSpec);
        measureChildren(widthMeasureSpec, heightMeasureSpec);//初始化所有子View的宽高
        childCount = getChildCount();

        if (mWidthMeasureMode == MeasureSpec.AT_MOST) {//Wrap_content的情况
            //测量子View的宽  怎么测量子View的宽
            //由于是垂直放置  这里需要最大的那个宽度
            int maxWidth = 0;
            for (int i = 0; i < childCount; i++) {
                View childView = getChildAt(i);
                width = childView.getMeasuredWidth();
                maxWidth = (width>maxWidth)?width:maxWidth;
            }
            width = maxWidth;
        } else {
            width = MeasureSpec.getSize(widthMeasureSpec);
        }

        int mHeightMeasureMode = MeasureSpec.getMode(heightMeasureSpec);
        if (mHeightMeasureMode == MeasureSpec.AT_MOST) {
            for (int i = 0; i < childCount; i++) {
                View childView = getChildAt(i);
                height += childView.getMeasuredHeight();
            }
        } else {
            height = MeasureSpec.getSize(heightMeasureSpec);
        }
        setMeasuredDimension(width, height);
    }
}