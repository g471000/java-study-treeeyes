package ch04;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("Insert Number: ");

        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        while (num != 0) {
            sum += num % 10;
            System.out.printf("sum = %3d num=%d\n", sum, num);

            num /= 10;
        }

        System.out.println("Sum of each digits: " + sum);
    }
}
