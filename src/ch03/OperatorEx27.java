package ch03;

public class OperatorEx27 {
    public static void main(String[] args) {
        boolean b = true;
        char ch = 'C';

        System.out.printf("b = %b\n", b);
        System.out.printf("!b = %b\n", !b);
        System.out.printf("!!b = %b\n", !!b);
        System.out.printf("!!!b = %b\n", !!!b);
        System.out.println();

        System.out.printf("ch = %c\n", ch);
        System.out.println(ch < 'a' || ch > 'z');
        System.out.println(!('a' <= ch && ch <= 'z'));
        System.out.println('z' <= ch && ch <= 'z');
    }
}
