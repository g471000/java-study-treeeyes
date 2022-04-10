package ch04;

public class FlowEx13 {
    public static void main(String[] args) {
        int sum = 0;
        int start = 0, end = 10;

        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.printf("sum from %d to %d is %2d\n", start, end, sum);
    }
}
