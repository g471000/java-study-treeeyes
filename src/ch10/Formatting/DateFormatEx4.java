package ch10.Formatting;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFormatEx4 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner s = new Scanner(System.in);

        Date inDate = null;

        System.out.printf("Please enter the date with the format(%s): ",pattern);
        while (s.hasNextLine()) {
            try {
                inDate = df.parse(s.nextLine());
                break;
            } catch (ParseException e) {
                System.out.printf("Please enter the date with the format(%s): ",pattern);
            }
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(inDate);
        Calendar today = Calendar.getInstance();
        long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 1000);
        System.out.println("There are " + day + " days difference between your input and today.");
    }
}
