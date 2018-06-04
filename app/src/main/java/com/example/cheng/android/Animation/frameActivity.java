package com.example.cheng.android.Animation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.cheng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class frameActivity extends AppCompatActivity {

    @BindView(R.id.imageView)
    ImageView imageView;
    @BindView(R.id.start)
    Button start;
    @BindView(R.id.stop)
    Button stop;
    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        ButterKnife.bind(this);
        setXml2FrameAnim2();

    }

    private void setXml2FrameAnim1() {
        // 把动画资源设置为imageView的背景,也可直接在XML里面设置
        imageView.setBackgroundResource(R.drawable.frame_anim);
        animationDrawable = (AnimationDrawable) imageView.getBackground();
    }

    /**
     * 通过XML添加帧动画方法二
     */
    private void setXml2FrameAnim2() {

        // 通过逐帧动画的资源文件获得AnimationDrawable示例
        animationDrawable = (AnimationDrawable) getResources().getDrawable(
                R.drawable.frame_anim);
        animationDrawable.setOneShot(false);
        imageView.setBackground(animationDrawable);
    }

    @OnClick({R.id.start, R.id.stop})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.start:
                if (animationDrawable != null && !animationDrawable.isRunning()) {
                    animationDrawable.start();
                }
                break;
            case R.id.stop:
                if (animationDrawable != null && animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
                break;
        }
    }	/**
     * 通过代码添加帧动画方法
     */
    private void setSrc2FrameAnim() {

        animationDrawable = new AnimationDrawable();
        // 为AnimationDrawable添加动画帧
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img00), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img01), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img02), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img03), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img04), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img05), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img06), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img07), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img08), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img09), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img10), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img11), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img12), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img13), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img14), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img15), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img16), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img17), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img18), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img19), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img20), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img21), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img22), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img23), 50);
        animationDrawable.addFrame(
                getResources().getDrawable(R.drawable.img24), 50);
        // 设置为循环播放
        animationDrawable.setOneShot(true);
        imageView.setBackground(animationDrawable);
    }



}
