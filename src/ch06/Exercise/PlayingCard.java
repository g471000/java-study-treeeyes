package ch06.Exercise;

/**
 * Class (static) variables: width, height
 * Instance variables: kind, num
 * Local variables: k, n, card
 */
public class PlayingCard {
    int kind;
    int num;

    static int width;
    static int height;

    PlayingCard(int k, int n) {
        this.kind = k;
        this.num = n;
    }

    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(1, 1);
    }
}

