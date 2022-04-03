package ch03;

public class OperatorEx24 {
    public static void main(String[] args) {
        int x = 15;
        char ch = ' ';

        System.out.println(10 < x && x < 20);

        x = 6;
        System.out.println(x % 2 == 0 || x % 3 == 0 && x % 6 != 0);
        System.out.println((x % 2 == 0 || x % 3 == 0) && x % 6 != 0);

        ch = '1';
        System.out.println('0' < ch && ch <= '9');

        ch = 'a';
        System.out.println('a' <= ch && ch <= 'z');

        ch = 'A';
        System.out.println('A' <= ch && ch <= 'Z');

        ch = 'q';
        System.out.println(ch == 'q' || ch == 'Q');
    }
}
