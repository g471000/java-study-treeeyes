package ch10.ex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex2 {
    static int paycheckCount(Calendar from, Calendar to) {
        if (from == null || to == null) {
            return 0;
        }

        if (from.equals(to) && from.get(Calendar.DAY_OF_MONTH) == 21) {
            return 1;
        }

        int fromYear = from.get(Calendar.YEAR);
        int fromMonth = from.get(Calendar.MONTH);
        int fromDay = from.get(Calendar.DAY_OF_MONTH);

        int toYear = to.get(Calendar.YEAR);
        int toMonth = to.get(Calendar.MONTH);
        int toDay = to.get(Calendar.DAY_OF_MONTH);

        int monDiff = (toYear * 12 + toMonth) - (fromYear * 12 + fromMonth);

        if (monDiff < 0) {
            return 0;
        }

        if (fromDay <= 21 && toDay >= 21) {
            monDiff++;
        }

        if (fromDay > 21 && toDay < 21) {
            monDiff--;
        }

        return monDiff;
    }

    static void printResult(Calendar from, Calendar to) {
        Date fromDate = from.getTime();
        Date toDate = to.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + " : ");
        System.out.println(paycheckCount(from, to));
    }

    public static void main(String[] args) {
        Calendar from = Calendar.getInstance();
        Calendar to = Calendar.getInstance();

        from.set(2010, 0, 1);
        to.set(2010, 0, 1);
        printResult(from, to);

        from.set(2010, 0, 21);
        to.set(2010, 0, 21);
        printResult(from, to);

        from.set(2010, 0, 1);
        to.set(2010, 2, 1);
        printResult(from, to);

        from.set(2010, 0, 1);
        to.set(2010, 2, 23);
        printResult(from, to);

        from.set(2010, 0, 23);
        to.set(2010, 2, 21);
        printResult(from, to);

        from.set(2011, 0, 22);
        to.set(2010, 2, 21);
        printResult(from, to);
    }
}
