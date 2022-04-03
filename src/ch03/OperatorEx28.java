package ch03;

public class OperatorEx28 {
    public static void main(String[] args) {
        System.out.println("Integer with bit operators Exercise");
        int x = 0xAB;
        int y = 0xF;

        System.out.println(toBinaryString(x));
        System.out.println(toBinaryString(y));
        System.out.println(toBinaryString(x | y));
        System.out.println(toBinaryString(x & y));
        System.out.println(toBinaryString(x ^ y));
        System.out.println(toBinaryString(x ^ y ^ y));

        System.out.println("\nByte Exercise");
        byte p = 10;
        byte n = -10;

        System.out.println(toBinaryString(p));
        System.out.println(toBinaryString(~p));
        System.out.println(toBinaryString(~p + 1));
        System.out.println(toBinaryString(~~p));
        System.out.println();
        System.out.println(n);
        System.out.println(~(n - 1));
    }

    static String toBinaryString(int x) {
        String zero = "000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length() - 32);
    }
}
