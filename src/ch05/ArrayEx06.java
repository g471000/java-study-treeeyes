package ch05;

import java.util.Arrays;

public class ArrayEx06 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};
        System.out.println("score: " + Arrays.toString(score));

        int max = score[0];
        int min = score[0];

        for (int i = 0; i < score.length; i++) {
            max = Math.max(max, score[i]);
            min = Math.min(min, score[i]);
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
