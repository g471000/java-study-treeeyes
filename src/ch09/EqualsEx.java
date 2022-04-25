package ch09;

public class EqualsEx {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon(5);
        Pokemon p2 = new Pokemon(5);

        if (p1.equals(p2)) {
            System.out.println("p1 and p2 are same");
        } else {
            System.out.println("p1 and p2 are different");
        }
        p2.level = 3;
        if (p1.equals(p2)) {
            System.out.println("p1 and p2 are same");
        } else {
            System.out.println("p1 and p2 are different");
        }

        p2 = p1;
        if (p1.equals(p2)) {
            System.out.println("p1 and p2 are same");
        } else {
            System.out.println("p1 and p2 are different");
        }
    }
}

class Pokemon {
    int level;
    Pokemon(int level) {
        this.level = level;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Pokemon) {
            return level == ((Pokemon) obj).level;
        }
        return false;
    }
}
