package ch10.ex;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex6 {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1989, 12, 14);
        LocalDate now = LocalDate.now();

        long days = birthDay.until(now, ChronoUnit.DAYS);

        System.out.println("birth day = " + birthDay);
        System.out.println("today = " + now);
        System.out.println(days + " days");
    }
}
