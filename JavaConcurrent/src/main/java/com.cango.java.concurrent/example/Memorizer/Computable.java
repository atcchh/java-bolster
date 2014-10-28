package com.cango.java.concurrent.example.Memorizer;

/**
 * Created by caoyanfei079 on 10/24/14.
 */
public interface Computable<A, V> {
    V compute(A arg) throws InterruptedException;
}

