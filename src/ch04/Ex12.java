package ch04;

public class Ex12 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i += 3) {
            for (int j = 1; j <= 3; j++) {
                printMulti(i, j);
                printMulti(i + 1, j);
                printMulti(i + 2, j);
                System.out.println();
            }
            System.out.println();
        }
    }

    static void printMulti(int x, int y) {
        if(x <= 9)
            System.out.printf("%d * %d = %d\t", x, y, x * y);
    }
}
