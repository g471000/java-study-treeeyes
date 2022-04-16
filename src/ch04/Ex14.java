package ch04;

import java.util.Scanner;

class Ex14 {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;
        int count = 0;

        Scanner scan = new Scanner(System.in);

        do {
            count++;
            System.out.print("Insert Number (1 - 100):");
            input = scan.nextInt();
            if (answer > input) {
                System.out.println("Insert greater number.");
            } else if (answer < input) {
                System.out.println("Insert smaller number.");
            } else {
                System.out.println("Correct!");
                System.out.println("You tried " + count + " times.");
                break;
            }
        } while (true);
    }

}