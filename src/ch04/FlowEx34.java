package ch04;

import java.util.Scanner;

public class FlowEx34 {
    public static void main(String[] args) {
        int option = 0, num = 0;

        Scanner scan = new Scanner(System.in);

        outer:
        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("Please select option (1~3). (Exit: 0) > ");

            option = scan.nextInt();

            if (option == 0) {
                System.out.println("Exiting....");
                break;
            } else if (!(1 <= option && 3 >= option)) {
                System.out.println("Not valid option. Please try again.");
                continue;
            }

            for(;;) {
                System.out.print("Please enter number to calculate. (End Calculation: 0, Exit: 99) > ");
                num = scan.nextInt();

                if (num == 0) {
                    break;
                }
                if (num == 99) {
                    break outer;
                }

                switch (option) {
                    case 1:
                        System.out.println("result = " + num * num);
                        break;
                    case 2:
                        System.out.println("result = " + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result = " + Math.log(num));
                        break;
                }
            }
        }
    }
}
