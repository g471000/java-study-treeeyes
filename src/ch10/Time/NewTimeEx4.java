package ch10.Time;

import java.time.*;

public class NewTimeEx4 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(1989, 12, 14);
        LocalDate date2 = LocalDate.now();

        Period pe = Period.between(date1, date2);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("pe = " + pe);
        System.out.println();

        System.out.println("YEAR = " + pe.getYears());
        System.out.println("MONTH = " + pe.getMonths());
        System.out.println("DAY = " + pe.getDays());
        System.out.println();

        LocalTime t1 = LocalTime.of(0, 0, 0);
        LocalTime t2 = LocalTime.of(12, 34, 56);

        Duration du = Duration.between(t1, t2);
        System.out.println("time1 = " + t1);
        System.out.println("time2 = " + t2);
        System.out.println("du = " + du);
        System.out.println();

        LocalTime tmpTime = LocalTime.of(0, 0).plusSeconds(du.getSeconds());

        System.out.println("HOUR = " + tmpTime.getHour());
        System.out.println("MINUTE = " + tmpTime.getMinute());
        System.out.println("SECOND = " + tmpTime.getSecond());
        System.out.println("NANO = " + tmpTime.getNano());

        tmpTime = tmpTime.plusNanos(234);
        System.out.println("NANO = " + tmpTime.getNano());
    }
}
