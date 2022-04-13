package ch04;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number to calculate sum (0 for exit): ");

        while (flag) {
            System.out.print(">> ");

            String tmp = scan.nextLine();
            num = Integer.parseInt(tmp);

            if (num != 0) {
                sum += num;
            } else {
                flag = false;
            }
            System.out.println("Sum: " + sum);
        }
    }
}
