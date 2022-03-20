package ch02;

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (int)ch;

        System.out.printf("%c = %d(%#X)%n", ch, code, code);

        char hch = '천';
        int hcode = (int)hch;
        System.out.printf("%c = %d(%#X)%n", hch, hcode, hcode);
    }
}
