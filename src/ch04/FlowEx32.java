package ch04;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("Please select the option (1~3). (Exit: 0) > ");

            int option = scanner.nextInt();

            if (option == 0) {
                System.out.println("Exit....");
                break;
            } else if (!(1 <= option && 3 >= option)) {
                System.out.println("Incorrect Input.");
                continue;
            } else {
                System.out.println("You selected: " + option);
            }
        }
    }
}
