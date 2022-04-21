package ch07;

public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = d.pick();
        System.out.println(c);

        d.shuffle();
        c = d.pick(0);
        System.out.println(c);
    }
}

class Deck {
    final int CARD_NUM = 52;
    Card cardArr[] = new Card[CARD_NUM];

    Deck() {
        int i = 0;

        for (int j = 0; j < Card.KIND_MAX; j++) {
            for (int k = 0; k < Card.NUM_MAX; k++) {
                cardArr[i++] = new Card(j, k + 1);
            }
        }
    }

    Card pick(int index) {
        return cardArr[index];
    }

    Card pick() {
        return pick(getRandomCardNumber());
    }

    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int r = getRandomCardNumber();

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }

    int getRandomCardNumber() {
        return (int) (Math.random() * CARD_NUM);
    }
}

class Card {
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
    String numbers = "0123456789XJQK";

    int kind;
    int number;

    Card() {
        this(SPADE, 1);
    }

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("kind : " + kinds[this.kind]);
        char number = numbers.charAt(this.number);
        sb.append(", number : ");
        sb.append(number == 'X' ? 10 : number);
        return sb.toString();
    }
}
