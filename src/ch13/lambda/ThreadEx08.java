package ch13.lambda;

public class ThreadEx08 {
    public static void main(String[] args) {
        ThreadEx08_1 t1 = new ThreadEx08_1();
        ThreadEx08_2 t2 = new ThreadEx08_2();

        t2.setPriority(7);

        System.out.println("Priority of Thread 1(-): " + t1.getPriority());
        System.out.println("Priority of Thread 2(|): " + t2.getPriority());
        t1.start();
        t2.start();
    }
}

class ThreadEx08_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
            for (int j = 0; j < 10_000_000; j++) {
            }
        }
    }
}

class ThreadEx08_2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
            for (int j = 0; j < 10_000_000; j++) {
            }
        }
    }
}
