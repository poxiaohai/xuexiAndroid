package com.example.cheng.android.shijian.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ListView;

import com.example.cheng.android.R;
import com.example.cheng.android.adapter.Adapter;
import com.example.cheng.android.shijian.ListViewForScrollView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ScrollViewForListViewActivity extends AppCompatActivity {

    @BindView(R.id.listview)
    ListView listview;
    private ArrayList<String> mdata=new ArrayList<>();
    private Adapter madapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view_for_list_view);
        ButterKnife.bind(this);
        for (int i=0;i<100;i++){
            mdata.add("items"+i);
        }
        madapter=new Adapter(ScrollViewForListViewActivity.this,mdata);
        listview.setAdapter(madapter);
        listview.setFocusable(false);
    }


}
