package ch06;

public class OverloadingTest {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println(mm.add(3, 3));
        System.out.println(mm.add(3L, 3));
        System.out.println(mm.add(3, 3L));
        System.out.println(mm.add(3L, 3L));
        System.out.println(mm.add(new int[]{100, 200, 300}));
    }
}
