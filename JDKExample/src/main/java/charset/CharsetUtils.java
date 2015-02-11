package charset;

import org.apache.commons.lang.CharSet;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;

/**
 * Created by caoyanfei079 on 2/11/15.
 */
public class CharsetUtils {

    public static final String[] COMMON_CHARSET = new String[]{"UTF-8","UTF-16","iso-8859-1","iso-8859-2","iso-8859-3","iso-8859-4","GBK","GB2312","Big5","UTF-32"};


    public static void printAllCharset() {
        SortedMap<String,Charset> charMaps =  Charset.availableCharsets();
        for(String key : charMaps.keySet()) {
            System.out.println("[" + key + "] --> [" + charMaps.get(key) + "]");
        }
    }

    public static List<String> getAllCharsetName() {
        return new ArrayList<String>(Charset.availableCharsets().keySet());
    }

    public static void printByAllCharset(byte[] bytes)  {
        for(String charset : getAllCharsetName()) {
            try {
                System.out.printf("%-20s : %s\n", charset, new String(bytes, charset));
            } catch (Exception e) {
                System.out.printf("%-20s : %s\n", charset, "don't support");
            }
        }
    }

    public static void printByAllCharsetConvert(String s)  {
        printByAllCharsetConvert(s,getAllCharsetName());
    }
    public static void printByAllCharsetConvert(String s, List<String> charsets) {
        for(String sourceCharset : charsets) {
            try {
                byte[] sourceBytes = s.getBytes(sourceCharset);
                for(String targetCharset : charsets) {
                    try {
                        String targetString = new String(sourceBytes,targetCharset);
                        System.out.printf("%s(%s)------>%s(%s)\n", s, sourceCharset,targetString,targetCharset);
                    } catch (Exception e) {
                        System.out.printf("target don't support " + targetCharset);
                    }
                }
            } catch (Exception e) {
                System.out.printf("source don't support " + sourceCharset);
            }
        }
    }



}
