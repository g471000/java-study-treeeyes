package ch08.exercises;

public class Exercise5 {
    public static void main(String[] args) {
        method(true);
        // 1
        // 3
        // 5
        method(false);
        // 1
        // 5
        // 6
    }

    static void method(boolean b) {
        try {
            System.out.println(1);
            if (b) throw new ArithmeticException();
        } catch (RuntimeException runtimeException) {
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
