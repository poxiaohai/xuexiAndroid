package com.example.cheng.android.Thread;

/**
 * Created by cheng on 2018/5/11.
 */

public class TestRunnable implements Runnable {
    @Override
    public void run() {
        System.out.print("hello word !");
    }
    public  static  void  main(String[] args){
        TestRunnable mTestRunnable=new TestRunnable();
       Thread mThread=new Thread(mTestRunnable);
       mThread.start();
    }

}
