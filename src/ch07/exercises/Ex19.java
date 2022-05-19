package ch07.exercises;

import java.util.Arrays;

public class Ex19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new TV19());
        b.buy(new Computer19());
        b.buy(new TV19());
        b.buy(new Audio19());
        b.buy(new Computer19());
        b.buy(new Computer19());
        b.buy(new Computer19());
        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product19[] cart = new Product19[3];
    int index = 0;

    void buy(Product19 product) {
        if (product.price < money) {
            money -= product.price;
            add(product);
        }
    }

    void add(Product19 product) {
        if (isFull()) {
            expend();
        }
        cart[index++] = product;
        System.out.println("purchased " + product + ", index is now: " + index);
    }

    void summary() {
        System.out.println("--- summary ---");
        int total = 0;
        for (int i = 0; i < cart.length; i++) {
            System.out.printf("%s:%4d\n", cart[i], cart[i].price);
            total += cart[i].price;
        }
        System.out.println("Total: " + total);
        System.out.println("Money Left: " + money);
    }

    private void expend() {
        Product19[] newCart = new Product19[cart.length * 2];
        System.arraycopy(cart, 0, newCart, 0, cart.length);
        cart = newCart;
        System.out.println("after expend: " + Arrays.toString(cart));
    }

    boolean isFull() {
        return index == cart.length;
    }
}

class Product19 {
    int price;

    Product19(int price) {
        this.price = price;
    }
}

class TV19 extends Product19 {

    TV19() {
        this(100);
    }
    TV19(int price) {
        super(price);
    }

    public String toString() {
        return "TV";
    }
}

class Computer19 extends Product19 {

    Computer19() {
        this(200);
    }
    Computer19(int price) {
        super(price);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio19 extends Product19 {

    Audio19() {
        this(50);
    }
    Audio19(int price) {
        super(price);
    }

    public String toString() {
        return "Audio";
    }
}
