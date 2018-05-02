package com.example.cheng.android.Thead;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.cheng.android.R;

public class Main2SubTheadActivity extends AppCompatActivity {
    //创建子线程
    class MyThread extends Thread{
        private Looper looper;//取出该子线程的Looper
        public void run() {

            Looper.prepare();//创建该子线程的Looper
            looper = Looper.myLooper();//取出该子线程的Looper
            Looper.loop();//只要调用了该方法才能不断循环取出消息
        }
    }

    private Handler mHandler2;//将mHandler指定轮询的Looper
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_sub_thead);
//        MyThread thread = new MyThread();
//        thread.start();//千万别忘记开启这个线程
        HandlerThread  thread=new HandlerThread("haha");
        thread.start();
        //下面是主线程发送消息
        mHandler2 = new Handler(thread.getLooper()){
            public void handleMessage(android.os.Message msg) {
                Log.e("========", (String) msg.obj);
            };
        };
        Message message=Message.obtain();
        message.what=1;
        message.obj="这是主线程向子线程发送消息";
        mHandler2.sendMessage(message);
    }
}
