package com.example.cheng.android.UI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.cheng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class UIActivity extends AppCompatActivity {

    @BindView(R.id.Include)
    TextView Include;
    @BindView(R.id.ViewStub)
    TextView ViewStub;
    @BindView(R.id.merge)
    TextView merge;
    @BindView(R.id.compoundDrawable)
    TextView compoundDrawable;
    @BindView(R.id.lit)
    TextView lit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.Include, R.id.ViewStub, R.id.merge, R.id.compoundDrawable, R.id.lit})
    public void onViewClicked(View view) {
        Intent intent=new Intent();
        switch (view.getId()) {
            case R.id.Include:
                break;
            case R.id.ViewStub:
                intent.setClass(UIActivity.this,ViewStubActivity.class);
                startActivity(intent);
                break;
            case R.id.merge:
                intent.setClass(UIActivity.this,mergeActivity.class);
                startActivity(intent);
                break;
            case R.id.compoundDrawable:
                intent.setClass(UIActivity.this,CompoundDrawableActivity.class);
                startActivity(intent);
                break;
            case R.id.lit:
                break;
        }
    }
}
