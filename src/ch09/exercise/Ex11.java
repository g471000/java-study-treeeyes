package ch09.exercise;

public class Ex11 {
    public static void main(String[] args) {
        int from = 0;
        int to = 0;

        try {
            if (args.length != 2) {
                throw new Exception("Please insert 2 integers.");
            }

            from = Integer.parseInt(args[0]);
            to = Integer.parseInt(args[1]);

            if (!(2 <= from && from <= 9 && 2 <= to && to <= 9)) {
                throw new Exception("Input should be between 2 and 9.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("USAGE: Ex11 num1 num2");
            System.exit(0);
        }

        if (from > to) {
            int temp = from;
            from = to;
            to = temp;
        }

        for (int i = from; i <= to; i++) {
            for (int j = 1; j < 9; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
            System.out.println();
        }
    }
}
