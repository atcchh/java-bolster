package com.cango.java.concurrent.example.Memorizer;

import java.math.BigInteger;

/**
 * Created by caoyanfei079 on 10/24/14.
 */
public class ExpensiveFunction implements Computable<String, BigInteger> {
    public BigInteger compute(String arg) {
        // after deep thought...
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new BigInteger(arg);
    }
}
