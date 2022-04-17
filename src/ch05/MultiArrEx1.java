package ch05;

import java.util.Scanner;

public class MultiArrEx1 {
    public static void main(String[] args) {
        final int SIZE = 9;
        int x = 0, y = 0;

        char[][] board = new char[SIZE][SIZE];
        byte[][] shipBoard = {
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {1, 1, 1, 1, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 1, 0}
        };

        for (int i = 0; i < SIZE; i++) {
            board[0][i] = board[i][0] = (char) (i + '0');
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("Insert Coordinate(Exit: 00). > ");
            String input = scanner.nextLine();

            if (input.length() == 2) {
                x = input.charAt(0) - '0';
                y = input.charAt(1) - '0';

                if (x == 0 && y == 0) {
                    break;
                }

                if (input.length() != 2 || x <= 0 || x > SIZE || y <= 0 || y > SIZE) {
                    System.out.println("Incorrect Input. Please insert again");
                    continue;
                }

                board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'O' : 'X';

                for (int i = 0; i < SIZE; i++) {
                    System.out.println(board[i]);
                }
                System.out.println();
            }
        }
    }
}
