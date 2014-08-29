package com.cango.java.concurrent;

/**
 * Created by caoyanfei079 on 8/29/14.
 */
public class ThreadWithTest implements Runnable{
    private CallBack callBack;

    public ThreadWithTest(CallBack callBack) {
        this.callBack = callBack;
    }

    @Override
    public void run() {
        Long threadNo = Thread.currentThread().getId();
        System.out.println("Thread[" + threadNo + "]  start");
        callBack.callback();
        System.out.println("Thread[" + threadNo + "]  end");

    }
    public static interface CallBack {

        public void callback();
    }
}
