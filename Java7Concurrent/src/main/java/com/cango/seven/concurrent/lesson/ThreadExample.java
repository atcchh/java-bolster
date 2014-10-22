package com.cango.seven.concurrent.lesson;

/**
 * Created by caoyanfei079 on 9/25/14.
 */
public class ThreadExample {

}

// 介绍
//1 线程的创建和运行
class Thread1_1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 1 run!");
    }
}

class Thread1_2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread 2 run!");
    }
}

//2 获取和设置线程信息
class Thread2_1 extends Thread{
    public Thread2_1() {
        this.setName("Thread2_1");
        this.setPriority(Thread.MAX_PRIORITY);
    }
    @Override
    public void run() {
        System.out.println("Thread 2_1 run!");
    }
}
//3 线程的中断
//操作线程的中断机制
//线程的睡眠和恢复
//等待线程的终结
//守护线程的创建和运行
//处理线程的不受控制异常
//使用本地线程变量
//线程组
//处理线程组内的不受控制异常
//用线程工厂创建线程

