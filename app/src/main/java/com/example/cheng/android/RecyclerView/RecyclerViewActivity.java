package com.example.cheng.android.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import com.example.cheng.android.R;
import com.example.cheng.android.RecyclerView.Adapter.HomeAdapter;
import com.example.cheng.android.RecyclerView.Adapter.MyItemDecoration;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerViewActivity extends Activity {

    @BindView(R.id.mRecyclerView)
    RecyclerView mRecyclerView;
    private HomeAdapter mHomeAdapter;
    private List<String> mList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        ButterKnife.bind(this);
        for (int i=0;i<100;i++){
            mList.add("item"+i);
        }
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.addItemDecoration(new MyItemDecoration());
        mRecyclerView.setAdapter(new HomeAdapter(mList,RecyclerViewActivity.this));

    }
}
