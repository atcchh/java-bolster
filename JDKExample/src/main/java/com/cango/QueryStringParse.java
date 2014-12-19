package com.cango;

import java.net.URLDecoder;

/**
 * Created by caoyanfei079 on 11/25/14.
 */
public class QueryStringParse {
    public static void main(String[] argus) {
        String a ="a=b";
        String b = "a=b&b=a"; // a=b, b=a
        String c = "a=b&a=&a=a";// a= ['b',null,'a']
        String a1 = "a=%25";
    }
}
