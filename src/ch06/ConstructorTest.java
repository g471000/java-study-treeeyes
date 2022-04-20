package ch06;

class Data1 {
    int value;
}

class Data2 {
    int value;

    Data2() {
        this(0);
    }

    Data2(int x) {
        value = x;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        Data2 d2 = new Data2();
    }
}
