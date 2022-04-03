package ch03;

public class OperatorEx7 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a * b);

        // Overflow: It is expected to print 300, but using byte, it will print 44 due to the overflow.
        System.out.println(c); // 44
    }
}
