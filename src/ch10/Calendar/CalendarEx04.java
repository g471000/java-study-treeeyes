package ch10.Calendar;

import java.util.Calendar;

public class CalendarEx04 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2015, 7, 31);

        CalendarUtils.print(c);
        System.out.println("= 1 day later =");
        c.add(Calendar.DATE, 1);
        CalendarUtils.print(c);

        System.out.println("= 6 months ago =");
        c.add(Calendar.MONTH, -6);
        CalendarUtils.print(c);

        System.out.println("= After 31 days(roll), no effect for other than date =");
        c.roll(Calendar.DATE, 31);
        CalendarUtils.print(c);

        System.out.println("= After 31 days(add) =");
        c.add(Calendar.DATE, 31);
        CalendarUtils.print(c);
    }
}
