package ch06;

public class MyMathTest2 {
    public static void main(String[] args) {
        long a = 200L;
        long b = 100L;
        System.out.println(MyMath2.add(a, b));
        System.out.println(MyMath2.subtract(a, b));
        System.out.println(MyMath2.multiply(a, b));
        System.out.println(MyMath2.divide(a, b));

        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}
