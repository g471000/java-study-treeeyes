package ch15.wrapperStreams;

import java.util.Date;

public class PrintStreamEx1 {
    public static void main(String[] args) {
        int i = 65;
        float f = 1234.56789f;

        Date d = new Date();

        System.out.printf("Character %c's code is %d\n", i, i);
        System.out.printf("%d is %o in oct, and %x in hex\n", i, i, i);
        System.out.printf("%3d%3d%3d\n", 100, 90, 80);
        System.out.printf("");
        System.out.printf("123456789012345678901234567890\n");
        System.out.printf("%s%-5s5s\n", "123", "123", "123");
        System.out.println();
        System.out.printf("%-8.1f%8.1f %e\n", f, f, f);
        System.out.println();
        System.out.printf("Today is %tm-%td-%tY.\n", d, d, d);
        System.out.printf("It is now %tH:%tM:%tS.\n", d, d, d);
        System.out.printf("It is now %1$tH:%1$tM:%1$tS.\n", d, d, d);
    }
}
