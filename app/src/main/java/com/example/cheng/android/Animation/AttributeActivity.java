package com.example.cheng.android.Animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cheng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AttributeActivity extends AppCompatActivity {

    @BindView(R.id.Alpha)
    TextView Alpha;
    @BindView(R.id.Rotate)
    TextView Rotate;
    @BindView(R.id.Translate)
    TextView Translate;
    @BindView(R.id.Scale)
    TextView Scale;
    @BindView(R.id.AnimationSet)
    TextView AnimationSet;
    @BindView(R.id.image)
    ImageView imageView;
    ScaleAnimation scaleAnimation;
    private TranslateAnimation ta;
    private RotateAnimation ra;
    private AlphaAnimation aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attribute);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.Alpha, R.id.Rotate, R.id.Translate, R.id.Scale, R.id.AnimationSet})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Alpha:
                aa=new AlphaAnimation(0,1);
                aa.setDuration(5000);
                imageView.startAnimation(aa);
                break;
            case R.id.Rotate:
                /**
                 * fromDegrees toDegrees 起始角度
                 * pivotX pivotY 中心坐标
                 */
               ra=new RotateAnimation(0,360,100,100);
                ra.setDuration(5000);
                imageView.startAnimation(ra);
                break;
            case R.id.Translate:
                /**
                 *起点 x值 终点x值
                 * 终点 y值 终点y 值
                 */
                ta=new TranslateAnimation(0,200,0,300);
                ta.setDuration(5000);
                imageView.setAnimation(ta);
                break;
            case R.id.Scale:
                /**
                 *起点 x值 终点x值
                 * 终点 y值 终点y 值
                 */
                scaleAnimation=new ScaleAnimation(0,2,0,2);
                scaleAnimation.setDuration(5000);
                imageView.setAnimation(scaleAnimation);
                break;
            case R.id.AnimationSet:
                android.view.animation.AnimationSet animationSet=new AnimationSet(true);
                animationSet.setDuration(1000);
                AlphaAnimation alphaAnimation=new AlphaAnimation(0,1);
                aa.setDuration(1000);
                animationSet.addAnimation(alphaAnimation);
                TranslateAnimation ta=new TranslateAnimation(0,100,0,200);
                ta.setDuration(1000);
                animationSet.addAnimation(ta);
                imageView.setAnimation(animationSet);
                break;
        }
    }
}
