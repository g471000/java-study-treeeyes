package ch07.exercises;

public class Ex20 {
    public static void main(String[] args) {
        Parent20 p = new Child20();
        Child20 c = new Child20();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent20 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child20 extends Parent20 {
    int x = 200;

    void method() {
        System.out.println("Child Method");
    }
}
