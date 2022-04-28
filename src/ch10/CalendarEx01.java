package ch10;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalendarEx01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.printf("%s-%s\n", c.get(Calendar.YEAR), c.get(Calendar.MONTH));
        System.out.println("Week of the year: " + c.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Week of the month: " + c.get(Calendar.WEEK_OF_MONTH));
        System.out.println();

        System.out.println("Day of the year: " + c.get(Calendar.DAY_OF_YEAR));
        System.out.println("Day of the month: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of the month using date: " + c.get(Calendar.DATE));
        System.out.println();

        System.out.println("Day(1 ~ 7, 1:Sunday): " + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Day of week in month: " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println();

        System.out.println("AM(0) or PM(1): " + c.get(Calendar.AM_PM));
        System.out.println("Hour(0~11): " + c.get(Calendar.HOUR));
        System.out.println("Hour(0~23): " + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minutes(0~59): " + c.get(Calendar.MINUTE));
        System.out.println("Seconds(0~59): " + c.get(Calendar.SECOND));
        System.out.println("Millisecond(0~999): " + c.get(Calendar.MILLISECOND));
        System.out.println();

        System.out.println("TimeZone(-12~+12): " + c.get(Calendar.ZONE_OFFSET));
        System.out.println("Last day of this month: " + c.getActualMaximum(Calendar.DATE));
    }
}
