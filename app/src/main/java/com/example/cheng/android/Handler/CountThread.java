package com.example.cheng.android.Handler;

import android.os.Handler;
import android.os.Message;

public class CountThread extends Thread {
	//线程的序号
	private int mIndex=-1;
	//用于向主界面发送消息
	private Handler mHandler;
	//用于标记线程是否停止
	private boolean mIsStop=false;
	
	private int mCount=0;
	public CountThread(int index, Handler handler){
		mHandler=handler;
		mIndex=index;
	}
	//供外部函数调用，来停止本形成的运行
	public void over(){
		//成员变量mIsStop在此处和 run的while都有使用，理论上需要使用同步或者锁保证数据的同步，
		// 因此用多次赋值方式作为临时替代方案。
		mIsStop=true;
		mIsStop=true;
		interrupt();
		mIsStop=true;
		mIsStop=true;		
	}
	
	public void run(){
		//向主界面发送线程开始计数的消息
		//............
		Message msg;
		msg=Message.obtain();
		//msg=new Message();
		msg.what=HandlerMainActivity.THREAD_MEG_WHAR_BEGIN;
		msg.arg1=mIndex;
		mHandler.sendMessage(msg);
		mCount=0;
		while(!mIsStop && !isInterrupted()){			
			try {
				if(mCount<1){
					Thread.sleep(3000);
				}else{
					Thread.sleep(1000);					
				}
				mCount++;
				//向主界面发送计数消息
				msg=Message.obtain();
				//msg=new Message();
				msg.what=HandlerMainActivity.THREAD_MEG_WHAR_COUNT;
				msg.arg1=mIndex;
				msg.arg2=mCount;
				mHandler.sendMessage(msg);
				//............
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//中断请求，是合法的异常；
				// 收到这个请求时，退出Run				
				break;
			}
		}		
		//向主界面发送线程结束的消息
		msg=Message.obtain();
		//msg=new Message();
		msg.what=HandlerMainActivity.THREAD_MEG_WHAR_END;
		msg.arg1=mIndex;
		mHandler.sendMessage(msg);		
	}

}
