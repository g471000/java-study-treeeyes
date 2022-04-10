package ch04;

import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args) {
        System.out.println("Select Rock(1), Sissor(2) or Paper(3)");

        Scanner scan = new Scanner(System.in);
        int user = scan.nextInt();
        int com = (int) (Math.random() * 3) + 1;

        System.out.println("You are " + user + ".");
        System.out.println("Computer is " + com + ".");

        switch (user - com) {
            case 2:
            case -1:
                System.out.println("You Lost!");
                break;
            case 1:
            case -2:
                System.out.println("You Won!");
                break;
            case 0:
                System.out.println("Tied!");
                break;
        }
    }
}
