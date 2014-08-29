package com.cango.java.concurrent;

/**
 * Created by caoyanfei079 on 8/29/14.
 */
public class TestCase_2 {
    public static void main(String[] argu) {
        System.out.println("Start test");
        System.out.println("--------------------------------");
        System.out.println("测试两个线程 同时执行同一对象的不同方法");
        System.out.println("Synchronized public void printCountWithSynchronized()");
        System.out.println("Synchronized public void printCountWithSynchronized2()");
        System.out.println("期望相关的信息在相同线程中执行");
        final TestService testCase1 = new TestService();
        Thread t1 = new Thread(new ThreadWithTest(new ThreadWithTest.CallBack(){
            public void callback() {
                testCase1.printCountWithSynchronized2();
            }
        }));
        Thread t2 = new Thread(new ThreadWithTest(new ThreadWithTest.CallBack(){
            public void callback() {
                testCase1.printCountWithSynchronized();
            }
        }));
        t1.start();
        t2.start();

    }
}

