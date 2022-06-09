package ch09.exercise;

public class Ex10 {
    public static void main(String[] args) {
        String str = "ABC";

        System.out.println(format(str, 7, 0));
        System.out.println(format(str, 7, 1));
        System.out.println(format(str, 7, 2));
        System.out.println(format(str, 1, 2));
    }

    static String format(String str, int length, int alignment) {

        int diff = length - str.length();
        if (diff < 0) {
            return str.substring(0, length);
        }

        char[] source = str.toCharArray();
        char[] result = new char[length];

        for (int i = 0; i < result.length; i++) {
            result[i] = ' ';
        }

        switch (alignment) {
            case 0:
            default:
                System.arraycopy(source, 0, result, 0, source.length);
                break;
            case 1:
                System.arraycopy(source, 0, result, diff/2, source.length);
                break;
            case 2:
                System.arraycopy(source, 0, result, diff, source.length);
                break;
        }
        return new String(result);
    }
}
