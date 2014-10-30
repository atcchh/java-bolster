package com.cango.ibatis;

import java.math.BigDecimal;

/**
 * Created by caoyanfei079 on 10/29/14.
 */
public class BigDecimalExercise {
    public static void main(String[] argus) {
        BigDecimal a = new BigDecimal(1);

        BigDecimal b = new BigDecimal("1.00");
        BigDecimal c = new BigDecimal("1");
        System.out.println("new BigDecimal(1)");
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");
        printBigDecimalInfo(a);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("new BigDecimal(\"1.00\")");
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");
        printBigDecimalInfo(b);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("new BigDecimal(\"1\")");
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");
        printBigDecimalInfo(c);
    }


    public static void printBigDecimalInfo(BigDecimal a) {
        System.out.printf("%-40s:%20s\n","BigDecimal",a);
        System.out.printf("%-40s:%20s\n","BigDecimal.toString()",a.toString());
        System.out.printf("%-40s:%20s\n","BigDecimal.scale()",a.scale());
        System.out.printf("%-40s:%20s\n","BigDecimal.signum()",a.signum());
        System.out.printf("%-40s:%20s\n","BigDecimal.unscaledValue()",a.unscaledValue());
        System.out.printf("%-40s:%20s\n","BigDecimal.toEngineeringString()",a.toEngineeringString());
        System.out.printf("%-40s:%20s\n","BigDecimal.toPlainString()",a.toPlainString());
    }
}
