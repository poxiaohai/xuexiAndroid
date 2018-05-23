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
        condition=alipaylock.newCondition();
        for (int i=0;i<accounts.length;i++){
            accounts[i]=money;
        }
    }
    public  void  transfer(int form,int to,int amount){
        alipaylock.lock();
        try {
            while (accounts[form]<amount){
              condition.await();//阻塞
            }
            accounts[form]=accounts[form]-amount;
            accounts[to]=accounts[to]+amount;
            condition.signalAll();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            alipaylock.unlock();
        }
    }

}
