package com.example.cheng.android.Mvp.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import com.example.cheng.android.BaseActivity;
import com.example.cheng.android.Mvp.Fragment.HomeFragment;
import com.example.cheng.android.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MvpMainActivity extends BaseActivity {
    @BindView(R.id.nav)
    NavigationView nav;
    @BindView(R.id.activity_na)
    DrawerLayout activityNa;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    HomeFragment mHomeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp_main);
        ButterKnife.bind(this);
        InintTitleBar();
        initNavigationView();
        AddIndexFragment();
    }

    /**
     * 添加碎片
     */
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    private void AddIndexFragment() {
        mFragmentManager=getFragmentManager();
        mFragmentTransaction=  mFragmentManager.beginTransaction();
        mHomeFragment=new HomeFragment();
        mFragmentTransaction.add(R.id.mFrameLayout,mHomeFragment);
        mFragmentTransaction.commit();

    }

    private void initNavigationView() {
//       View HeadView= nav.getHeaderView(0);
       nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               switch (item.getItemId()){
                   case R.id.favorite:
                       swich(0);
                       break;
                   case R.id.wallet:
                       swich(1);
                       break;
                   case R.id.photo:
                       swich(2);
                       break;
                   case R.id.dress:
                       swich(3);
                       break;
                   case R.id.file:
                       swich(4);
                       break;
                   case R.id.aaa:
                       swich(5);
                       break;
               }
               return true;
           }
       });



    }

    private void InintTitleBar() {
        toolbar.setTitle("首页");
        toolbar.setNavigationIcon(R.mipmap.ic_menu);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityNa.openDrawer(Gravity.LEFT);
            }
        });
    }

    public  void swich(int type){
        switch (type){
            case 0:
                mFragmentTransaction.replace(R.id.mFrameLayout,mHomeFragment);
                break;
            case 1:
                mFragmentTransaction.replace(R.id.mFrameLayout,mHomeFragment);
                break;
            case 2:
                mFragmentTransaction.replace(R.id.mFrameLayout,mHomeFragment);
                break;
            case 3:
                mFragmentTransaction.replace(R.id.mFrameLayout,mHomeFragment);
                break;
            case 4:
                mFragmentTransaction.replace(R.id.mFrameLayout,mHomeFragment);
                break;
            case 5:
                mFragmentTransaction.replace(R.id.mFrameLayout,mHomeFragment);
                break;

        }

        activityNa.closeDrawers();


    }


}
