package com.example.cheng.android.Service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.cheng.android.R;
import com.socks.library.KLog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ServiceActivity extends AppCompatActivity {

    @BindView(R.id.startservice)
    TextView startservice;
    @BindView(R.id.BindService)
    TextView BindService;
private  TestTwoService testTwoService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.startservice, R.id.BindService,R.id.huoqusuijishu})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.startservice:
                bundlieService();
                break;
            case R.id.BindService:
                BindServices();
                break;
            case R.id.huoqusuijishu:
             KLog.e( testTwoService.getRandomNumber());
                break;
        }
    }

    private void BindServices() {
        ServiceConnection connection=new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                testTwoService=((TestTwoService.MyBinder)iBinder).getService();
            }

            @Override
            public void onServiceDisconnected(ComponentName componentName) {

            }
        };
        Intent intent=new Intent(ServiceActivity.this,TestTwoService.class);
        bindService(intent,connection, Context.BIND_AUTO_CREATE);


    }

    private void bundlieService() {
        Intent intent=new Intent(ServiceActivity.this,TestTwoService.class);
        this.startService(intent);
    }
}
