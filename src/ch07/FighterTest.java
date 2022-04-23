package ch07;

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit) {
            System.out.println("f is children of Unit.");
        }
        if (f instanceof Fightable) {
            System.out.println("f is children of Fightable.");
        }
        if (f instanceof Movable) {
            System.out.println("f is children of Movable.");
        }
        if (f instanceof Attackable) {
            System.out.println("f is children of Attackable.");
        }
        if (f instanceof Object) {
            System.out.println("f is children of Object.");
        }
    }
}
class Fighter extends Unit implements Fightable {
    Fighter() {
        super(100);
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void attack(Unit unit) {
        unit.currentHP -= (int) (Math.random() * 20) + 5;
    }
}

interface Fightable extends Movable, Attackable { }
interface Movable {
    void move(int x, int y);}

interface Attackable {
    void attack(Unit unit);
}