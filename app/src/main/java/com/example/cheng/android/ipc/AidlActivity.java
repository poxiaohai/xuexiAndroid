package com.example.cheng.android.ipc;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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
                Intent intent=new Intent();
                intent.setPackage("com.example.cheng.android");
                intent.setAction("com.cfr.demo.IDataInterface");
                bindService(intent, new ServiceConnection() {
                    @Override
                    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        Toast.makeText(AidlActivity.this,"绑定成功",Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onServiceDisconnected(ComponentName componentName) {
                        Toast.makeText(AidlActivity.this,"绑定失败",Toast.LENGTH_LONG).show();
                    }
                },BIND_AUTO_CREATE);
                break;
        }
    }
}
