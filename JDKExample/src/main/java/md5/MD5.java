package md5;

import org.apache.commons.lang.StringEscapeUtils;
//import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
//import org.springframework.util.StringUtils;

import java.security.MessageDigest;

/**
 * Created by caoyanfei079 on 11/14/14.
 */
public class MD5 {
    public static String salt = "a";
    public static void main(String[] argu)  throws Exception{
        MessageDigest mdInst = MessageDigest.getInstance("MD5");
        byte[] result = mdInst.digest((salt + "password").getBytes());

        System.out.println(digestToHex(result));
        String test = "data\\x80\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00P\\x00\\x00\\x00\\x00\\x00\\x00\\x00append";
        test = StringEscapeUtils.unescapeJava(test.replace("\\x", "\\u00"));
        System.out.println(test);
        System.out.println(digestToHex(mdInst.digest((salt + test).getBytes())));//
    }
    public static String digestToHex(byte[] digest) {
        StringBuffer buffer = new StringBuffer("");
        for (int i = 0; i < digest.length; i++) {
            String hexValue = Integer.toHexString(digest[i] & 0xFF);
            if (hexValue.length() == 1) {
                buffer.append(0);
            }
            buffer.append(hexValue);
        }
        return buffer.toString();
    }
}
