package com.example.cheng.android.Listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.AbsListView;
import android.widget.ListView;

import com.example.cheng.android.R;
import com.example.cheng.android.adapter.Adapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListViewActivity extends AppCompatActivity {

    @BindView(R.id.listview)
    ListView listview;
    private Adapter adapter;
    private int LastVisibleItem;
    private ArrayList<String> datas=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ButterKnife.bind(this);
        for (int i=0;i<100;i++){
            datas.add("items"+i);
        }
        adapter=new Adapter(ListViewActivity.this,datas);
        listview.setAdapter(adapter);
        //设置需要显示第几项
        listview.setSelection(20);
        listview.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView absListView, int i) {
                    switch (i){
                        case SCROLL_STATE_IDLE://停止滑动
                            break;

                        case SCROLL_STATE_TOUCH_SCROLL://正在滑动
                            break;
                        case SCROLL_STATE_FLING://手指用力滑动时
                            break;
                    }
            }

            @Override
            public void onScroll(AbsListView absListView, int firstVisibleItem, int VisiableItemCount, int TotalItemCount) {
                //滚动式一致调用
                if((firstVisibleItem+VisiableItemCount)==TotalItemCount&&TotalItemCount>0){
                    Log.e("=========","滑动到最后一行");
                }
                if(firstVisibleItem>LastVisibleItem){
                    Log.e("===========","向上滑动");

                }else if(firstVisibleItem<LastVisibleItem) {
                    Log.e("===========","向下滑动");
                }

                LastVisibleItem=firstVisibleItem;
            }
        });

        listview.getLastVisiblePosition();
        listview.getFirstVisiblePosition();

    }
}
