package ch11.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx5 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setIntersection = new HashSet();
        HashSet setUnion = new HashSet();
        HashSet setDifference = new HashSet();

        for (int i = 1; i <= 5; i++) {
            setA.add(i);
        }
        System.out.println("setA: " + setA);

        for (int i = 4; i <= 8; i++) {
            setB.add(i);
        }
        System.out.println("setB: " + setB);

        Iterator it = setB.iterator();
        while (it.hasNext()) {
            Object tmp = it.next();
            if (setA.contains(tmp)) {
                setIntersection.add(tmp);
            }
        }
        System.out.println("setIntersection: " + setIntersection);

        it = setA.iterator();
        while (it.hasNext()) {
            Object tmp = it.next();
            if (!setB.contains(tmp)) {
                setDifference.add(tmp);
            }
        }
        System.out.println("setDifference: " + setDifference);

        it = setA.iterator();
        while (it.hasNext()) {
            setUnion.add(it.next());
        }

        it = setB.iterator();
        while (it.hasNext()) {
            setUnion.add(it.next());
        }
        System.out.println("setUnion: " + setUnion);

    }
}
