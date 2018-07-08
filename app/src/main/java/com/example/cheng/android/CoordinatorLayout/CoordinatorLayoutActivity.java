package com.example.cheng.android.CoordinatorLayout;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.cheng.android.BaseActivity;
import com.example.cheng.android.R;
import com.example.cheng.android.RecyclerView.Adapter.HomeAdapter;
import com.example.cheng.android.RecyclerView.Adapter.MyItemDecoration;
import com.example.cheng.android.RecyclerView.RecyclerViewActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CoordinatorLayoutActivity extends BaseActivity {

    @BindView(R.id.imageview)
    ImageView imageview;
    @BindView(R.id.imageviewT)
    ImageView imageviewT;
    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;
    @BindView(R.id.activity_main)
    CoordinatorLayout activityMain;

    private HomeAdapter mHomeAdapter;
    private List<String> mList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_layout);
        ButterKnife.bind(this);
        for (int i=0;i<100;i++){
            mList.add("item"+i);
        }
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerview.setLayoutManager(manager);
        recyclerview.addItemDecoration(new MyItemDecoration());
        mHomeAdapter=new HomeAdapter(CoordinatorLayoutActivity.this,mList);
        mHomeAdapter.setOnItemClickListener(new HomeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(CoordinatorLayoutActivity.this,"onItemClick"+mList.get(position),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onItemLongClick(View view, int position) {
                Toast.makeText(CoordinatorLayoutActivity.this,"onItemLongClick"+mList.get(position),Toast.LENGTH_LONG).show();
            }
        });

        recyclerview.setAdapter(mHomeAdapter);

    }
}
