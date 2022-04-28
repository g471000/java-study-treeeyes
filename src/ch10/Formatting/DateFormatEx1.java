package ch10.Formatting;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DateFormatEx1 {
    public static void main(String[] args) {
        Date today = new Date();

        ArrayList<SimpleDateFormat> array = new ArrayList<SimpleDateFormat>();


        array.add(new SimpleDateFormat("yyyy-MM-dd"));
        array.add(new SimpleDateFormat("''yy MMM dd E"));
        array.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"));
        array.add(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a"));

        array.add(new SimpleDateFormat("올해 D번째 날"));
        array.add(new SimpleDateFormat("이번달 d번째 날"));
        array.add(new SimpleDateFormat("올해 W번째 주"));
        array.add(new SimpleDateFormat("이번달 w번째 주"));
        array.add(new SimpleDateFormat("이번달 F번째 E요일"));

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).format(today));
        }
    }
}
