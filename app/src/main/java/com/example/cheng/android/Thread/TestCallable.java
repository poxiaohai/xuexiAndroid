package com.example.cheng.android.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;

/**
 * Created by cheng on 2018/5/11.
 */

public class TestCallable {
    public  static  class  myTestCallable implements Callable{

        @Override
        public Object call() throws Exception {
            return "hello  word !";
        }
    }

    public  static  void  main(String[] srgs){
        myTestCallable mMyTestCallable=new myTestCallable();
//        ExecutorCompletionService mExecutorCompletionService= Executors.newsingle
    }
}
