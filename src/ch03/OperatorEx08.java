package ch03;

public class OperatorEx08 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a * b;

        // Overflow: expected 2,000,000,000,000, but printed negative number due to the overflow
        System.out.println(c);
    }
}
