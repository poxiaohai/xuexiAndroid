package com.example.cheng.android.Animation;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cheng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AnimationActivity extends AppCompatActivity {

    @BindView(R.id.frame)
    TextView frame;
    @BindView(R.id.tween)
    TextView tween;
    @BindView(R.id.mAnimatorListener)
    TextView mAnimatorListener;
    @BindView(R.id.mlayout)
    LinearLayout mlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.frame, R.id.tween,R.id.shuxing,
            R.id.mAnimatorListener,R.id.layout})
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
            case R.id.mAnimatorListener:
                Toast.makeText(AnimationActivity.this,"haha",Toast.LENGTH_LONG).show();
                addmAnimatorListener();
                break;
            case R.id.layout:
                mlayout.clearAnimation();
                ScaleAnimation scaleAnimation=new ScaleAnimation(0,1,0,1);
                scaleAnimation.setDuration(2000);
                LayoutAnimationController layoutAnimationController=new LayoutAnimationController(scaleAnimation,0.5f);
                layoutAnimationController.setOrder(LayoutAnimationController.ORDER_NORMAL);
                mlayout.setLayoutAnimation(layoutAnimationController);
                break;

        }
    }

    private void addmAnimatorListener() {
        mAnimatorListener.clearAnimation();
        Animation Animation =new AlphaAnimation(0,1);
        Animation.setDuration(10000);
        Animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                Toast.makeText(AnimationActivity.this,"动画开始",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Toast.makeText(AnimationActivity.this,"动画结束",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                Toast.makeText(AnimationActivity.this,"动画执行",Toast.LENGTH_LONG).show();
            }
        });

        mAnimatorListener.setAnimation(Animation);

    }
}
