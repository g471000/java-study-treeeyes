package ch10;

import java.util.Calendar;

public class CalendarEx03 {
    public static void main(String[] args) {
        final int[] TIME_UNIT = {3600, 60, 1};
        final String[] TIME_UNIT_NAME = {"Hour(s)", "Minute(s)", "Second(s)"};

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        c1.set(Calendar.HOUR_OF_DAY, 10);
        c1.set(Calendar.MINUTE, 20);
        c1.set(Calendar.SECOND, 30);

        c2.set(Calendar.HOUR_OF_DAY, 20);
        c2.set(Calendar.MINUTE, 30);
        c2.set(Calendar.SECOND, 10);

        System.out.printf("time1: %s:%s:%s\n", c1.get(Calendar.HOUR_OF_DAY), c1.get(Calendar.MINUTE), c1.get(Calendar.SECOND));
        System.out.printf("time2: %s:%s:%s\n", c2.get(Calendar.HOUR_OF_DAY), c2.get(Calendar.MINUTE), c2.get(Calendar.SECOND));

        long diff = Math.abs(c1.getTimeInMillis() - c2.getTimeInMillis()) / 1000;
        System.out.println("Difference in Seconds: " + diff);

        System.out.print("Changed to time: ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TIME_UNIT.length; i++) {
            sb.append(diff / TIME_UNIT[i] + " " + TIME_UNIT_NAME[i] + " ");
            diff %= TIME_UNIT[i];
        }
        System.out.println(sb);
    }
}
