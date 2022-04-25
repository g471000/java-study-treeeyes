package ch09.Math;

import static java.lang.Math.*;

public class MathEx03 {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 2, y2 = 2;

        double c = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
        double a = c * sin(PI / 4);
        double b = c * cos(PI / 4);

        System.out.printf("a = %f\n", a);
        System.out.printf("b = %f\n", b);
        System.out.printf("c = %f\n", c);

        System.out.printf("angle = %f rad\n", atan2(a, b));
        System.out.printf("angle = %f degree\n\n", atan2(a, b) * 180 / PI);

        System.out.println();
        System.out.println("log examples....");
        System.out.println(24 * log10(2));
        System.out.println(53 * log10(2));
    }
}
