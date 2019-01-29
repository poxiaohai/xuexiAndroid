package com.example.cheng.android.MPAndroidChart;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.cheng.android.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.LargeValueFormatter;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {
    private BarChart mBarChart;
    private BarData mBarData;
    protected Typeface tfLight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);
        tfLight = Typeface.createFromAsset(getAssets(), "OpenSans-Light.ttf");
         mBarChart = findViewById(R.id.bar_chart);
        ArrayList<BarEntry> yValues = new ArrayList<>();
        for (int x = 0; x < 6; x++) {
            float y = (float) (Math.random() * 30);
            yValues.add(new BarEntry(x, y));
        }

        ArrayList<BarEntry> yValues1 = new ArrayList<>();
        for (int x =6; x < 12; x++) {
            float y = (float) (Math.random() * 30);
            yValues1.add(new BarEntry(x, y));
        }

        ArrayList<BarEntry> yValues2 = new ArrayList<>();
        for (int x = 0; x < 6; x++) {
            float y = (float) (Math.random() * 30);
            yValues2.add(new BarEntry(x, y));
        }

        ArrayList<BarEntry> values1 = new ArrayList<>();
        ArrayList<BarEntry> values2 = new ArrayList<>();
        ArrayList<BarEntry> values3 = new ArrayList<>();


        for (int i = 0; i < 12; i++) {
            values1.add(new BarEntry(i, (float) (Math.random() * 10)));
            values2.add(new BarEntry(i, (float) (Math.random() * 12)));
            values3.add(new BarEntry(i, (float) (Math.random() * 16)));
        }

//
//        Description description = new Description();
//        description.setXOffset(50f);
//        description.setYOffset(10f);
//        description.setText("我是 description");
//        mBarChart.setDescription(description);
//        mBarChart.setScaleEnabled(false);
//        // 设置 柱子的宽度
//        // mBarData.setBarWidth(2f);
//        // 获取 x 轴
//        XAxis xAxis = mBarChart.getXAxis();
//        // 设置 x 轴显示位置
//        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
//        // 取消 垂直 网格线
//        xAxis.setDrawGridLines(false);
//        // 设置 x 轴 坐标旋转角度
//        xAxis.setLabelRotationAngle(10f);
//        // 设置 x 轴 坐标字体大小
//        xAxis.setTextSize(10f);
//        // 设置 x 坐标轴 颜色
//        xAxis.setAxisLineColor(Color.RED);
//        // 设置 x 坐标轴 宽度
//        xAxis.setAxisLineWidth(2f);
//        // 设置 x轴 的刻度数量
//        xAxis.setLabelCount(10);
//        // 获取 右边 y 轴
//        YAxis mRAxis = mBarChart.getAxisRight();
//        // 隐藏 右边 Y 轴
//        mRAxis.setEnabled(false);
//        // 获取 左边 Y轴
//        YAxis mLAxis = mBarChart.getAxisLeft();
//        // 取消 左边 Y轴 坐标线
//        mLAxis.setDrawAxisLine(false);
//        // 取消 横向 网格线
//        mLAxis.setDrawGridLines(false);
//        // 设置 Y轴 的刻度数量
//        mLAxis.setLabelCount(10);



        Legend l = mBarChart.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.VERTICAL);
        l.setDrawInside(true);
        l.setTypeface(tfLight);
        l.setYOffset(0f);
        l.setXOffset(10f);
        l.setYEntrySpace(0f);
        l.setTextSize(8f);

        BarDataSet     set1 = new BarDataSet(values1, "Company A");
        set1.setColor(Color.rgb(104, 241, 175));
        BarDataSet   set2 = new BarDataSet(values2, "Company B");
        set2.setColor(Color.rgb(164, 228, 251));
        BarDataSet   set3 = new BarDataSet(values3, "Company C");
        set3.setColor(Color.rgb(242, 247, 158));
         mBarData = new BarData(set1, set2, set3);
        mBarChart.setData(mBarData);
        mBarChart.animateY(1500);
        mBarChart.setEnabled(false);
//        mBarChart.setDescription(null);


    }
}
