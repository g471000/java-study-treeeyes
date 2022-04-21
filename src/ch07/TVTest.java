package ch07;

public class TVTest {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.channel = 7;
        tv.channelDown();
        System.out.println("Current channel is: " + tv.channel);
    }
}
