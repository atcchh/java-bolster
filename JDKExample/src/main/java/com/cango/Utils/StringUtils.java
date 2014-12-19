package com.cango.Utils;

/**
 * Created by caoyanfei079 on 12/19/14.
 */
public class StringUtils {
    public static String replace(final String s, final String preString, final String postString, Callback callback ) {
        StringBuffer result = new StringBuffer();
        for(int i = 0 ; i<= s.length() -preString.length(); i++) {
            char c = s.charAt(i);
            if(preString.equals(s.substring(i, i+preString.length()))) {
                for(int j = i+preString.length(); j<= s.length()-postString.length(); j++) {
                    String endString = s.substring(j, j + postString.length());
                    if(postString.equals(endString)) {
                        final String fileName = s.substring(i+preString.length(), j);

                        result.append(s.substring(i,j+postString.length()));
                        if(callback != null) {
                            result.append(callback.callback(fileName));
                        }
                        i=j+postString.length();
                        break;
                    }
                }
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static interface Callback {
        public String callback(String fileName);
    }

    public static void main(String[] a) {
        System.out.println(StringUtils.replace("parse   <!--#include virtual=\"../../about/content/lufax-logo.vm\"--> <!--#include virtual=\"../../about/content/lufax-logo2.vm\"-->", "<!--#include virtual=\"", "\"-->" , new Callback() {
            @Override
            public String callback(String fileName) {
//                System.out.println(fileName);
                return "11111111111111111111";
            }
        } ));
    }


}
