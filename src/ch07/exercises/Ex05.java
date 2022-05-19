package ch07.exercises;

public class Ex05 {
    public static void main(String[] args) {
        Tv tv = new Tv();
    }
}

class Product {
    int price; // 제품의 가격
    Tv t = new Tv();
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    Product() {
       // Have to create default constructor to let the Tv create empty constructor.
    }

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {
    Tv() {
    }

    public String toString() {
        return "Tv";
    }
}