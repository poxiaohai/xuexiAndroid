package com.example.cheng.android.Scroll;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.cheng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ScorllActivity extends AppCompatActivity {

    @BindView(R.id.textview1)
    TextView textview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorll);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.textview1})
    public void onViewClicked(View view) {
        Intent intent=new Intent();
        switch (view.getId()){
            case R.id.textview1:
                intent.setClass(ScorllActivity.this,AndroidScrollActivity.class);
                startActivity(intent);
                break;
        }
    }
}
