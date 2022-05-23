package ch13.lambda;

public class ThreadEx05 {
    static long startTime = 0;
    public static void main(String[] args) {
        Thread05One t = new Thread05One();
        t.start();
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("-"));
        }
        System.out.println();
        double time = System.currentTimeMillis() - ThreadEx05.startTime;
        System.out.printf("Time: " + time);
        System.out.println();
    }
}

class Thread05One extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("-"));
        }
        System.out.println();
        double time = System.currentTimeMillis() - ThreadEx05.startTime;
        System.out.printf("Time: " + time);
        System.out.println();
    }
}
