package ch07.exercises;

public class Ex07 {
    public static void main(String[] args) {
        Child07 c = new Child07();
        System.out.println("x = " + c.getX());
        // Returns 200 which is parent's instance variable. It is because getX is implemented within the Parent
    }
}

class Parent07 {
    int x = 100;

    Parent07() {
        this(200);
    }

    Parent07(int x) {
        this.x = x;
    }

    int getX() {
        return x;
    }
}

class Child07 extends Parent07 {
    int x = 3000;

    Child07() {
        this(1000);
    }

    Child07(int x) {
        this.x = x;
    }
}


