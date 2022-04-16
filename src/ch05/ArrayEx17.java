package ch05;

public class ArrayEx17 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("usage: java ArrayEx17 NUM1 OP NUM2");
            System.exit(0);
        }

        int num1 = Integer.parseInt(args[0]);
        char op = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Not supported Operator");
        }

        System.out.printf("%d %c %d = %d", num1, op, num2, result);
    }
}
