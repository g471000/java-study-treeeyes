package ch10.Calendar;

public class CalendarEx09 {
    public static void main(String[] args) {
        System.out.println("2014. 5. 31: " + CalendarUtils.getDayOfWeek(2014, 5, 31));
        System.out.println("2012. 6. 1: " + CalendarUtils.getDayOfWeek(2012, 6, 1));
        System.out.println(CalendarUtils.dayDiff(2014, 5, 1, 2014, 4, 28));
        System.out.println(CalendarUtils.convertDateToDay(2015, 6, 29));
        System.out.println(CalendarUtils.convertDayToDate(735778));
    }
}
