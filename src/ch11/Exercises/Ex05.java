package ch11.Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ex05 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student05("Pika00", 1, 1, 100, 100, 100));
        list.add(new Student05("Pika01", 1, 2, 90, 70, 80));
        list.add(new Student05("Pika02", 1, 3, 80, 80, 90));
        list.add(new Student05("Pika03", 1, 4, 70, 90, 70));
        list.add(new Student05("Pika04", 1, 5, 60, 100, 80));

        Collections.sort(list);
        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

class Student05 implements Comparable {
    String name;
    int numClass;
    int num;
    int kor, eng, math;

    Student05(String name, int numClass, int num, int kor, int eng, int math) {
        this.name = name;
        this.numClass = numClass;
        this.num = num;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.1) / 10f;
    }

    public String toString() {
        return name + ", " + numClass + ", " + num + ", " + kor + ", " + eng + ", " + math;
    }

    public int compareTo(Object o) {
        if (o instanceof Student05) {
            Student05 tmp = (Student05) o;
            return name.compareTo(tmp.name);
        }
        return -1;
    }
}
