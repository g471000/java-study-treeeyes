package ch11.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorAndListIteratorEx1 {

    static int size = 5;
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * 10));
        }

        System.out.println("== Iterator==");
        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("== ListIterator ==");


        ListIterator lit = list.listIterator();
        System.out.println("next()...");
        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
        }
        System.out.println();

        System.out.println("previous()...");
        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
    }
}
