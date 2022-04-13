package ch04;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int)(Math.random() * 100) + 1;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Please enter an integer(1 - 100): ");
            input = scan.nextInt();

            if (input > answer) {
                System.out.println("Please try with smaller number.");
            } else if (input < answer) {
                System.out.println("Please try with larger number.");
            }
        } while (input != answer);

        System.out.println("Correct! Answer is: " + answer);
    }
}
