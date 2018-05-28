package com.example.cheng.android.Service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

import com.socks.library.KLog;

public class TestOnceService extends Service {
    public TestOnceService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return new myBind();
    }

   public  class  myBind extends Binder{
        @Override
        protected boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code){
                case 1:
                    KLog.e("=========","TestOnceService=======>"+data.readString());
                    KLog.e("=========","TestOnceService=======>"+data.readInt());
                    reply.writeInt(1000);
                    reply.writeString("小明");
                    return true;
            }

            return super.onTransact(code, data, reply, flags);
        }
    }

}
