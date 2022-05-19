package ch07;

public class Ex17 {

}

abstract class Unit17 {
    int x, y;

    Unit17(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract void move(int x, int y);

    void stop() {

    }
}

class Marine17 extends Unit17 {
    Marine17(int x, int y) {
        super(x, y);
    }

    @Override
    void move(int x, int y) {

    }

    void stimPack() {

    }
}

class Tank17 extends Unit17 {
    Tank17(int x, int y) {
        super(x, y);
    }

    @Override
    void move(int x, int y) {

    }

    void changeMode() {

    }
}

class Dropship17 extends Unit17 {
    Dropship17(int x, int y) {
        super(x, y);
    }

    @Override
    void move(int x, int y) {

    }

    void load() {

    }

    void unload() {

    }
}


