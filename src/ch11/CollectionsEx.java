package ch11;

import java.util.*;

import static java.util.Collections.*;


public class CollectionsEx {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1, 2, 3, 4, 5);
        System.out.println("addAll: " + list);

        rotate(list, 2);
        System.out.println("rotate(list, 2): " + list);

        swap(list, 0, 2);
        System.out.println("swap(list, 0, 2): " + list);

        shuffle(list);
        System.out.println("shuffle: " + list);

        sort(list, reverseOrder());
        System.out.println("soft reverse: " + list);

        sort(list);
        System.out.println("sort: " + list);

        int idx = binarySearch(list, 3);
        System.out.println("index of 3 : " + idx);

        System.out.println("max : " + max(list));
        System.out.println("min : " + min(list));
        System.out.println("min(using reverse order): " + max(list, reverseOrder()));

        fill(list, 9);
        System.out.println("list with 9s: " + list);

        List newList = nCopies(list.size(), 2);
        System.out.println("newList = " + newList);

        System.out.println(disjoint(list, newList));

        copy(list, newList);
        System.out.println("newList After Copy = " + newList);
        System.out.println("list After Copy = " + list);

        replaceAll(list, 2, 1);
        System.out.println("list after replace all 2s to 1s: " + list);

        Enumeration e = enumeration(list);
        ArrayList list2 = list(e);

        System.out.println("list2 = " + list2);
    }
}
