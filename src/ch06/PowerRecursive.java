package ch06;

public class PowerRecursive {
    public static void main(String[] args) {
       int x = 2;
       int n = 5;
       long result = 0;

        for (int i = 1; i <= n; i++) {
            long tmp = power(2, i);
            result += tmp;
            System.out.printf("power(%d, %d): %d\n", x, i, tmp);
        }
        System.out.println("sum = " + result);
    }

    static long power(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * power(x, n - 1);
    }
}
