package com.example.cheng.android.ThreadPool;

import android.support.annotation.NonNull;
import android.util.Log;

import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by cheng on 2018/6/25.
 */

public class ThreadPoolTest {
    private static ExecutorService singExecutorService= Executors.newSingleThreadExecutor();
    private  static  ExecutorService fixedThreadPool=Executors.newFixedThreadPool(5);
    private  static  ExecutorService cacheaThreadPool=Executors.newCachedThreadPool();

    private  static  myThreadPool executorService=new myThreadPool(5,10);

    public static void main(String[] args){
//        for (int i=0;i<10;i++){
//            cacheaThreadPool.execute(new Runnable() {
//                @Override
//                public void run() {
//                    gettime();
//                }
//            });
//        }

        for (int i = 0; i < 111; i++) {
//            executorService.execute(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName());
//                }
//            });
        }

    }

    public static void  gettime(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       System.out.println(Thread.currentThread().getName()+"==="+System.currentTimeMillis());
    }

    static  class  myThreadPool {
        private ThreadPoolExecutor ThreadPoolExecutor=null;
        public   myThreadPool(int corePoolSize ,int maxnumPoolSize){
            LinkedBlockingDeque<Runnable> workQueue=new LinkedBlockingDeque<>(100);
             final AtomicInteger mCount = new AtomicInteger(0);
            ThreadPoolExecutor=new ThreadPoolExecutor(corePoolSize, maxnumPoolSize,
                    60l, TimeUnit.SECONDS, workQueue, new ThreadFactory() {
                @Override
                public Thread newThread(@NonNull Runnable runnable) {
                    return new Thread(runnable, "Thread-" + mCount.incrementAndGet());
                }
            });


        }
    }
}

