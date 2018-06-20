package com.example.cheng.android.ipc;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;

import com.example.cheng.android.IDataInterface;

public class RoomService extends Service {
    public RoomService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }
    Binder binder=new IDataInterface.Stub() {
        @Override
        public int getRoomNum() throws RemoteException {
            return 3000;
        }
    };
}
