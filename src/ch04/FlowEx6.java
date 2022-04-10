package ch04;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.printf("Please enter the month (1-12): ");

        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();

        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("It's Spring!");
                break;
            case 6: case 7: case 8:
                System.out.println("It's Summer!");
                break;
            case 9: case 10: case 11:
                System.out.println("It's Fall :)");
                break;
            case 12: case 1: case 2:
                System.out.println("It's Winter <3");
                break;
            default:
                System.out.println("Wrong Input!");
        }
    }
}
