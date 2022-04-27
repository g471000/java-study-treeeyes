package ch09.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] argArr = null;

        while (true) {
            String prompt = ">> ";
            System.out.print(prompt);

            String input = s.nextLine();

            argArr = input.trim().split(" +");

            String command = argArr[0].trim().toLowerCase();

            if ("".equals(command)) {
                continue;
            }

            if (command.equals("q")) {
                System.exit(0);
            } else {
                for (int i = 0; i < argArr.length; i++) {
                    System.out.println(argArr[i]);
                }
            }
        }
    }
}
