package ch09.exercise;

import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex14 {
    public static void main(String[] args) {
        String[] phoneNumbers = {
                "012-3456-7890",
                "099-2456-7890",
                "088-2346-9870",
                "013-3456-7890",
        };

        Vector list = new Vector();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print(">>");
            String input = s.nextLine().trim();

            if (input.equals("")) {
                continue;
            } else if (input.equalsIgnoreCase("Q")) {
                System.exit(0);
            }

            String pattern = ".*" + input + ".*";
            Pattern p = Pattern.compile(pattern);

            for (int i = 0; i < phoneNumbers.length; i++) {
                String phoneNum = phoneNumbers[i];
                String tmp = phoneNum.replace("-", "");

                Matcher m = p.matcher(tmp);

                if (m.find()) {
                    list.add(phoneNum);
                }
            }

            if (list.size() > 0) {
                System.out.println(list);
                list.clear();
            } else {
                System.out.println("No Found");
            }
        }

    }
}
