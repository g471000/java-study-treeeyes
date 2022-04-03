package ch03;

import java.util.Scanner;

public class OperatorEx25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        System.out.print("Please enter a char: ");

        String input = scanner.nextLine();
        ch = input.charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.printf("You entered a digit");
        }

        if (ch >= 'A' && ch <= 'z') {
            System.out.println("You entered an alphabet.");
        }
    }
}
