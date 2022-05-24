package ch13;

public class ThreadEx2 {
    public static void main(String[] args) {
        ThreadEx2_01 t1 = new ThreadEx2_01();
        t1.start();
    }
}

class ThreadEx2_01 extends Thread {
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
