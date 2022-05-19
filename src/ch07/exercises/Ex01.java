package ch07.exercises;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("---Ex01---");
        SutdaDeck deck = new SutdaDeck();
        deck.printDeck();

        System.out.println("---Ex02---");
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();
        deck.printDeck();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        System.out.println();
    }
}

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && isOneThreeEight(num);

            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    public SutdaCard pick(int index) {
        if (index < 0 || index >= cards.length) {
            return null;
        }
        return cards[index];
    }

    public SutdaCard pick() {
        int index = getRandomIndex();
        return cards[index];
    }

    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int index = getRandomIndex();

            SutdaCard temp = cards[i];
            cards[i] = cards[index];
            cards[index] = temp;
        }
    }

    public void printDeck() {
        for (int i = 0; i < cards.length; i++) {
            System.out.print(cards[i] + ",");
        }
        System.out.println();
    }

    private int getRandomIndex() {
        return (int) (Math.random() * cards.length);
    }

    private boolean isOneThreeEight(int num) {
        return num == 1 || num == 3 || num == 8;
    }
}

class SutdaCard {
    final int NUMBER;
    final boolean IS_KWANG;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.NUMBER = num;
        this.IS_KWANG = isKwang;
    }

    public String toString() {
        return NUMBER + (IS_KWANG ? "K" : "");
    }
}
