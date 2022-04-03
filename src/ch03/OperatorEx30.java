package ch03;

public class OperatorEx30 {
    public static void main(String[] args) {
        int dec = 8;

        System.out.println("dec: " + dec);
        System.out.println(toBinaryString(dec >> 0));
        System.out.println(toBinaryString(dec >> 1));
        System.out.println(toBinaryString(dec >> 2));
        System.out.println(toBinaryString(dec << 0));
        System.out.println(toBinaryString(dec << 1));
        System.out.println(toBinaryString(dec << 2));
        System.out.println();

        dec = -8;
        System.out.println("dec: " + dec);
        System.out.println(toBinaryString(dec >> 0));
        System.out.println(toBinaryString(dec >> 1));
        System.out.println(toBinaryString(dec >> 2));
        System.out.println(toBinaryString(dec << 0));
        System.out.println(toBinaryString(dec << 1));
        System.out.println(toBinaryString(dec << 2));
        System.out.println();


        dec = 8;
        System.out.println("dec: " + dec);
        System.out.println(toBinaryString(dec >> 0));
        System.out.println(toBinaryString(dec >> 32));
    }

    static String toBinaryString(int x) {
        String zero = "000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length() - 32);
    }
}
