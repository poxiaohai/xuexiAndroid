package com.example.cheng.android.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.cheng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ViewActivity extends AppCompatActivity {

    @BindView(R.id.btn1)
    TextView btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn1,R.id.btn2})
    public void onViewClicked(View view) {
        Intent intent=new Intent();
        switch (view.getId()){
            case R.id.btn1:
                intent.setClass(ViewActivity.this,ViewGroupActivity.class);
                startActivity(intent);
                break;
            case R.id.btn2:
                intent.setClass(ViewActivity.this,CanvaActivity.class);
                startActivity(intent);
                break;
        }
    }
}
