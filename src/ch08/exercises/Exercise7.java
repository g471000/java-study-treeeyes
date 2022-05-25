package ch08.exercises;

public class Exercise7 {
    public static void main(String[] args) {
        method(true);
        // 1
        // exit
        method(false);
    }

    static void method(boolean b) {
        try {
            System.out.println(1);
            if (b) System.exit(0);
            System.out.println(2);
        } catch (RuntimeException e) {
            System.out.println(3);
            return;
        } catch (Exception e) {
            System.out.println(4);
            return;
        } finally {
            System.out.println(5);
        }
        System.out.println(6);
    }
}
