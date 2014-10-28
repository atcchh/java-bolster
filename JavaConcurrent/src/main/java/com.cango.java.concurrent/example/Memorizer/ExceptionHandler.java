package com.cango.java.concurrent.example.Memorizer;

/**
 * Created by caoyanfei079 on 10/24/14.
 */
public class ExceptionHandler {
    public static RuntimeException launderThrowable(Throwable t) {
        if (t instanceof RuntimeException)
            return (RuntimeException) t;
        else if (t instanceof Error)
            throw (Error) t;
        else
            throw new IllegalStateException("Not unchecked", t);
    }

}
