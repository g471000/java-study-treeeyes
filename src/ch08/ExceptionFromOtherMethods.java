package ch08;

public class ExceptionFromOtherMethods {
    public static void main(String[] args) throws Exception {
        method1();
        try {
            method3();
        } catch (Exception e) {
            System.out.println("Exception was handled in main.");
            e.printStackTrace();
        }
    }

    static void method1() throws Exception{
       method2();
    }

    static void method2() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Exception was handled in method2().");
            e.printStackTrace();
        }
    }

    static void method3() throws Exception {
        throw new Exception();
    }
}
