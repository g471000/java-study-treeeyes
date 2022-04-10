package ch04;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int level = 0;
        String name = "";

        System.out.print("Insert your level (1 - 100): ");
        Scanner scanner = new Scanner(System.in);
        level = scanner.nextInt();

        if(level < 16) {
            name = "파이리";
        } else if (level < 36) {
            name = "리자드";
        } else {
            name = "리자몽";
        }

        System.out.println("Your pokemon is " + name);
    }
}
