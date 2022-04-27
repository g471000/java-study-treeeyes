package ch09;

import java.math.BigInteger;

public class BigIntegerEx {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.printf("%d != %s\n", i, calFactorial(i));
        }
    }

    static String calFactorial(int n) {
        return factorial(BigInteger.valueOf(n)).toString();
    }

    static BigInteger factorial(BigInteger bigInteger) {
        if (bigInteger.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        }
        return bigInteger.multiply(factorial(bigInteger.subtract(BigInteger.ONE)));
    }
}
