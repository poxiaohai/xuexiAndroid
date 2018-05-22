package com.example.cheng.android.Thread;

import com.socks.library.KLog;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cheng on 2018/5/22.
 */

public class Alipay {
    private  double[] accounts;
    private Lock alipaylock;
    private Condition condition;
    public  Alipay( int n,double money){
        accounts=new double[n];
        alipaylock=new ReentrantLock();
        for (int i=0;i<accounts.length;i++){
            accounts[i]=money;
        }
    }
    public  void  transfer(int form,int amount){
        alipaylock.lock();
        try {
            while (accounts[form]<amount){
                KLog.e("wait");
            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            alipaylock.unlock();
        }
    }

}
