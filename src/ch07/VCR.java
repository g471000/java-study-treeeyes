package ch07;

public class VCR {
    boolean power;
    int counter = 0;

    void power() {
        power = !power;
    }

    void play() {
        System.out.println("Play!");
    }

    void stop() {
        System.out.println("Stop!");
    }
}
