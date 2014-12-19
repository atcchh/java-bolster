package com.cango.test.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by caoyanfei079 on 10/31/14.
 */
@Service
public class CancelTask  {

    @Autowired
    private ThreadPoolExecutor executor;

    public CancelTask() {
        executor.execute(new Runnable() {
            @Override
            public void run() {

            }

            public boolean isContunie() {
                return !Thread.currentThread().isInterrupted();
            }
        });
    }

//    public class LongDivision{
        public static void main(String args[]){
            final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
            final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
            System.out.println(MICROS_PER_DAY/MILLIS_PER_DAY);
        }
//    }



}
