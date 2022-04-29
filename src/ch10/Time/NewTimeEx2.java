package ch10.Time;

import java.time.*;

public class NewTimeEx2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 04, 29);
        LocalTime time = LocalTime.of(20, 28, 30);

        LocalDateTime dt = LocalDateTime.of(date, time);

        ZoneId seoulId = ZoneId.of("Asia/Seoul");
        ZonedDateTime zdt = dt.atZone(seoulId);

        ZonedDateTime seoulTime = ZonedDateTime.now();
        ZoneId nyId = ZoneId.of("America/New_York");
        ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);

        OffsetDateTime odt = zdt.toOffsetDateTime();

        System.out.println(dt);
        System.out.println(seoulId);
        System.out.println(zdt);
        System.out.println(seoulTime);

        System.out.println(nyId);
        System.out.println(nyTime);
        System.out.println(odt);
    }
}
