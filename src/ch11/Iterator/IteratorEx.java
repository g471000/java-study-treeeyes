package ch11.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

    static int size = 10;
    public static void main(String[] args) {
        ArrayList original = new ArrayList(size);
        ArrayList copy1 = new ArrayList(size);
        ArrayList copy2 = new ArrayList(size
        );

        for (int i = 0; i < size; i++) {
            original.add(i);
        }

        Iterator it = original.iterator();
        while (it.hasNext()) {
            copy1.add(it.next());
        }

        System.out.println("== Copy from Original to Copy1 ==");
        System.out.println("original: " + original);
        System.out.println("copy1: " + copy1);
        System.out.println();

        it = original.iterator();
        while (it.hasNext()) {
            copy2.add(it.next());
            it.remove();
        }

        System.out.println("== Copy from Original to Copy2, and remove from origin usign iterator ==");
        System.out.println("original: " + original);
        System.out.println("copy2: " + copy2);
        System.out.println();
    }
}
