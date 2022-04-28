package ch10;

import java.util.Calendar;

public class CalendarEx06 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage :  java CalendarEx6 2015 9");
            return;
        }

        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);

        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        Calendar startDay = Calendar.getInstance();
        Calendar endDay = Calendar.getInstance();

        startDay.set(year, month - 1, 1);
        endDay.set(year, month, 1);

        endDay.add(Calendar.DATE, -1);

        START_DAY_OF_WEEK = startDay.get(Calendar.DAY_OF_WEEK);
        END_DAY = endDay.get(Calendar.DATE);

        System.out.printf("      %d - %d\n", year, month);
        System.out.println(" SU MO TU WE TH FR SA");

        for (int i = 1; i < START_DAY_OF_WEEK; i++) {
            System.out.print("   ");
        }

        for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
            System.out.print((i < 10) ? "  " + i : " " + i);
            if (n % 7 == 0) {
                System.out.println();
            }
        }
    }
}
