package ch11;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
    public static void main(String[] args) {
        String[] strArr = {"pikachu", "Raichu", "mew", "mewtwo", "charmander"};

        System.out.println("strArr = " + Arrays.toString(strArr));
        System.out.println();

        System.out.println("== After Sort ==");
        Arrays.sort(strArr);
        System.out.println("strArr = " + Arrays.toString(strArr));
        System.out.println();

        System.out.println("== After Sort with CASE_INSENSITIVE_ORDER ==");
        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println("strArr = " + Arrays.toString(strArr));
        System.out.println();

        System.out.println("== After Sort using Descending class ==");
        Arrays.sort(strArr, new Descending());
        System.out.println("strArr = " + Arrays.toString(strArr));
        System.out.println();
    }
}

class Descending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1;
        }
        return -1;
    }
}
