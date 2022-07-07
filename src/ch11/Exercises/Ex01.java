package ch11.Exercises;

import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList();
        ArrayList l2 = new ArrayList();
        ArrayList union = new ArrayList();
        ArrayList diff = new ArrayList();
        ArrayList sum = new ArrayList();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);

        union.addAll(l1);
        union.retainAll(l2);

        diff.addAll(l1);
        diff.removeAll(l2);

        sum.addAll(l1);
        sum.removeAll(l2);
        sum.addAll(l2);

        System.out.println("list1 = " + l1);
        System.out.println("list2 = " + l2);
        System.out.println("union = " + union);
        System.out.println("diff = " + diff);
        System.out.println("sum = " + sum);
    }
}
