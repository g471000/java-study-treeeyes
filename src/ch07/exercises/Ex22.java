package ch07.exercises;

public class Ex22 {
}

class Circle extends Shape {

    double radius;
    Circle(double radius) {
        this(new Point(0, 0), radius);
    }

    Circle(Point p, double radius) {
        super(p);
        this.radius = radius;
    }

    @Override
    double calArea() {
        return 2 * radius * Math.PI;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this(new Point(0, 0), width, height);
    }

    Rectangle(Point p, double width, double height) {
        super(p);
        this.width = width;
        this.height = height;
    }

    @Override
    double calArea() {
        return width * height;
    }

    boolean isSquare() {
        return width == height && width != 0;
    }
}

abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    abstract double calArea();

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }
}

class Point {
    int x, y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + "," + y + "]";
    }
}
