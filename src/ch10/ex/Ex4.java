package ch10.ex;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        String pattern2 = "입력하신 날짜는 E요일 입니다.";

        DateFormat df = new SimpleDateFormat(pattern);
        DateFormat df2 = new SimpleDateFormat(pattern2);

        Scanner s = new Scanner(System.in);

        Date inDate = null;

        do {
            System.out.println("Please enter date with this pattern: " + pattern);

            try {
                System.out.print(">> ");
                inDate = df.parse(s.nextLine());
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (true);

        System.out.println(df2.format(inDate));
    }
}
