package ch11.Hash;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashUtil {
    public static String printBar(char ch, int value) {
        char[] bar = new char[value];

        for (int i = 0; i < bar.length; i++) {
            bar[i] = ch;
        }

        return new String(bar);
    }

    public static HashMap insertToMap(Object[] data) {
        HashMap map = new HashMap();
        for (int i = 0; i < data.length; i++) {
            if (map.containsKey(data[i])) {
                map.put(data[i], (int) map.get(data[i]) + 1);
            } else {
                map.put(data[i], 1);
            }
        }
        return map;
    }

    public static void printBarList(Iterator it) {
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            int key = (int) e.getKey();
            int value = (int) e.getValue();
            System.out.println(key + " : " + HashUtil.printBar('#', value) + " " + value);
        }
    }

}

class ValueComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
            Map.Entry e1 = (Map.Entry) o1;
            Map.Entry e2 = (Map.Entry) o2;

            int v1 = (int) e1.getValue();
            int v2 = (int) e2.getValue();
            return v2 - v1;
        }

        return -1;
    }
}
