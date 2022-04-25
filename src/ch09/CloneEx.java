package ch09;

public class CloneEx {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = (Point) p1.clone();
        System.out.println(p1);
        System.out.println(p2);
    }
}

class Point implements Cloneable {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x = " + x + ", y = " + y;
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException cloneNotSupportedException) {
        }
        return obj;
    }
}
