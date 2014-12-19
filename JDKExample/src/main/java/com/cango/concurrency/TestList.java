package com.cango.concurrency;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caoyanfei079 on 11/18/14.
 */
public class TestList {
    private static List<String> list = new ArrayList<String>();
    public static void main(String[] argus) {
        list.add("t");
        list.add("e");
        list.add("s");
        list.add("t");
        new IteratorThread().start();
        try {
            Thread.sleep(1000 * 1);
        } catch (InterruptedException e) {
        }
        new AddItemThread2().start();
        try {
            Thread.sleep(1000 * 1);
        } catch (InterruptedException e) {
        }
        new IteratorThread().start();
    }
    static class IteratorThread extends Thread {

        @Override
        public void run() {
            for(String temp : list) {
                System.out.println(Thread.currentThread().getName() + " : " + temp);
                try {
                    Thread.sleep(1000 * 1);
                } catch (InterruptedException e) {
                }
            }
        }
    }
    static class AddItemThread1 extends Thread {
        @Override
        public void run() {
            List<String> result = new ArrayList<String>();
            result.add("1");
            result.add("2");
            result.add("3");
            result.add("4");
            list = result; // 如果修改list的对象就会有问题,如果使用引用，就可以避免相关的问题。
        }

    }
    static class AddItemThread2 extends Thread {
        @Override
        public void run() {
            list.add("1");
        }

    }

}

