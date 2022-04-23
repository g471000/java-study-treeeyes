package ch07;


import java.awt.*;
import java.awt.event.*;

public class InnerEx7 {

    public static void main(String[] args) {
        Button b = new Button("start");
        b.addActionListener(new EventHandler());
    }
}

class EventHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent Performed!");
    }
}
