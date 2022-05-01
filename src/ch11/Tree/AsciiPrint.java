package ch11.Tree;

public class AsciiPrint {
    public static void main(String[] args) {
        char ch = ' ';

        for (int i = 0; i < 95; i++) {
            System.out.print(ch++);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
