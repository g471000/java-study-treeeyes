package ch08.exercises;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        int answer = (int)(Math.random() * 100) + 1;
        int input = 0;
        int count = 0;

        do {
            count++;
            System.out.print("Please enter 1 - 100: ");
            try {
                input = new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again. ");
                continue;
            }

            if (answer > input) {
                System.out.println("Please enter larger number.");
            } else if (answer < input) {
                System.out.println("Please enter smaller number.");
            } else {
                System.out.println("Correct!");
                System.out.printf("You tried %d times!\n", count);
            }
        } while (true);
    }
}
