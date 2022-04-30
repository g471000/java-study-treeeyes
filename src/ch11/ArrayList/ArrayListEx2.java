package ch11.ArrayList;

import java.util.*;

public class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10;
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int len = source.length();

        List list = new ArrayList(len / LIMIT + 10);

        for (int i = 0; i < len; i++) {
            if (i + LIMIT < len) {
                list.add(source.substring(i, i + LIMIT));
            } else {
                list.add(source.substring(i));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
