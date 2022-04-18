package ch06;

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);
        System.out.println();

        change(d.x);
        System.out.println("After call change():");
        System.out.println("main() : x = " + d.x);
        System.out.println();

        changeData(d);
        System.out.println("After call changeData():");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x) {
        x = 1000;
        System.out.println("change(): x = " + x);
    }

    static void changeData(Data d) {
        d.x = 1000;
        System.out.println("changeData(): x = " + d.x);
    }
}

class Data {
    int x;
}
