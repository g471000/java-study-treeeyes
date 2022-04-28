package ch10.Formatting;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class DateFormatEx2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2005, 9, 3);

        Date day = cal.getTime();

        ArrayList<SimpleDateFormat> array = new ArrayList<>();
        array.add(new SimpleDateFormat("yyyy-MM-dd"));
        array.add(new SimpleDateFormat("yy-MM-dd E"));
        array.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"));
        array.add(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a"));

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).format(day));
        }
    }
}
