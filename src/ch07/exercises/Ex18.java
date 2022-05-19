package ch07.exercises;

public class Ex18 {
    public static void main(String[] args) {
        Robot[] arr = {
                new DanceRobot(), new SingingRobot(), new DrawingRobot()
        };

        for (int i = 0; i < arr.length; i++) {
            action(arr[i]);
        }
    }

    public static void action(Robot robot) {
        if (robot instanceof DanceRobot) {
            DanceRobot dr = (DanceRobot) robot;
            dr.dance();
        } else if (robot instanceof SingingRobot) {
            SingingRobot sr = (SingingRobot) robot;
            sr.sing();
        } else if (robot instanceof DrawingRobot) {
            DrawingRobot drr = (DrawingRobot) robot;
            drr.draw();
        }
    }
}

class Robot {}

class DanceRobot extends Robot {
    void dance() {
        System.out.println("Dancing...");
    }
}

class SingingRobot extends Robot {
    void sing() {
        System.out.println("Singing...");
    }
}

class DrawingRobot extends Robot {
    void draw() {
        System.out.println("Drawing...");
    }
}
