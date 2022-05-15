package ch13;

import javax.swing.*;

public class ThreadEx14 {
    public static void main(String[] args) {
        ThreadEx14_1 th1 = new ThreadEx14_1();
        th1.start();

        String input = JOptionPane.showInputDialog("Please enter anything: ");
        System.out.println("You entered: " + input);
        th1.interrupt();
        System.out.println("isInterrupted(): " + th1.isInterrupted());
    }

}

class ThreadEx14_1 extends Thread {
    public void run() {
        int i = 10;

        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                interrupt();
            }
        }
        System.out.println("End of count.");
    }
}
