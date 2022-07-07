package ch11.Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ex05 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student05("Pika00", 1, 1, 100, 100, 100));
        list.add(new Student05("Pika01", 1, 2, 90, 70, 80));
        list.add(new Student05("Pika02", 1, 3, 80, 80, 90));
        list.add(new Student05("Pika03", 1, 4, 70, 90, 70));
        list.add(new Student05("Pika04", 1, 5, 60, 100, 80));

        Collections.sort(list);
        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

