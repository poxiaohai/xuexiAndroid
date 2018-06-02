
package com.example.cheng.android.Handler;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cheng.android.R;
import com.socks.library.KLog;

public class SubThreadActivity extends AppCompatActivity {
    private Handler handler1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_thread);
        Thread1 thread1=new Thread1();
        thread1.start();
        Thread2 thread2=new Thread2();
        thread2.start();
    }

    class Thread1 extends Thread{
        public Handler getHandler(){//注意哦，在run执行之前，返回的是null
            return handler1;
        }
        @Override
        public void run() {

            Looper.prepare();
            handler1 = new Handler(){
                public void handleMessage(android.os.Message msg) {
                    //这里处理消息
                    KLog.e("MThread", "收到消息了："+Thread.currentThread().getName()+"----"+msg.obj);
                };
            };
            Looper.loop();

        }
    }


    public class Thread2 extends Thread{

        @Override
        public void run() {

            for(int i=0; i<10; i++){
                Message msg = Message.obtain();
                msg.what = 1;
                msg.obj = System.currentTimeMillis()+"";
                handler1.sendMessage(msg);
                KLog.e("MThread", Thread.currentThread().getName()+"----发送了消息！"+msg.obj);
                SystemClock.sleep(1000);
            }

        }
    }
}
