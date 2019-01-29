package com.example.cheng.android.MPAndroidChart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cheng.android.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.List;

public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);
        PieChart picChart=findViewById(R.id.pic_chart);
        List<PieEntry> strings = new ArrayList<>();
        strings.add(new PieEntry(30f,"aaa"));
        strings.add(new PieEntry(70f,"bbb"));



// 获取pieCahrt图列
        Legend l = picChart.getLegend();
        l.setEnabled(true);                    //是否启用图列（true：下面属性才有意义）
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.VERTICAL);

        PieDataSet dataSet = new PieDataSet(strings,"Label");
        picChart.setDescription(null);
        ArrayList<Integer> colors = new ArrayList<Integer>();
        colors.add(getResources().getColor(R.color.login_red));
        colors.add(getResources().getColor(R.color.gplus_color_4));
        dataSet.setColors(colors);

        PieData pieData = new PieData(dataSet);
        pieData.setDrawValues(true);

        picChart.setData(pieData);
        picChart.invalidate();

    }
}
