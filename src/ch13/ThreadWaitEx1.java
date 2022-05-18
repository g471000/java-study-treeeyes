package ch13;

import java.util.ArrayList;

public class ThreadWaitEx1 {
    public static void main(String[] args) throws InterruptedException {
        Table table = new Table();

        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Customer(table, "dduckbokki"), "Customer1").start();
        new Thread(new Customer(table, "kimbob"), "Customer2").start();

        Thread.sleep(100);
        System.exit(0);
    }
}

class Customer implements Runnable {
    private Table table;
    private String food;

    Customer(Table table, String food) {
        this.table = table;
        this.food = food;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }

            String name = Thread.currentThread().getName();

            if (eatFood()) {
                System.out.println(name + " ate a " + food);
            } else {
                System.out.println(name + " failed to eat " + food);
            }
        }
    }

    boolean eatFood() {
        return table.remove(food);
    }
}

class Cook implements Runnable {
    private Table table;

    Cook(Table table) {
        this.table = table;
    }

    public void run() {
        while (true) {
            int index = (int) (Math.random() * table.dishNum());
            table.add(table.dishNames[index]);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Table {
    String[] dishNames = {"dduckbokki", "dduckbokki", "kimbob"};
    final int MAX_FOOD = 6;

    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) {
        if (dishes.size() >= MAX_FOOD) {
            return;
        }
        dishes.add(dish);
        System.out.println("Dishes: " + dishes.toString());
    }

    public boolean remove(String dishName) {
        synchronized (this) {
            for (int i = 0; i < dishes.size(); i++) {
                if (dishName.equals(dishes.get(i))) {
                    dishes.remove(i);
                    return true;
                }
            }
            return false;
        }
    }

    public int dishNum() {
        return dishNames.length;
    }
}