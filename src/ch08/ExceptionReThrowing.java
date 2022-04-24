package ch08;

public class ExceptionReThrowing {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Exception was handled in main");
        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Exception was handled in method1()");
            throw e;
        }
    }
}
