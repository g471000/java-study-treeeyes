package ch09;

public class CardToString {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card("HEART", 3);

        System.out.println(c1);
        System.out.println(c2);
    }
}

class Card {
    String kind;
    int number;

    Card() {
        this("Spade", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        return "kind: " + kind + ", number: " + number;
    }
}
