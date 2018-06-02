package com.example.cheng.android.Handler;

import java.util.Random;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class SubThread extends Thread {
	Handler mHandlerMain;
	Handler mHandlerSub=null;
	
	public Handler getHandler(){
		return mHandlerSub;
	}
	
	public SubThread(Handler handler){
		mHandlerMain=handler;
		
	};
	
	public void run(){
		///..................
		super.run();
		
		Looper.prepare();
		
		mHandlerSub=new Handler(){
			@Override
			public void handleMessage(Message msg) {
				if(msg.what<6){
					// TODO Auto-generated method stub
					Message msg1 =Message.obtain();
					msg1.what=msg.what;
					msg1.arg1=new Random().nextInt(6);
					mHandlerMain.sendMessage(msg1);
					super.handleMessage(msg1);
				}else {
					//stop（）不起作用，destroy()有不支持的异常
					//可以参考守护线程进行解决
					Thread.currentThread().interrupt();
					//Thread.currentThread().destroy();
				}
			}
		};		
		Looper.loop();
	}
}
