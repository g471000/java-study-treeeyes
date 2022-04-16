package ch05;

import java.util.Arrays;

public class ArrayEx14 {
    public static void main(String[] args) {
        String str = "ABCDE";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.printf("str.charAt(%d): %c\n", i, ch);
        }

        char[] chArr = str.toCharArray();
        System.out.println("char Array: " + Arrays.toString(chArr));
    }
}
