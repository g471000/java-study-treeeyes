package ch04;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int level = 0;
        String name = "";
        String opt = "";

        System.out.print("Please Enter Your Level: ");

        Scanner scan = new Scanner(System.in);
        level = scan.nextInt();

        System.out.printf("Your level is %d.\n", level);

        if (level < 16) {
            if (level <= 7) {
                opt = "베이비 ";
            }
            name = "파이리";
        } else if (level < 37) {
            if (level <= 23) {
                opt = "어린 ";
            }
            name = "리자드";
        } else {
            if (level > 48) {
                opt = "레전드 ";
            }
            name = "리자몽";
        }
        System.out.printf("Your Pokemon is %s%s!\n", opt, name);
    }
}
