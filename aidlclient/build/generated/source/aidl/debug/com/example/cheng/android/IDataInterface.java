/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: E:\\xuexi\\xuexi\\xuexiAndroid\\aidlclient\\src\\main\\aidl\\com\\example\\cheng\\android\\IDataInterface.aidl
 */
package com.example.cheng.android;
public interface IDataInterface extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.example.cheng.android.IDataInterface
{
private static final java.lang.String DESCRIPTOR = "com.example.cheng.android.IDataInterface";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.example.cheng.android.IDataInterface interface,
 * generating a proxy if needed.
 */
public static com.example.cheng.android.IDataInterface asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.example.cheng.android.IDataInterface))) {
return ((com.example.cheng.android.IDataInterface)iin);
}
return new com.example.cheng.android.IDataInterface.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_getRoomNum:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getRoomNum();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.example.cheng.android.IDataInterface
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public int getRoomNum() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRoomNum, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getRoomNum = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public int getRoomNum() throws android.os.RemoteException;
}
