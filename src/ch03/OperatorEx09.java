package ch03;

public class OperatorEx09 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000;
        long b = 1_000_000 * 1_000_000L;

        // overflow
        System.out.println("a = " + a);

        // Used long to avoid overflow
        System.out.println("b = " + b);
    }
}
