package ch09;

public class CardToString {
    public static void main(String[] args) throws Exception {
        Card c1 = new Card();
        Card c2 = new Card("HEART", 3);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println();
        Card c3 = Card.class.newInstance();
        Class cObj = c2.getClass();
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj);
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
