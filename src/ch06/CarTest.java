package ch06;

class Car {
    String color;
    String gearType;
    int door;

    Car(){}

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }

    public String toString()  {
        return "color= " + color + ", gearType = " + gearType + ", door = " + door;
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;
        System.out.println("Car c1: " + c1.toString());

        Car c2 = new Car("black", "auto", 2);
        System.out.println("Car c2: " + c2.toString());
    }
}
