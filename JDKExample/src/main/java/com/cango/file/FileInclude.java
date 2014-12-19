package com.cango.file;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by caoyanfei079 on 12/19/14.
 */
public class FileInclude {
    final static String PRE_STRING = "<!--#include virtual=\"";
    final static String POST_STRING = "\"-->";

    public static void main(String[] args) {

        final String s = "parse   <!--#include virtual=\"../../about/content/lufax-logo.vm\"-->    <!--#include virtual=\"../../about/content/lufax-logo2.vm\"-->";
        StringBuffer result = new StringBuffer();
        for(int i = 0 ; i<= s.length() -PRE_STRING.length(); i++) {
            char c = s.charAt(i);
            if(c == '<' && PRE_STRING.equals(s.substring(i, i+PRE_STRING.length()))) {
                for(int j = i+PRE_STRING.length(); j<= s.length()-POST_STRING.length(); j++) {
                    String endString = s.substring(j, j+POST_STRING.length());
                    if(POST_STRING.equals(endString)) {
                        String fileName = s.substring(i+PRE_STRING.length(), j);
                        System.out.println(fileName);
                        result.append(s.substring(i,j+POST_STRING.length()));
                        result.append("[" + fileName + "]");
                        i=j+4;
                        break;
                    }
                }
            } else {
                result.append(c);
            }
        }

        System.out.println(result);

    }
}
