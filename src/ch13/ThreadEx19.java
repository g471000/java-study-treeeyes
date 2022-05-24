package ch13;

public class ThreadEx19 {
    static long startTime = 0;
    static long endTime = 0;

    public static void main(String[] args) {
        ThreadEx19_1 t1 = new ThreadEx19_1();
        ThreadEx19_2 t2 = new ThreadEx19_2();
        t1.start();
        t2.start();
        startTime = System.currentTimeMillis();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {

        }

        endTime = System.currentTimeMillis();
        System.out.println();
        System.out.println("Time: " + (endTime - startTime));
    }
}

class ThreadEx19_1 extends Thread  {
    public void run() {
        for (int i = 0; i < 30000; i++) {
            System.out.print("-");
        }
    }
}

class ThreadEx19_2 extends Thread  {
    public void run() {
        for (int i = 0; i < 30000; i++) {
            System.out.print("|");
        }
    }
}
