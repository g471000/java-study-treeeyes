package ch06;

public class TVTest3 {
    public static void main(String[] args) {
        TV tv1 = new TV();
        TV tv2 = new TV();

        System.out.println("tv1 channel is " + tv1.channel);
        System.out.println("tv2 channel is " + tv2.channel);

        tv2 = tv1;
        tv2.channel = 7;
        System.out.println("changed tv2's channel as " + tv2.channel);

        System.out.println("tv1 channel is " + tv1.channel);
        System.out.println("tv2 channel is " + tv2.channel);
    }
}
