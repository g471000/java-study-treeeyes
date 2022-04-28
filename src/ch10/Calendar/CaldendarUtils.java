package ch10.Calendar;

import java.util.Calendar;

public class CaldendarUtils {
    final static String[] DAY_OF_WEEK = {"", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

    public static String toString(Calendar date) {
        return String.format("%s-%s-%s, %s", date.get(Calendar.YEAR), date.get(Calendar.MONTH) + 1,
                date.get(Calendar.DATE), DAY_OF_WEEK[date.get(Calendar.DAY_OF_WEEK)]);
    }

    public static void print(Calendar date) {
        System.out.println(toString(date));
    }
}
