package com.example.cheng.android.Animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.cheng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class tweenActivity extends AppCompatActivity {

    @BindView(R.id.mAlphaAnimation)
    TextView mAlphaAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.mAlphaAnimation,R.id.tiaozhuan})
    public void onViewClicked(View view) {
        switch (view.getId()){
            case R.id.mAlphaAnimation:
                break;
            case  R.id.tiaozhuan:
                Intent intent=new Intent();
                intent.setClass(tweenActivity.this,Activitya.class);
                startActivity(intent);
//                overridePendingTransition(android.R.anim.,R.anim.exit_anim);
                break;
        }
    }
}
