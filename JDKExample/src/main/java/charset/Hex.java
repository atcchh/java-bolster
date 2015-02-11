package charset;

import sun.misc;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;

/**
 * Created by caoyanfei079 on 2/10/15.
 */
public class Hex {
    public static String str2Hex(String str) throws UnsupportedEncodingException {
        String hexRaw = String.format("%x", new BigInteger(1, str.getBytes("UTF-8")));
        char[] hexRawArr = hexRaw.toCharArray();
        StringBuilder hexFmtStr = new StringBuilder();
        final String SEP = "\\x";
        for (int i = 0; i < hexRawArr.length; i++) {
            hexFmtStr.append(SEP).append(hexRawArr[i]).append(hexRawArr[++i]);
        }
        return hexFmtStr.toString();
    }

    public static String hex2Str(String str) throws UnsupportedEncodingException {
        String strArr[] = str.split("\\\\"); // 分割拿到形如 xE9 的16进制数据
        byte[] byteArr = new byte[strArr.length - 1];
        for (int i = 1; i < strArr.length; i++) {
            Integer hexInt = Integer.decode("0" + strArr[i]);
            byteArr[i - 1] = hexInt.byteValue();
        }

        return new String(byteArr, "UTF-8");
    }
    public static String hex2Str(String str, String charset) throws UnsupportedEncodingException {
        String strArr[] = str.split("\\\\"); // 分割拿到形如 xE9 的16进制数据
        byte[] byteArr = new byte[strArr.length - 1];
        for (int i = 1; i < strArr.length; i++) {
            Integer hexInt = Integer.decode("0" + strArr[i]);
            byteArr[i - 1] = hexInt.byteValue();
        }

        return new String(byteArr, charset);
    }

    public static byte[] hex2Byte(String str) throws UnsupportedEncodingException {
        String strArr[] = str.split("\\\\"); // 分割拿到形如 xE9 的16进制数据
        byte[] byteArr = new byte[strArr.length - 1];
        for (int i = 1; i < strArr.length; i++) {
            Integer hexInt = Integer.decode("0" + strArr[i]);
            byteArr[i - 1] = hexInt.byteValue();
        }

        return byteArr;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {

        System.out.println(str2Hex("中国1a23"));
        System.out.println(hex2Str(str2Hex("中国1a23")));
        System.out.println(hex2Str("\\xE9\\xBB\\x84\\xE8\\x8A\\xB1\\xE6\\xA2\\xA8\\xE5\\xAE\\xB6\\xE5\\x85\\xB7\\xE8\\xBD\\xAC\\xE8\\xAE\\xA9"));
        System.out.println(hex2Str("\\xC3\\xA7\\xC2\\xBD\\xC2\\x97\\xC3\\xA6\\xC2\\xB7\\xC2\\xB3\\xC3\\xA9\\xC2\\x9B\\xC2\\x85"));//user-app nginx
//                                   "\\xc3\\xa7\\xc2\\xbd\\xc2\\x97\\xc3\\xa6\\xc2\\xb7\\xc2\\xb3\\xc3\\xa9\\xc2\\x9b\\xc2\\x85"
//                                        \xe7      \xbd      \x97      \xe6      \xb7      \xb3      \xe9      \x9b      \x85
        System.out.println(hex2Str("\\xe7\\xbd\\x97\\xe6\\xb7\\xb3\\xe9\\x9b\\x85")); // 罗淳雅 hex
        System.out.println(hex2Str("\\xa7\\xbd\\x97\\xe6\\xb7\\xb3\\xa9\\x9b\\x85")); // 罗淳雅 hex
        System.out.println(str2Hex("%E7%BD%97%E6%B7%B3%E9%9B%85"));  // h5-web nginx
        System.out.println(hex2Str("%A7%BD%97%E6%B7%B3%A9%9B%85"));  // h5-web nginxSystem.out.println()
        System.out.println(str2Hex("罗淳雅"));

        System.out.println(URLEncoder.encode("罗淳雅","iso-8859-1"));


        String ss = "罗淳雅";
        byte[] bytes = ss.getBytes("UTF-8");
        String sss = new String(bytes,"iso-8859-1");
        System.out.println(str2Hex(sss));
        System.out.println(str2Hex(sss));
        System.out.println(str2Hex(sss));
        System.out.println(str2Hex(sss));
        System.out.println("-------------------");
        System.out.println(new String(hex2Byte("\\xc3\\xa7\\xc2\\xbd\\xc2\\x97\\xc3\\xa6\\xc2\\xb7\\xc2\\xb3\\xc3\\xa9\\xc2\\x9b\\xc2\\x85"),"UTF-8"));
    }
}
