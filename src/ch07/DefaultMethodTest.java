package ch07;

public class DefaultMethodTest {
    public static void main(String[] args) {
        Snack s = new Snack();
        s.method1();
        s.method2();
        FoodInterface.staticMethod();
        FoodInterface2.staticMethod();
    }
}

class Snack extends Food implements FoodInterface, FoodInterface2 {
    public void method1() {
        System.out.println("method1() in Snack");
    }
}

class Food {
    public void method2() {
        System.out.println("method2() in Food");
    }
}

interface FoodInterface {
    default void method1() {
        System.out.println("method1() in FoodInterface");
    }

    default void method2() {
        System.out.println("method2() in FoodInterface");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in FoodInterface");
    }
}

interface FoodInterface2 {
    default void method1() {
        System.out.println("method1() in FoodInterface2");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in FoodInterface2");
    }
}
