package ch13.lambda;

import javax.swing.*;

public class ThreadEx13 {
    public static void main(String[] args) {
        ThreadEx13_1 th1 = new ThreadEx13_1();
        th1.start();

        String input = JOptionPane.showInputDialog("Please enter anything.");
        System.out.println("You just entered: " + input);
        th1.interrupt();
        System.out.println("isInterrupted(): " + th1.isInterrupted());
    }
}

class ThreadEx13_1 extends Thread {
    public void run() {
        int i = 100;

        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);
            for (long x = 0; x < 2_500_000_000L; x++) {
                // delay time
            }
        }

        System.out.println("Count is finished.");
    }
}
