package ch11.Hash;

import java.util.*;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("pikachu", 100);
        map.put("raichu", 100);
        map.put("mew", 80);
        map.put("mewtwo", 90);

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("Name: " + e.getKey() + ", Score: " + e.getValue());
        }

        set = map.keySet();
        System.out.println("Participant List: " + set);

        Collection values = map.values();
        it = values.iterator();

        int total = 0;
        while (it.hasNext()) {
            total += (int) it.next();
        }

        System.out.println("Total: " + total);
        System.out.println("Average: " + total / set.size());
        System.out.println("Max score: " + Collections.max(values));
        System.out.println("Min score: " + Collections.min(values));

    }
}
