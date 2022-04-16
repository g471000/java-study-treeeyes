package ch04;

public class Ex13 {
    public static void main(String[] args) {
        String value = "12o34";
        char ch = ' ';
        boolean isNumber = true;
        for (int i = 0; i < value.length(); i++) {
            ch = value.charAt(i);
            if (!('0' <= ch && ch <= '9')) {
                isNumber = false;
                break;
            }
        }
        if (isNumber) {
            System.out.println(value + " is a number.");
        } else {
            System.out.println(value + " is not a number.");
        }
    }
}
