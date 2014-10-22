package com.cango.spring.crypto;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;

/**
 * Created by caoyanfei079 on 10/22/14.
 */
public class BcryptTest {
    private static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
    public static void main(String[] argus) {

        String password = "myPassword";

        Long millSecond = runEncode(password, 1);
        System.out.println("encode 1 times  use " + millSecond + "");
        millSecond = runEncode(password, 10);
        System.out.println("encode 10 times  use " + millSecond + "");
//        millSecond = runEncode(password, 100);
//        System.out.println("encode 100 times  user " + millSecond + "");
        // test match spend time
        String result = encoder.encode("myPassword");
        millSecond = runMatch(password, result, 1);
        System.out.println("match 1 times use " + millSecond + "");
        millSecond = runMatch(password, result, 10);
        System.out.println("match 10 times use " + millSecond + "");
//        millSecond = runMatch(password, result, 100);
//        System.out.println("runt 100 times user " + millSecond + "");
    }

    public static Long runMatch(String password, String encodePassword, int times) {
        Long startTime = System.currentTimeMillis();
        for(int i =0; i < times; i++) {
            encoder.matches(password, encodePassword);
        }
        Long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
    public static Long runEncode(String password, int times) {
        Long startTime = System.currentTimeMillis();
        for(int i =0; i < times; i++) {
            encoder.encode("myPassword");
        }
        Long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
