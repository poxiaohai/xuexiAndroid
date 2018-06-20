package com.example.cheng.android.ipc;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.cheng.android.BaseActivity;
import com.example.cheng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AidlActivity extends BaseActivity {

    @BindView(R.id.adidl)
    TextView adidl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aidl);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.adidl})
    public void onViewClicked(View view) {
        switch (view.getId()){
            case R.id.adidl:

                break;
        }
    }
}
