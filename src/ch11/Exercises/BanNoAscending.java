package ch11.Exercises;

import java.util.Comparator;

public class BanNoAscending implements Comparator {
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student05 && o2 instanceof Student05) {
            Student05 s1 = (Student05) o1;
            Student05 s2= (Student05) o2;

            int result = s1.numClass - s2.numClass;

            if (result == 0) {
                return s1.num - s2.num;
            }
            return result;
        }
        return -1;
    }
}
