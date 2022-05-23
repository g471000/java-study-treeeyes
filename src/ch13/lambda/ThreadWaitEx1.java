package ch13.lambda;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWaitEx1 {
    public static void main(String[] args) throws InterruptedException {
        Table table = new Table();

        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Customer(table, "dduckbokki"), "Customer1").start();
        new Thread(new Customer(table, "kimbob"), "Customer2").start();

        Thread.sleep(2000);
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

            table.remove(food);
            System.out.println(name + " ate a " + food);
        }
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

    private ReentrantLock lock = new ReentrantLock();
    private Condition forCook = lock.newCondition();
    private Condition forCustomer = lock.newCondition();

    private ArrayList<String> dishes = new ArrayList<>();

    public void add(String dish) {
        lock.lock();
        try {
            while (dishes.size() >= MAX_FOOD) {
                String name = Thread.currentThread().getName();
                System.out.println(name + " is waiting...");
                try {
                    forCustomer.await();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }

            dishes.add(dish);
            forCustomer.signal();
            System.out.println("Dishes: " + dishes.toString());
        } finally {
            lock.unlock();
        }
    }

    public void remove(String dishName) {
        lock.lock();
        String name = Thread.currentThread().getName();

        try {
            while (dishes.size() == 0) {
                System.out.println(name + " is waiting.");
                try {
                    forCustomer.await();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }

            while (true) {
                for (int i = 0; i < dishes.size(); i++) {
                    dishes.remove(i);
                    forCook.signal();
                    return;
                }

                try {
                    System.out.println(name + " is waiting.");
                    forCustomer.await();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        } finally {
            lock.unlock();
        }
    }

    public int dishNum() {
        return dishNames.length;
    }
}