package ch10.Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterEx2 {
    public static void main(String[] args) {
        LocalDate newYear = LocalDate.parse("2022-08-09", DateTimeFormatter.ISO_LOCAL_DATE);

        LocalDate date = LocalDate.parse("1989-12-14");
        LocalTime time = LocalTime.parse("23:59:59");
        LocalDateTime dateTime = LocalDateTime.parse("1989-12-14T23:59:59");

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime endOfYear = LocalDateTime.parse("2022-12-31 23:59:59", pattern);

        System.out.println(newYear);
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(endOfYear);
    }
}
