package ch10.Calendar;

import java.util.Calendar;

public class CalendarEx05 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        c.set(2015, 0, 31);
        CalendarUtils.print(c);
        c.roll(Calendar.MONTH, 1);
        CalendarUtils.print(c);
    }
}
