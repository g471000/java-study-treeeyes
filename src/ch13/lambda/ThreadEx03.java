package ch13.lambda;

public class ThreadEx03 {
    public static void main(String[] args) {
        Thread03 t = new Thread03();
        t.run();
    }
}

class Thread03 extends Thread {
    public void run() {
        throwException();
    }

    public void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
