package com.example.aidlclient;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cheng.android.IDataInterface;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private  TextView startService,ipcservice;
    private IDataInterface iDataInterface;

    private  TextView StartMessenger,IpcMessenger;
    Messenger ServiceMessenger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService=findViewById(R.id.startservice);
        startService.setOnClickListener(this);
        ipcservice=findViewById(R.id.ipcservice);
        ipcservice.setOnClickListener(this);
        StartMessenger=findViewById(R.id.StartMessenger);
        IpcMessenger=findViewById(R.id.IpcMessenger);
        StartMessenger.setOnClickListener(this);
        IpcMessenger.setOnClickListener(this);
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
            case R.id.StartMessenger:
                Intent intent1=new Intent();
                intent1.setAction("com.example.cheng.android.ipc.MessengerService");
                intent1.setPackage("com.example.cheng.android");
                bindService(intent1, new ServiceConnection() {
                    @Override
                    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        Toast.makeText(MainActivity.this,"链接成功",Toast.LENGTH_LONG).show();
                        ServiceMessenger=new Messenger(iBinder);//服务端信使
                    }

                    @Override
                    public void onServiceDisconnected(ComponentName componentName) {
                        Toast.makeText(MainActivity.this,"连接失败",Toast.LENGTH_LONG).show();
                    }
                },BIND_AUTO_CREATE);

                break;

            case R.id.IpcMessenger:
                try {
                    if(ServiceMessenger!=null) {
                        Message message = Message.obtain();
                        message.what = 1;
                        message.arg1 = 3334444;
                        message.replyTo=clientMessenger;
                        ServiceMessenger.send(message);
                    }
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

    //---------------------------------------------------信使通信部分--------------------------------------------------------
  public class myhander extends Handler{
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 2:
                    Bundle bundle= (Bundle) msg.obj;
                    String name=bundle.getString("name");
                    Toast.makeText(MainActivity.this, ""+ msg.arg1+"======"+name,Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
    Messenger clientMessenger=new Messenger(new myhander());




}
