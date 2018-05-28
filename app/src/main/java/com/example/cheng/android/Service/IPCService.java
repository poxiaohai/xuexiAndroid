package com.example.cheng.android.Service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

import com.socks.library.KLog;

/**
 * Created by Jay on 2015/8/18 0018.
 */
public class IPCService extends Service {

    private static final String DESCRIPTOR = "IPCService";
    private final String[] names = { "B神", "艹神", "基神", "J神", "翔神" };
    private MyBinder mBinder = new MyBinder();

    private class MyBinder extends Binder {
        @Override
        protected boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
            case 0x001: {
                data.enforceInterface(DESCRIPTOR);
                int num = data.readInt();
                KLog.e("=======",num+"");
                reply.writeString(names[num]);
                return true;
            }
            }
            return super.onTransact(code, data, reply, flags);
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
}