package ch10;

import java.util.Calendar;

public class CalendarEx05 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        c.set(2015, 0, 31);
        CaldendarUtils.print(c);
        c.roll(Calendar.MONTH, 1);
        CaldendarUtils.print(c);
    }
}
