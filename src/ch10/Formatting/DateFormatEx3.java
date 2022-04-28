package ch10.Formatting;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx3 {
    public static void main(String[] args) {
        DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat f2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d = f.parse("2022-04-28");
            System.out.println(f2.format(d));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
