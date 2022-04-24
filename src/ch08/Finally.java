package ch08;

public class Finally {
    public static void main(String[] args) {
       method1();
        System.out.println("Completed method1() then came back to main.");
    }

    static void method1() {
        try {
            System.out.println("method1() called.");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1() finally block is run.");
        }
    }
}
