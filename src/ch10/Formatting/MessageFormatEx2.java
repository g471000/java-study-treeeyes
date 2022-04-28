package ch10.Formatting;

import java.text.MessageFormat;

public class MessageFormatEx2 {
    public static void main(String[] args) {
        String tableName = "CUSTOMER_INFO";
        String msg = "INSERT INTO " + tableName + " VALUES (''{0}'', ''{1}'', ''{2}'', ''{3}'')";

        Object[][] arguments = {
                {"Pikachu", "02-123-1234", "27", "12-14"},
                {"Heize", "02-234-2345", "25", "08-09"}
        };

        for (int i = 0; i < arguments.length; i++) {
            System.out.println(MessageFormat.format(msg, arguments[i]));
        }
    }
}
