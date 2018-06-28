package com.example.cheng.android.Mvp.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cheng.android.BaseActivity;
import com.example.cheng.android.Mvp.Fragment.ArticleDetailFragment;
import com.example.cheng.android.R;

public class ArticleDetailActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_detail);
        FragmentManager mFragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=mFragmentManager.beginTransaction();
        ArticleDetailFragment articleDetailFragment=new ArticleDetailFragment();
        fragmentTransaction.add(R.id.article_detail_container,articleDetailFragment);
        fragmentTransaction.commit();
    }
}
