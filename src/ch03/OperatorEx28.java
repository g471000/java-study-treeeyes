package ch03;

public class OperatorEx28 {
    public static void main(String[] args) {
        int x = 0xAB;
        int y = 0xF;

        System.out.println(toBinaryString(x));
        System.out.println(toBinaryString(y));
        System.out.println(toBinaryString(x | y));
        System.out.println(toBinaryString(x & y));
        System.out.println(toBinaryString(x ^ y));
        System.out.println(toBinaryString(x ^ y ^ y));
    }

    static String toBinaryString(int x) {
        String zero = "000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length() - 32);
    }
}
