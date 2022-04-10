package ch04;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        int input;

        System.out.println("Insert a number: ");

        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();

        if (input == 0) {
            System.out.println("You inserted 0.");
        } else {
            System.out.println("You inserted non 0 number.");
            System.out.printf("You inserted %d\n", input);
        }
    }
}
