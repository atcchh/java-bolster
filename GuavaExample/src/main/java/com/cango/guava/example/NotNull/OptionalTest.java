package com.cango.guava.example.NotNull;

import com.google.common.base.Optional;
import org.junit.Test;
/**
 * Created by caoyanfei079 on 8/5/14.
 */
public class OptionalTest {
    @Test
    public void should_be_return_true() {
        Optional<Integer> test = Optional.of(5);
    }
}
