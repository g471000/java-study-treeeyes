package ch10.Formatting;

import java.text.MessageFormat;
import java.text.ParseException;

public class MessageFormatEx3 {
    public static void main(String[] args) throws ParseException {
        String[] data = {
                "INSERT INTO CUSTOMER_INFO VALUES ('Pikachu', '02-123-1234', '27', '12-14');",
                "INSERT INTO CUSTOMER_INFO VALUES ('Heize', '02-234-2345', '25', '08-09');"
        };

        String pattern = "INSERT INTO CUSTOMER_INFO VALUES ({0}, {1}, {2}, {3});";
        MessageFormat mf = new MessageFormat(pattern);

        for (int i = 0; i < data.length; i++) {
            Object[] objs = mf.parse(data[i]);
            for (int j = 0; j < objs.length; j++) {
                System.out.print(objs[j] + ",");
            }
            System.out.println();
        }
    }
}
