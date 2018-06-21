package com.example.aidlclient;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cheng.android.IDataInterface;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private  TextView startService,ipcservice;
    private IDataInterface iDataInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService=findViewById(R.id.startservice);
        startService.setOnClickListener(this);
        ipcservice=findViewById(R.id.ipcservice);
        ipcservice.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.startservice:
              Intent intent=new Intent();
              intent.setAction("com.cfr.demo.IDataInterface");
              intent.setPackage("com.example.cheng.android");
                bindService(intent, connection,BIND_AUTO_CREATE);
                break;
            case R.id.ipcservice:
                try {
                    int num=iDataInterface.getRoomNum();
                    Toast.makeText(MainActivity.this,num+"",Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }

    }

   ServiceConnection connection=new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Toast.makeText(MainActivity.this,"绑定成功",Toast.LENGTH_LONG).show();
            iDataInterface=IDataInterface.Stub.asInterface(iBinder);
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            Toast.makeText(MainActivity.this,"启动失败",Toast.LENGTH_LONG).show();
        }
    };
}
