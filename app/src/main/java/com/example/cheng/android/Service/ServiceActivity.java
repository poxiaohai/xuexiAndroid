package com.example.cheng.android.Service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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
private TestOnceService.myBind myBinder;
    Parcel repy;
    private IBinder mIBinder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        ButterKnife.bind(this);
        bundlieServices();

    }

    @OnClick({R.id.startservice, R.id.BindService,R.id.huoqusuijishu,R.id.transact})
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
            case R.id.transact:
//               Parcel data=Parcel.obtain();
//               data.writeString("haha");
//               data.writeInt(12);
//                repy=Parcel.obtain();
//                try {
//                    myBinder.transact(1,data,repy,0);
//                } catch (RemoteException e) {
//                    e.printStackTrace();
//                }
//                KLog.e("=========","client"+repy.readString());
//                KLog.e("========","client"+repy.readInt());
                if (mIBinder == null) {
                    Toast.makeText(this, "未连接服务端或服务端被异常杀死", Toast.LENGTH_SHORT).show();
                } else {
                    android.os.Parcel _data = android.os.Parcel.obtain();
                    android.os.Parcel _reply = android.os.Parcel.obtain();
                    String _result = null;
                    try {
                        _data.writeInterfaceToken("IPCService");
                        _data.writeInt(1);
                        mIBinder.transact(0x001, _data, _reply, 0);
                        _result = _reply.readString();
                      KLog.e("========",_result);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    } finally {
                        _reply.recycle();
                        _data.recycle();
                    }
                }
                break;
        }
    }

    private void bundlieServices() {
        Intent intent=new Intent(ServiceActivity.this,IPCService.class);
        ServiceConnection serviceConnection=new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                mIBinder=   iBinder;

            }

            @Override
            public void onServiceDisconnected(ComponentName componentName) {

            }
        };
        bindService(intent,serviceConnection,Context.BIND_AUTO_CREATE);
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
