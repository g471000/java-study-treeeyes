package ch11.Set;

import java.util.HashSet;

public class HashSetEx3 {

    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("Jieun", 10));
        set.add(new Person("Jieun", 10));

        System.out.println(set);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person tmp = (Person) o;
            return name.equals(tmp.name) && age == tmp.age;
        }
        return false;
    }

    public int hashCode() {
        return (name + age).hashCode();
    }

    public String toString() {
        return name + ":" + age;
    }
}
