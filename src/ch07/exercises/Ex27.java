package ch07.exercises;

public class Ex27 {

    public static void main(String[] args) {
        Outer27 o = new Outer27();
        Outer27.Inner27 i = o.new Inner27();
        i.method1();
    }
}

class Outer27 {
    int value = 10;

    class Inner27 {
        int value = 20;

        void method1() {
            int value = 30;

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer27.this.value);
        }
    }
}
