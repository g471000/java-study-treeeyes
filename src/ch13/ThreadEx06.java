package ch13;

import javax.swing.*;

public class ThreadEx06 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Insert any value.");
        System.out.println("You entered " + input);

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
