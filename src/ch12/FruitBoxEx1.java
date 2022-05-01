package ch12;

import java.util.ArrayList;

class Fruit implements Eatable {
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}

class Graph extends Fruit {
    public String toString() {
        return "Graph";
    }
}

interface Eatable {
}

class Juice {
    String name;

    Juice(String name) {
        this.name = name + " Juice";
    }

    public String toString() {
        return name;
    }
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        StringBuilder sb = new StringBuilder();
        for (Fruit f : box.getList()) {
            sb.append(f + " ");
        }
        return new Juice(sb.toString());
    }
}

public class FruitBoxEx1 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Fruit> appleBox = new FruitBox<>();
        FruitBox<Fruit> graphBox = new FruitBox<>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Graph());

        appleBox.add(new Apple());
        appleBox.add(new Apple());

        graphBox.add(new Graph());

        System.out.println("fruitBox: " + fruitBox);
        System.out.println("appleBox: " + appleBox);
        System.out.println("graphBox: " + graphBox);

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {
}

class Box<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    ArrayList<T> getList() {
        return list;
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}
