package ch04;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.print("Please Enter your last 7 digits of your registration Number: ");

        Scanner scan = new Scanner(System.in);
        String regNo = scan.nextLine();

        char gender = regNo.charAt(0);

        switch (gender) {
            case '1':
            case '3':
                System.out.println("You are a man.");
                break;
            case '2':
            case '4':
                System.out.println("You are a woman.");
                break;
            default:
                System.out.println("Not valid registration number.");

        }
    }
}
