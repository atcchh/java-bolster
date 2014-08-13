package com.cango.guava.example.NotNull;

import com.google.common.base.Objects;
import com.google.common.base.Optional;
import org.junit.Test;

/**
 * Created by caoyanfei079 on 8/5/14.
 */
public class ObjectsTest {
    @Test
    public void should_be_return_true() {
        Objects.equal("a", "a"); // returns true
        Objects.equal(null, "a"); // returns false
        Objects.equal("a", null); // returns false
        Objects.equal(null, null); // returns true

    }

    @Test
    public void test_toString() {
// Returns "ClassName{x=1}"
        Objects.toStringHelper(this).add("x", 1).toString();
// Returns "MyObject{x=1}"
        Objects.toStringHelper("MyObject").add("x", 1).toString();
    }

//    @Test
//    public void test_compareTo() {
//        public int compareTo(Foo that) {
//            return ComparisonChain.start()
//                    .compare(this.aString, that.aString)
//                    .compare(this.anInt, that.anInt)
//                    .compare(this.anEnum, that.anEnum, OrderingTest.natural().nullsLast())
//                    .result();
//        }
//
//    }
}
