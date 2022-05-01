package ch12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Fruit {
    String name;
    int weight;

    Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + "(" + weight + ")";
    }
}

class Apple extends Fruit {
    Apple(String name, int weight) {
        super(name, weight);
    }
}

class Graph extends Fruit {
    Graph(String name, int weight) {
        super(name, weight);
    }
}

class AppleComp implements Comparator<Apple> {
    @Override
    public int compare(Apple o1, Apple o2) {
        return o2.weight - o1.weight;
    }
}

class GraphComp implements Comparator<Graph> {
    @Override
    public int compare(Graph o1, Graph o2) {
        return o2.weight - o1.weight;
    }
}

class FruitComp implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
        return o1.weight - o2.weight;
    }
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
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Graph> graphBox = new FruitBox<>();

        fruitBox.add(new Apple("GreenApple", 300));
        fruitBox.add(new Graph("GreenGraph", 300));

        appleBox.add(new Apple("GreenApple", 300));
        appleBox.add(new Apple("GreenApple", 100));
        appleBox.add(new Apple("GreenApple", 200));

        graphBox.add(new Graph("GreenGraph", 400));
        graphBox.add(new Graph("GreenGraph", 300));
        graphBox.add(new Graph("GreenGraph", 200));

        System.out.println("fruitBox: " + fruitBox);
        System.out.println("appleBox: " + appleBox);
        System.out.println("graphBox: " + graphBox);

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
        System.out.println();

        Collections.sort(fruitBox.getList(), new FruitComp());
        Collections.sort(appleBox.getList(), new AppleComp());
        Collections.sort(graphBox.getList(), new GraphComp());
        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(graphBox);
        System.out.println();

        Collections.sort(appleBox.getList(), new FruitComp());
        Collections.sort(graphBox.getList(), new FruitComp());
        System.out.println(appleBox);
        System.out.println(graphBox);
        System.out.println();
    }
}

class FruitBox<T extends Fruit> extends Box<T> {
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
