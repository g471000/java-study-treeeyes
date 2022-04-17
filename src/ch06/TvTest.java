package ch06;

public class TvTest {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.channel = 7;
        tv.channelDown();
        System.out.println("Current channel is: " + tv.channel);
    }
}
