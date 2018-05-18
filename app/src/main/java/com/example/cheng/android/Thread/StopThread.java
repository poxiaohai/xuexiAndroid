package com.example.cheng.android.Thread;

import com.socks.library.KLog;

import java.util.concurrent.TimeUnit;

/**
 * Created by cheng on 2018/5/18.
 */

public class StopThread {

    public  static  void  main(String[] args) throws InterruptedException {
        MoonRunner moonRunner=new MoonRunner();
        Thread thread=new Thread(moonRunner,"moonRunner");
        thread.start();
        TimeUnit.MILLISECONDS.sleep(2);
        moonRunner.cancel();

    }
    public  static  class MoonRunner implements   Runnable{
        private  long i;
        private  volatile boolean on=true;
        @Override
        public void run() {
            while (on){
                i++;
                System.err.println(i+"");
            }
            System.err.println("this thread stop");
        }

        public  void cancel(){
            on=false;
        }
    }
}
