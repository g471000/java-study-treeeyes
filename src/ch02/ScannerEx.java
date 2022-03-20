package ch02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert 2 digit integer: ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("input: " + input);
        System.out.printf("num = %d%n", num);
    }
}
