package ch04;

public class FlowEx15 {
    public static void main(String[] args) {
        System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d \t %2d \t %2d \t %3d \t %2d \t %1d  \t %1d\n", i, 2 * i, 2 * i - 1, i * i, 11 - i, i % 3, i / 3);
        }
    }
}
