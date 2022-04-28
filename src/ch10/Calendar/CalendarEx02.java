package ch10.Calendar;

import java.util.Calendar;

public class CalendarEx02 {

    public static void main(String[] args) {

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        c1.set(2015, Calendar.AUGUST, 15);
        System.out.printf("Calendar 1 is: %s\n", CalendarUtils.toString(c1));
        System.out.printf("Today is: %s\n", CalendarUtils.toString(c2));

        long diff = (c2.getTimeInMillis() - c1.getTimeInMillis())/1000;
        System.out.println("Diff of second between two date: " + diff);
        System.out.println("Diff of days between two date: " + (diff / (24 * 60 * 60)));
    }
}
