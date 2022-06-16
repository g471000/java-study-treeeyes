package ch10.ex;

import java.text.DecimalFormat;

public class Ex3 {
    public static void main(String[] args) {
        String data = "123,456,789.5";

        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#,####");

        try {
            Number num = df.parse(data);

            double d = num.doubleValue();
            System.out.println("data: " + data);
            System.out.println("round: " + Math.round(d));
            System.out.println("10,000th: " + df2.format(d));
        } catch (Exception e) {

        }
    }
}
