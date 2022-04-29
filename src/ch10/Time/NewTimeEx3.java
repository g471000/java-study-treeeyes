package ch10.Time;

import java.time.*;
import java.time.temporal.*;
import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;

class DayAfterTomorrow implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(2, ChronoUnit.DAYS);
    }
}

public class NewTimeEx3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = today.with(new DayAfterTomorrow());

        System.out.println(today);
        System.out.println(date);
        System.out.println(today.with(firstDayOfNextMonth()));
        System.out.println(today.with(firstDayOfMonth()));
        System.out.println(today.with(lastDayOfMonth()));
        System.out.println(today.with(firstInMonth(TUESDAY)));
        System.out.println(today.with(lastInMonth(TUESDAY)));
        System.out.println(today.with(previous(TUESDAY)));
        System.out.println(today.with(previousOrSame(THURSDAY)));
        System.out.println(today.with(next(TUESDAY)));
        System.out.println(today.with(nextOrSame(TUESDAY)));
        System.out.println(today.with(dayOfWeekInMonth(4, TUESDAY)));
    }
}
