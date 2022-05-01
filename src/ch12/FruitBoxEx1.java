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

class Toy {
    public String toString() {
        return "Toy";
    }
}

interface Eatable {
}

public class FruitBoxEx1 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Fruit> appleBox = new FruitBox<>();
        FruitBox<Fruit> graphBox = new FruitBox<>();
        Box<Toy> toyBox = new Box<>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Graph());

        appleBox.add(new Apple());
        appleBox.add(new Apple());

        graphBox.add(new Graph());

        toyBox.add(new Toy());

        System.out.println("fruitBox: " + fruitBox);
        System.out.println("appleBox: " + appleBox);
        System.out.println("graphBox: " + graphBox);
        System.out.println("toyBox: " + toyBox);
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

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}
