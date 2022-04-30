package ch11.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(2000000);
        LinkedList ll = new LinkedList();

        System.out.println("== adding to back ==");
        System.out.println("ArrayList: " + addBack(al));
        System.out.println("LinkedList " + addBack(ll));
        System.out.println();

        System.out.println("== adding to middle ==");
        System.out.println("ArrayList: " + addMiddle(al));
        System.out.println("LinkedList " + addMiddle(ll));
        System.out.println();

        System.out.println("== remove from middle back ==");
        System.out.println("ArrayList: " + removeFromMiddle(al));
        System.out.println("LinkedList " + removeFromMiddle(ll));
        System.out.println();

        System.out.println("== remove from back ==");
        System.out.println("ArrayList: " + removeFromBack(al));
        System.out.println("LinkedList " + removeFromBack(ll));
        System.out.println();

    }

    public static long addBack(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i + "");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long addMiddle(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(500, i + "");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long removeFromBack(List list) {
        long start = System.currentTimeMillis();
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long removeFromMiddle(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.remove(500);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
