package ch10;

import java.util.Calendar;

public class CalendarEx02 {
    final static String[] DAY_OF_WEEK = {"", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    public static void main(String[] args) {

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        c1.set(2015, Calendar.AUGUST, 15);
        System.out.printf("Calendar 1 is: %s\n", toString(c1));
        System.out.printf("Today is: %s\n", toString(c2));

        long diff = (c2.getTimeInMillis() - c1.getTimeInMillis())/1000;
        System.out.println("Diff of second between two date: " + diff);
        System.out.println("Diff of days between two date: " + (diff / (24 * 60 * 60)));
    }

    public static String toString(Calendar date) {
        return String.format("%s-%s-%s, %s", date.get(Calendar.YEAR), date.get(Calendar.MONTH) + 1,
                date.get(Calendar.DATE), DAY_OF_WEEK[date.get(Calendar.DAY_OF_WEEK)]);

    }
}
