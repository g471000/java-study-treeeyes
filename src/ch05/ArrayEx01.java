package ch05;

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] score = new int[5];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k + 1] = 70;
        score[3] = 80;
        score[4] = 90;

        int tmp = score[k + 2] + score[4];

        for (int i = 0; i < 5; i++) {
            System.out.printf("score[%d]: %d\n", i, score[i]);
        }
        System.out.printf("score[%d] + score[%d] = %d\n", k + 2, k + 4, tmp);
    }
}
