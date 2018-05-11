package com.example.cheng.android.Thread;

/**
 * Created by cheng on 2018/5/11.
 */

public class TestThread extends Thread {
    @Override
    public void run() {
        System.out.print("hello  word !");
    }

    public  static  void  main(String[] args){
        Thread mthread=new TestThread();
        mthread.start();
    }
}
