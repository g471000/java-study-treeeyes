package ch08;

public class ExceptionWithThrow {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Program Successfully Exited.");
    }
}
