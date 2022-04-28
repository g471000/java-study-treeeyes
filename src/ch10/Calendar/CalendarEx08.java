package ch10.Calendar;

public class CalendarEx08 {
    public static void main(String[] args) {
        String date1 = "202204";
        String date2 = "202101";

        int month1 = Integer.parseInt(date1.substring(0, 4)) * 12 + Integer.parseInt(date1.substring(4));
        int month2 = Integer.parseInt(date2.substring(0, 4)) * 12 + Integer.parseInt(date2.substring(4));

        System.out.printf("Month diff between %s and %s is: %d\n", date1, date2, Math.abs(month2 - month1));
    }
}
