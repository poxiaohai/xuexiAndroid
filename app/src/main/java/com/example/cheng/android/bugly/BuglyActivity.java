package com.example.cheng.android.bugly;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.cheng.android.BaseActivity;
import com.example.cheng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BuglyActivity extends BaseActivity {

    @BindView(R.id.image)
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bugly);
        ButterKnife.bind(this);
        image.setImageResource(R.drawable.img02);
//        int count=10/0;
    }
}
