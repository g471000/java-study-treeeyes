package ch06;

class Car {
    String color;
    String gearType;
    int door;

    Car(){
        this("white", "auto", 4);
    }

    Car(String color) {
        this(color, "auto", 4);
    }

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }

    Car(Car c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
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

        Car c3 = new Car("blue");
        System.out.println("Car c3: " + c3.toString());

        Car c4 = new Car(c1);
        System.out.println("Car c4: " + c4.toString());
    }
}
