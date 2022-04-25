package ch09;

public class HashCodeEx {
    public static void main(String[] args) {
        String s1 = new String("Pokemon");
        String s2 = new String("Pokemon");

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
    }
}
