package ch13;

public class ThreadEx04 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("-"));
        }
        System.out.println();
        double time = System.currentTimeMillis() - startTime;
        System.out.println("Time: " + time);

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("-"));
        }
        System.out.println();
        time = System.currentTimeMillis() - startTime;
        System.out.println("Total Time: " + time);
    }
}
