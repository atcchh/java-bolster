package com.cango.java.concurrent;

/**
 * Created by caoyanfei079 on 8/29/14.
 */
public class TestService {
    private static int count = 0;

    synchronized public void printCountWithSynchronized() {
        invoke("synchronized");
    }
    synchronized public void printCountWithSynchronized2() {
        invoke("synchronized2");
    }
    public void printCount() {
        invoke(" ");
    }
    synchronized static public void printCountWithStaticSynchronized() {
        invoke("static synchronized");
    }
    synchronized static public void printCountWithStaticSynchronized2() {
        invoke("static synchronized2");
    }
    public void printCountWithStaticSynchronized3() {
        synchronized(this.getClass()) {
            invoke("synchronized self class");
        }
    }
    static public void printCountWithStatic() {
        invoke("static");
    }

    private static void invoke(String methodName) {
        for( ; count < 10000; count++) {
            if(count%100 == 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(count >= 1100 && count <= 1200) {
                System.out.println(String.format("Thread[%32s][%5d] : %5d , time [%13d]",methodName, Thread.currentThread().getId() , count, System.currentTimeMillis()));
            }
        }
    }
}
