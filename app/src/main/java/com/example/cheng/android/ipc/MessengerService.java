package com.example.cheng.android.ipc;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

import com.socks.library.KLog;

public class MessengerService extends Service {
    private  Messenger clientMessenger;
    public MessengerService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return messenger.getBinder();
    }

    private Messenger messenger=new Messenger(new Myhander());//服务端信使

    public  class Myhander extends Handler{
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 1:
                    clientMessenger=msg.replyTo;//客户端信使
                    Message message=Message.obtain();
                    message.what=2;
                    message.arg1=11;
                    Bundle bundle=new Bundle();
                    bundle.putString("name","sb");
                    message.obj=bundle;
                    try {
                        clientMessenger.send(message);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                    KLog.e(msg.arg1+"====客户端");
                    break;
            }
        }
    }
}
