package com.example.cheng.android.UI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;

import com.example.cheng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewStubActivity extends AppCompatActivity {

    @BindView(R.id.error_stub)
    ViewStub errorStub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_stub);
        ButterKnife.bind(this);
        /**
         * view 为0
         * 只有VISIBLE 才浪费资源
         */
        errorStub.setVisibility(View.VISIBLE);
//        errorStub.inflate();
    }
}
