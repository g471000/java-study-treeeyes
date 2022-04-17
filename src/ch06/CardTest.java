package ch06;

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.with = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Space";
        c2.number = 4;

        System.out.println("c1 is " + c1.kind + ", " + c1.number + ", and the size is " + Card.width + " * " + Card.height);
        System.out.println("c2 is " + c2.kind + ", " + c2.number + ", and the size is " + Card.width + " * " + Card.height);

        System.out.println("Changing size of the card....");
        Card.width = 50;
        Card.height = 80;
        System.out.println("c1 is " + c1.kind + ", " + c1.number + ", and the size is " + Card.width + " * " + Card.height);
        System.out.println("c2 is " + c2.kind + ", " + c2.number + ", and the size is " + Card.width + " * " + Card.height);
    }
}
