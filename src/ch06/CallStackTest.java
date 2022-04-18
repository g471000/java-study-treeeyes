package ch06;

public class CallStackTest {
    public static void main(String[] args) {
        System.out.println("main start!");
        firstMethod();
        System.out.println("main done!");
    }

    static void firstMethod() {
        System.out.println("first method start!");
        secondMethod();
        System.out.println("first method done!");
    }

    static void secondMethod() {
        System.out.println("second method start!");
        System.out.println("second method done!");
    }
}
