package ch08;

public class ExceptionArithmetic {
    public static void main(String[] args) {
        int number = 100;
        int len = 10;
        int rand, result;

        for (int i = 0; i < len; i++) {
            rand = (int) (Math.random() * 10);
            try {
                result = number / rand;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception! Random number was " + rand);
            }

        }
    }
}
