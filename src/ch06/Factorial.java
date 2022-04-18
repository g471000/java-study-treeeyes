package ch06;

public class Factorial {
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);

        // factorial second version
        int n = 21;
        long result2 = 0;
        for (int i = 1; i <= n; i++) {
            result2 = factorial2(i);

            if(result == -1){
                System.out.printf("Not Valid. (0 < n <= 20: %d\n", n);
                break;
            }

            System.out.printf("%2d! = %20d\n", i, result2);
        }
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static long factorial2(int n) {
        if(n <= 0 || n > 20) return -1;
        if(n <= 1) return 1;
        return n * factorial2(n - 1);
    }
}
