package ch07.exercises;

public class Ex25 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        System.out.println("Inner class's iv: " + i.iv);

        Outer.InnerStatic is = new Outer.InnerStatic();
        System.out.println("Static Inner class's iv: " + is.iv);
    }
}

class Outer {
    class Inner {
        int iv = 100;
    }

    static class InnerStatic {
        int iv = 200;
    }
}
