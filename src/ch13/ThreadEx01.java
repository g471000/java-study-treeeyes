package ch13;

public class ThreadEx01 {
    public static void main(String[] args) {
        Thread00 t00 = new Thread00();

        Runnable r = new Thread1();
        Thread t1 = new Thread(r);

        t00.start();
        t1.start();
    }
}

class Thread00 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());
        }
    }
}

class Thread01 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}