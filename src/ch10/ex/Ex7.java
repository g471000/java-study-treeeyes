package ch10.ex;

import java.time.*;

import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;


public class Ex7 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2016, 12, 1);
        System.out.println(date.with(dayOfWeekInMonth(4, TUESDAY)));
    }
}
