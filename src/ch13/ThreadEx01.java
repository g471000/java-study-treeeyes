package ch13;

public class ThreadEx01 {
    public static void main(String[] args) {
        Thread0 t0 = new Thread0();

        Runnable r = new Thread1();
        Thread t1 = new Thread(r);

        t0.start();
        t1.start();
    }
}

class Thread0 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());
        }
    }
}

class Thread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}