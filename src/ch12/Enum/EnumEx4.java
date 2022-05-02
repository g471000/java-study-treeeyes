package ch12.Enum;

abstract class MyEnum<T extends MyEnum<T>> implements Comparable<T> {
    static int id = 0;
    int ordinal;
    String name = "";

    public int ordinal() {
        return ordinal;
    }

    MyEnum(String name) {
        this.name = name;
        ordinal = id++;
    }

    public int compareTo(T t) {
        return ordinal - t.ordinal;
    }
}

abstract class MyTransportation extends MyEnum {

    static final MyTransportation BUS = new MyTransportation("BUS", 100) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    static final MyTransportation TRAIN = new MyTransportation("TRAIN", 100) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    static final MyTransportation SHIP = new MyTransportation("SHIP", 100) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    static final MyTransportation AIRPLANE = new MyTransportation("AIRPLAIN", 100) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    abstract int fare(int distance);

    protected final int BASIC_FARE;

    private MyTransportation(String name, int basicFare) {
        super(name);
        BASIC_FARE = basicFare;
    }

    public String name() {
        return name;
    }

    public String toString() {
        return name;
    }
}

public class EnumEx4 {
    public static void main(String[] args) {
        MyTransportation transportation1 = MyTransportation.BUS;
        MyTransportation transportation2 = MyTransportation.BUS;
        MyTransportation transportation3 = MyTransportation.TRAIN;
        MyTransportation transportation4 = MyTransportation.SHIP;
        MyTransportation transportation5 = MyTransportation.AIRPLANE;

        System.out.printf("t1 = %s, %d\n", transportation1.name(), transportation1.ordinal());
        System.out.printf("t2 = %s, %d\n", transportation2.name(), transportation2.ordinal());
        System.out.printf("t3 = %s, %d\n", transportation3.name(), transportation3.ordinal());
        System.out.printf("t4 = %s, %d\n", transportation4.name(), transportation4.ordinal());
        System.out.printf("t5 = %s, %d\n", transportation5.name(), transportation5.ordinal());

        System.out.println("t1 == t2 ? " + (transportation1 == transportation2));
        System.out.println("t1.compareTo(t3) ? " + (transportation1.compareTo(transportation3)));
    }
}
