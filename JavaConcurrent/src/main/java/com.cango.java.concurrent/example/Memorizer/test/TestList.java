package com.cango.java.concurrent.example.Memorizer.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
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
        new AddItemThread().start();
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
    static class AddItemThread extends Thread {
        @Override
        public void run() {
            for(int i = 0; i < 100; i++) {
                list.add(i + "");
            }
        }

    }

}

