package com.cango.file;

import java.io.*;

/**
 * Created by caoyanfei079 on 12/17/14.
 */
public class FiltUtils {
    public static void main(String[] argu) {

//
//        new ByteArrayInputStream(Thread.currentThread().getContextClassLoader().getResourceAsStream("")).
    }
    public static String inputStream2String(InputStream is)   throws   IOException{
        ByteArrayOutputStream   baos   =   new   ByteArrayOutputStream();
        int   i=-1;
        while((i=is.read())!=-1){
            baos.write(i);
        }
        return   baos.toString();
    }
}
