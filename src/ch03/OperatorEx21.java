package ch03;

public class OperatorEx21 {
    public static void main(String[] args) {
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double) f;

        System.out.printf("10 == 10.0f\t%b\n", 10 == 10.0f);
        System.out.printf("0.1 == 0.1f\t%b\n", 0.1 == 0.1f);
        System.out.printf("f = %19.17f\n", f);
        System.out.printf("d = %19.17f\n", d);
        System.out.printf("d2 = %19.17f\n", d2);
        System.out.printf("d == f\t%b\n", d == f);
        System.out.printf("d == d2\t%b\n", d == d2);
        System.out.printf("d2 == f\t%b\n", d2 == f);
        System.out.printf("(float)d == f\t%b\n", (float) d == f);
    }
}
