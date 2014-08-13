package com.cango.guava.example.NotNull;

import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import org.junit.Test;

/**
 * Created by caoyanfei079 on 8/5/14.
 */
public class OrderingTest {
    @Test
    public void should_be_return_true() {
        Ordering<String> byLengthOrdering = new Ordering<String>() {
            public int compare(String left, String right) {
                return Ints.compare(left.length(), right.length());
            }
        };
//        Ordering<Foo> ordering = Ordering.natural().nullsFirst().onResultOf(new Function<Foo, String>() {
//            public String apply(Foo foo) {
//                return foo.sortedBy;
//            }
//        });
    }
}
