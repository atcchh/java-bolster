package com.cango.java.concurrent.example.Memorizer;

import java.math.BigInteger;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by caoyanfei079 on 10/24/14.
 */
public class Main {
    private final static ExpensiveFunction a = new ExpensiveFunction();
    private final static Computable<String, BigInteger> cache = new Memorizer<String, BigInteger>(a);
    private final static BlockingQueue<String> queues = new LinkedBlockingDeque<String>();
    public static void main(String[] argu) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {

                        final String temp = queues.take();
                        System.out.println(Thread.currentThread() + ":" + cache.compute(temp));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {

                        final String temp = queues.take();
                        System.out.println(Thread.currentThread() + ":" + cache.compute(temp));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        t2.start();
        Random r = new Random();
        for(int i = 0; i < 10000; i++) {
            queues.put(r.nextInt(20) + "");
        }
    }

}
