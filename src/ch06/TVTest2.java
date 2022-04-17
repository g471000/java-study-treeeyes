package ch06;

public class TVTest2 {
    public static void main(String[] args) {
        TV t1 = new TV();
        TV t2 = new TV();
        System.out.println("t1 channel is: " + t1.channel);
        System.out.println("t2 channel is: " + t2.channel);

        t1.channel = 7;
        System.out.println("t1 channel is not changed to " + t1.channel);

        System.out.println("t1 channel is: " + t1.channel);
        System.out.println("t2 channel is: " + t2.channel);
    }
}
