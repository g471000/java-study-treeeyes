package ch10.Formatting;

import java.text.MessageFormat;

public class MessageFormatEx1 {
    public static void main(String[] args) {
        String msg = "Name: {0} \nTel: {1} \nAge: {2} \nBirthday: {3}";

        Object[] arguments = {
                "Pikachu", "02-123-1234", "27", "12-14"
        };

        String result = MessageFormat.format(msg, arguments);
        System.out.println(result);
    }
}
