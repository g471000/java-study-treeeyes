package ch11.Iterator;

import java.util.Iterator;

public class MyNewVectorTest {
    public static void main(String[] args) {
        MyNewVector v = new MyNewVector();
        for (int i = 0; i < 5; i++) {
            v.add(i);
        }

        System.out.println("Before remove: " + v);
        Iterator it = v.iterator();

        it.next();
        it.remove();

        it.next();
        it.remove();

        System.out.println("After remove " + v);
    }
}
