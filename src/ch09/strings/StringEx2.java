package ch09.strings;

public class StringEx2 {
    public static void main(String[] args) {
        char[] cArr = new char[0];
        String s = new String(cArr);

        System.out.println("cArr.length = " + cArr.length);
        System.out.println("@@@" + s + "@@@");

        String s2 = "";

        System.out.println(s == s2);
        System.out.println(s.equals(s2));
    }
}
