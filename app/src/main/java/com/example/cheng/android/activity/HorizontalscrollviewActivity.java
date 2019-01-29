package com.example.cheng.android.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.cheng.android.MainActivity;
import com.example.cheng.android.R;

public class HorizontalscrollviewActivity extends AppCompatActivity {

    private int mWidth;
    private LinearLayout mLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontalscrollview);
        DisplayMetrics dm = new DisplayMetrics();// 获得屏幕分辨率
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        mWidth = dm.widthPixels;
        mLinearLayout = (LinearLayout) findViewById(R.id.scrollview_layout);// 实例化线性布局
        mLinearLayout.removeAllViews();// 删除以前的组件（如此保证每次都是horizontalscrollview中只有6个组件）
        for (int i = 0; i < 6; i++)

        {// 在horizontalscrollview中添加6个组件
            int width = mWidth / 3;
            LinearLayout itemLayout = (LinearLayout) LinearLayout.inflate(
                    HorizontalscrollviewActivity.this, R.layout.scrollview_item, null);// 动态实例化一个LinearLayout
            itemLayout.setLayoutParams(new LinearLayout.LayoutParams(width,
                    LinearLayout.LayoutParams.MATCH_PARENT));// 设置宽度为一张屏幕显示三个组件
            itemLayout.setGravity(Gravity.CENTER_VERTICAL);// 设置垂直居中

            ImageView mImageView = (ImageView) itemLayout
                    .findViewById(R.id.imageview);
            TextView mTextView = (TextView) itemLayout
                    .findViewById(R.id.textview);

            final String page = "第" + (i + 1) + "张";

            mTextView.setText(page);

            mLinearLayout.addView(itemLayout);
        }
    }


}
