package com.example.cheng.android.Mvp.activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;

import com.example.cheng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MvpMainActivity extends AppCompatActivity {
    @BindView(R.id.nav)
    NavigationView nav;
    @BindView(R.id.activity_na)
    DrawerLayout activityNa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp_main);
        ButterKnife.bind(this);

    }
}
