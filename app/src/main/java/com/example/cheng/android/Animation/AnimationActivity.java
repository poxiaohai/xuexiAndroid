package com.example.cheng.android.Animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cheng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AnimationActivity extends AppCompatActivity {

    @BindView(R.id.frame)
    TextView frame;
    @BindView(R.id.tween)
    TextView tween;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.frame, R.id.tween,R.id.shuxing})
    public void onViewClicked(View view) {
        Intent intent=new Intent();
        switch (view.getId()) {
            case R.id.frame:
                intent.setClass(AnimationActivity.this,frameActivity.class);
                startActivity(intent);
                break;
            case R.id.shuxing:
                intent.setClass(AnimationActivity.this,AttributeActivity.class);
                startActivity(intent);
                break;
            case R.id.tween:
                break;
        }
    }
}
