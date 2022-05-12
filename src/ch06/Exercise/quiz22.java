package ch06.Exercise;

public class quiz22 {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + " ? " + isNumber(str));
        str = "1234o";
        System.out.println(str + " ? " + isNumber(str));
    }

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (!isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}


