package charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created by caoyanfei079 on 2/10/15.
 */
public class Test {
    public static void main(String[] a) throws UnsupportedEncodingException {
        String hexString = "\\xC3\\xA7\\xC2\\xBD\\xC2\\x97\\xC3\\xA6\\xC2\\xB7\\xC2\\xB3\\xC3\\xA9\\xC2\\x9B\\xC2\\x85";
        CharsetUtils.printByAllCharsetConvert(Hex.hex2Str(hexString), Arrays.asList(CharsetUtils.COMMON_CHARSET));
    }
}
