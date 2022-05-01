package ch11.Set;

import java.util.*;

public class HashSetEx2 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }

        System.out.println(set);

        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
