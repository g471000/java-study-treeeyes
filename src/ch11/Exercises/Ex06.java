package ch11.Exercises;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex06 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet(new Comparator() {
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Student05 && o2 instanceof Student05) {
                    Student05 s1 = (Student05) o1;
                    Student05 s2 = (Student05) o2;

                    return (int) (s1.getAverage() - s2.getAverage());
                }
                return -1;
            }
        });
        set.add(new Student05("홍길동", 1, 1, 100, 100, 100));
        set.add(new Student05("남궁성", 1, 2, 90, 70, 80));
        set.add(new Student05("김자바", 1, 3, 80, 80, 90));
        set.add(new Student05("이자바", 1, 4, 70, 90, 70));
        set.add(new Student05("안자바", 1, 5, 60, 100, 80));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
        System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
        System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
        System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
    }

    static int getGroupCount(TreeSet treeSet, int from, int to) {
        Student05 s1 = new Student05("", 0, 0, from, from, from);
        Student05 s2 = new Student05("", 0, 0, to, to, to);

        return treeSet.subSet(s1, s2).size();
    }
}
