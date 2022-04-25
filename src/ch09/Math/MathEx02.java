package ch09.Math;

import static java.lang.Math.*;

public class MathEx02 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;

        System.out.println(i);
        System.out.println(-i);

        try {
            System.out.printf("negateExact(%d) = %d\n", 10, negateExact(10));
            System.out.printf("negateExact(%d) = %d\n", -10, negateExact(-10));
            System.out.printf("negateExact(%d) = %d\n", i, negateExact(i));
        } catch (ArithmeticException ae) {
            System.out.printf("negateExact(%d) = %d\n", (long)i, negateExact((long)i));
        }
    }
}
