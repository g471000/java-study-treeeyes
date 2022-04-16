package ch05;

public class ArrayEx16 {
    public static void main(String[] args) {
        System.out.println("number of arguments: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.printf("args[%d]: \"%s\"\n", i, args[i]);
        }
    }
}
