package com.example.cheng.android.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Toast;

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
private  Handler handler=new Handler(){
    @Override
    public void handleMessage(Message msg) {
        Toast.makeText(RecyclerViewActivity.this, "第七条数据发现改变", Toast.LENGTH_LONG).show();
        mList.remove(6);
        mList.add(6, "第七条数据发现改变");
        mHomeAdapter.notifyItemChanged(6);
    }
};
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
        mHomeAdapter=new HomeAdapter(RecyclerViewActivity.this,mList);
        mHomeAdapter.setOnItemClickListener(new HomeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(RecyclerViewActivity.this,"onItemClick"+mList.get(position),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onItemLongClick(View view, int position) {
                Toast.makeText(RecyclerViewActivity.this,"onItemLongClick"+mList.get(position),Toast.LENGTH_LONG).show();
            }
        });
        mRecyclerView.setAdapter(mHomeAdapter);
    }
}
