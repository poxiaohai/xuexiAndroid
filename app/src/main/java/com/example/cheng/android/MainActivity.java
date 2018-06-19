package com.example.cheng.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.cheng.GreenDao.GreenDaoActivity;
import com.example.cheng.android.Animation.AnimationActivity;
import com.example.cheng.android.BaseBottom.BaseBottomViewActivity;
import com.example.cheng.android.CheckVersion.CheckVersionActivity;
import com.example.cheng.android.Handler.HandlerMainActivity;
import com.example.cheng.android.Handler.HanlderListActivity;
import com.example.cheng.android.Listview.ListViewActivity;
import com.example.cheng.android.Okgo.OKGoActivity;
import com.example.cheng.android.Permission.PermissionActivity;
import com.example.cheng.android.Permission.PermissionUtilsActivity;
import com.example.cheng.android.RecyclerView.RecyclerViewActivity;
import com.example.cheng.android.RecyclerView.RecyclerViewActivity2;
import com.example.cheng.android.Scroll.AndroidScrollActivity;
import com.example.cheng.android.Scroll.ScorllActivity;
import com.example.cheng.android.Service.ServiceActivity;
import com.example.cheng.android.Test.TestActivity;
import com.example.cheng.android.Thead.TheadActivity;
import com.example.cheng.android.UI.UIActivity;
import com.example.cheng.android.Volley.VolleyActivity;
import com.example.cheng.android.activity.CircleProgressViewActivity;
import com.example.cheng.android.activity.VideoActivity;
import com.example.cheng.android.adapter.Adapter;
import com.example.cheng.android.bugly.BuglyActivity;
import com.example.cheng.android.google.GoogleActivity;
import com.example.cheng.android.huanxin.HuanXinMainActivity;
import com.example.cheng.android.shijian.Activity.ScrollViewForListViewActivity;
import com.example.cheng.android.shijian.Activity.ShijianActivity;
import com.example.cheng.android.view.CircleProgressView;
import com.example.cheng.android.view.ViewActivity;
import com.example.cheng.android.youmeng.YoumengActivity;
import com.umeng.analytics.MobclickAgent;

import java.util.ArrayList;

public class MainActivity extends BaseActivity  {
    private ListView listView;
    private Adapter adapter;
    private ArrayList<String> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inintData();
        listView=this.findViewById(R.id.listview);
        adapter=new Adapter(MainActivity.this,list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent();
                switch (i){
                    case 0:
                        intent.setClass(MainActivity.this, CircleProgressViewActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.setClass(MainActivity.this, VideoActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.setClass(MainActivity.this, HuanXinMainActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent.setClass(MainActivity.this, TheadActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent.setClass(MainActivity.this, ScrollViewForListViewActivity.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent.setClass(MainActivity.this, ShijianActivity.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent.setClass(MainActivity.this, ViewActivity.class);
                        startActivity(intent);
                        break;
                    case 7:
                        intent.setClass(MainActivity.this, ListViewActivity.class);
                        startActivity(intent);
                        break;
                    case 8:
                        intent.setClass(MainActivity.this, RecyclerViewActivity.class);
                        startActivity(intent);
                        break;
                    case 9:
                        intent.setClass(MainActivity.this, RecyclerViewActivity2.class);
                        startActivity(intent);
                        break;
                    case 10:
                        intent.setClass(MainActivity.this, ScorllActivity.class);
                        startActivity(intent);
                        break;
                    case 11:
                        intent.setClass(MainActivity.this, PermissionActivity.class);
                        startActivity(intent);
                        break;
                    case 12:
                        intent.setClass(MainActivity.this, PermissionUtilsActivity.class);
                        startActivity(intent);
                        break;
                    case 13:
                        intent.setClass(MainActivity.this, GoogleActivity.class);
                        startActivity(intent);
                        break;
                    case 14:
                        intent.setClass(MainActivity.this, BuglyActivity.class);
                        startActivity(intent);
                        break;
                    case 15:
                        intent.setClass(MainActivity.this, OKGoActivity.class);
                        startActivity(intent);
                        break;
                    case 16:
                        intent.setClass(MainActivity.this, GreenDaoActivity.class);
                        startActivity(intent);
                        break;
                    case 17:
                        intent.setClass(MainActivity.this, UIActivity.class);
                        startActivity(intent);
                        break;
                    case 18:
                        intent.setClass(MainActivity.this, CheckVersionActivity.class);
                        startActivity(intent);
                        break;
                    case 19:
                        intent.setClass(MainActivity.this, CheckVersionActivity.class);
                        startActivity(intent);
                        break;
                    case 20:
                        intent.setClass(MainActivity.this, VolleyActivity.class);
                        startActivity(intent);
                        break;
                    case 21:
                        intent.setClass(MainActivity.this, ServiceActivity.class);
                        startActivity(intent);
                        break;
                    case 22:
                        intent.setClass(MainActivity.this, BaseBottomViewActivity.class);
                        startActivity(intent);
                        break;
                    case 23:
                        intent.setClass(MainActivity.this, TestActivity.class);
                        startActivity(intent);
                        break;
                    case 24:
                        intent.setClass(MainActivity.this, HanlderListActivity.class);
                        startActivity(intent);
                        break;
                    case 25:
                        intent.setClass(MainActivity.this, AnimationActivity.class);
                        startActivity(intent);
                        break;
                    case 26:
                        intent.setClass(MainActivity.this, YoumengActivity.class);
                        startActivity(intent);
                        break;
                    case 27:
                        intent.setClass(MainActivity.this, YoumengActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
        
    }


    private void inintData() {
        list.add("haha");
        list.add("视频播放");
        list.add("环信");
        list.add("线程之间通信");
        list.add("事件冲突");
        list.add("事件冲突2");
        list.add("自定义view");
        list.add("listview");
        list.add("RecyclerView");
        list.add("RecyclerView2");
        list.add("Android Scroll分析");
        list.add("权限管理");
        list.add("权限框架");
        list.add("google");
        list.add("bugly热更新");
        list.add("okgo");
        list.add("数据库操作");
        list.add("布局优化");
        list.add("版本升级");
        list.add("极光");
        list.add("volley");
        list.add("service");
        list.add("弹出框");
        list.add("test");
        list.add("handler");
        list.add("动画");
        list.add("友盟错误统计");
        list.add("mvp demo" );
    }
}
