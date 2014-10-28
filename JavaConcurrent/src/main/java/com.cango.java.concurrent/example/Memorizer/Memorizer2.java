package com.cango.java.concurrent.example.Memorizer;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by caoyanfei079 on 10/24/14.
 */
public class Memorizer2<A, V> implements Computable<A, V> {
    private final Map<A, V> cache = new ConcurrentHashMap<A, V>();
    private final Computable<A, V> c;
    public Memorizer2(Computable<A, V> c) { this.c = c; }
    public V compute(A arg) throws InterruptedException {
        V result = cache.get(arg);
        if (result == null) {
            result = c.compute(arg);
            cache.put(arg, result);
        }
        return result;
    }
}

