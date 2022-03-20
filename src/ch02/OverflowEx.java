package ch02;

public class OverflowEx {
    public static void main(String[] args) {
        short sMin = Short.MIN_VALUE;
        short sMax = Short.MAX_VALUE;
        char cMin = Character.MIN_VALUE;
        char cMax = Character.MAX_VALUE;

        System.out.println("sMin = " + sMin);
        System.out.println("xMin - 1 = " + (short) (sMin - 1));
        System.out.println("sMax = " + sMax);
        System.out.println("sMax + 1 = " + (short) (sMax + 1));
        System.out.println("cMin = " + (int) cMin);
        System.out.println("cMin - 1 = " + (int) --cMin);
        System.out.println("cMax = " + (int) cMax);
        System.out.println("cMax + 1 = " + (int) ++cMax);
    }
}
