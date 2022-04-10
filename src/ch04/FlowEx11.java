package ch04;

import java.util.Scanner;

public class FlowEx11 {
    public static void main(String[] args) {
        System.out.println("Enter your last 7 digits of your Registration Number: ");

        Scanner scan = new Scanner(System.in);
        String regNo = scan.nextLine();
        char gender = regNo.charAt(0);

        switch (gender) {
            case '1':
            case '3':
                switch (gender) {
                    case '1':
                        System.out.println("You are a male born before 2000.");
                        break;
                    case '3':
                        System.out.println("You are a male born after 2000.");
                        break;
                }
                break;
            case '2':
            case '4':
                switch (gender) {
                    case '2':
                        System.out.println("You are a female born before 2000.");
                        break;
                    case '3':
                        System.out.println("You are a male born after 2000");
                        break;
                }
                break;
            default:
                System.out.println("Not a valid registration number.");
        }
    }
}
