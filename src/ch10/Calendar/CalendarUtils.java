package ch10.Calendar;

import java.util.Calendar;

public class CalendarUtils {
    final static String[] DAY_OF_WEEK = {"", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

    final static int[] END_OF_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

    public static int dayDiff(int y1, int m1, int d1, int y2, int m2, int d2) {
        return convertDateToDay(y1, m1, d1) - convertDateToDay(y2, m2, d2);
    }

    public static int getDayOfWeek(int year, int month, int day) {
        return convertDateToDay(year, month, day) % 7 + 1;
    }

    public static String convertDayToDate(int day) {
        int year = 1;
        int month = 0;

        while (true) {
            int aYear = isLeapYear(year) ? 366 : 365;
            if (day > aYear) {
                day -= aYear;
                year++;
            } else {
                break;
            }
        }

        while (true) {
            int endDay = END_OF_MONTHS[month];
            if (isLeapYear(year) && month == 1) {
                endDay++;
            }
            if (day > endDay) {
                day -= endDay;
                month++;
            } else {
                break;
            }
        }

        return String.format("%d-%d-%d", year, month + 1, day);
    }

    public static int convertDateToDay(int year, int month, int day) {
        int numOfLeapYear = 0;

        for (int i = 1; i < year; i++) {
            if (isLeapYear(i)) {
                numOfLeapYear++;
            }
        }

        int numOfDaysToLastYear = (year - 1) * 365 + numOfLeapYear;
        int numOfDaysThisYear = 0;

        for (int i = 0; i < month - 1; i++) {
            numOfDaysThisYear += END_OF_MONTHS[i];
        }

        if (month > 2 && isLeapYear(year)) {
            numOfDaysThisYear++;
        }

        numOfDaysThisYear += day;

        return numOfDaysToLastYear + numOfDaysThisYear;
    }

    public static String toString(Calendar date) {
        return String.format("%s-%s-%s, %s", date.get(Calendar.YEAR), date.get(Calendar.MONTH) + 1,
                date.get(Calendar.DATE), DAY_OF_WEEK[date.get(Calendar.DAY_OF_WEEK)]);
    }

    public static void print(Calendar date) {
        System.out.println(toString(date));
    }
}
