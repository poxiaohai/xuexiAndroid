package com.example.cheng.android.view;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cheng.android.R;
import com.example.cheng.android.view.SubView.FlowGroupView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FlayoutActivity extends AppCompatActivity {
    @BindView(R.id.FlowGroupView)
    com.example.cheng.android.view.SubView.FlowGroupView FlowGroupView;
    private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flayout);
        ButterKnife.bind(this);
        setTwoFlowLayout();
    }

    private void setTwoFlowLayout() {
        //添加数据
        names = new ArrayList<String>();
        names.add("降龙十八掌");
        names.add("黯然销魂掌");
        names.add("左右互搏术");
        names.add("七十二路空明拳");
        names.add("小无相功");
        names.add("拈花指");
        names.add("打狗棍法");
        names.add("蛤蟆功");
        names.add("九阴白骨爪");
        names.add("一招半式闯江湖");
        names.add("醉拳");
        names.add("龙蛇虎豹");
        names.add("葵花宝典");
        names.add("吸星大法");
        names.add("如来神掌警示牌");
        //为布局添加内容
        for (int i = 0; i < names.size(); i++) {
            addTextView(names.get(i));
        }
    }

    /**
     * 动态添加布局
     * @param str
     */
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void addTextView(String str) {
        TextView child = new TextView(this);
        ViewGroup.MarginLayoutParams params = new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.WRAP_CONTENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT);
        params.setMargins(5, 5, 5, 5);
        child.setLayoutParams(params);
        child.setText(str);
        child.setTextColor(Color.RED);
        child.setBackgroundDrawable(FlayoutActivity.this.getDrawable(R.drawable.checked_bg));
        initEvents(child);//监听
        FlowGroupView.addView(child);
    }

    /**
     * 为每个view 添加点击事件
     */
    private void initEvents(final TextView tv){
        tv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(FlayoutActivity.this, tv.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}


