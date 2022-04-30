package ch11.StackQueue;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {
    public static void main(String[] args) {
        int size = 5;
        ArrayList list = new ArrayList();
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * 10));
        }

        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
