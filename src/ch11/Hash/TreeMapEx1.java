package ch11.Hash;

import java.util.*;

public class TreeMapEx1 {
    public static void main(String[] args) {
        Integer[] data = {1, 2, 1, 2, 3, 2, 1, 2, 2, 2, 4, 3};

        HashMap map = HashUtil.insertToMap(data);

        System.out.println("== basic sorting ==");
        HashUtil.printBarList(map.entrySet().iterator());
        System.out.println();

        List list = new ArrayList(map.entrySet());
        Collections.sort(list, new ValueComparator());

        System.out.println("== sort with value order by value desc ==");
        HashUtil.printBarList(list.iterator());

    }
}
