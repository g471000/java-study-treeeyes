package ch09.exercise;

public class Ex9 {
    public static void main(String[] args) {
        System.out.println("(1!2@3#4$5)" + " -> " + delChar("(1!2@3#4$5)", "~!@#$%^&*()"));
        System.out.println("(1 2    3  4\t5)" + " -> " + delChar("(1 2    3  4\t5)", " \t"));
    }

    public static String delChar(String src, String delCh) {
        StringBuilder sb = new StringBuilder(src.length());

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);

            if (delCh.indexOf(ch) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
