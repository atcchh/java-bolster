package puzzle;

/**
 * Created by caoyanfei079 on 10/31/14.
 */
public class LongDivision {
    public static void main(String args[]){
        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
        System.out.printf("%s/%s=%s", MICROS_PER_DAY,MILLIS_PER_DAY, MICROS_PER_DAY/MILLIS_PER_DAY);
    }

}