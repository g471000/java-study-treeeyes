package ch13;

import javax.swing.*;

public class ThreadEx07 {
    public static void main(String[] args) {
        Thread07 t = new Thread07();
        t.start();

        String input = JOptionPane.showInputDialog("Insert any value.");
        System.out.println("You entered " + input);
    }
}

class Thread07 extends Thread {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}