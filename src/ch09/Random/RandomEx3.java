package ch09.Random;

import java.util.Arrays;

public class RandomEx3 {
    public static void main(String[] args) {
        int number = 10;
        for (int i = 0; i < number; i++) {
            System.out.print(getRand(5, 10) + ",");
        }
        System.out.println();

        int[] result = fillRand(new int[10], new int[]{2, 3, 7, 5});

        System.out.println(Arrays.toString(result));
    }

    public static int[] fillRand(int[] arr, int from, int to) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRand(from, to);
        }
        return arr;
    }

    public static int[] fillRand(int[] arr, int[] data) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = data[getRand(0, data.length - 1)];
        }
        return arr;
    }

    public static int getRand(int from, int to) {
        return (int) (Math.random() * (Math.abs(to - from) + 1)) + Math.min(from, to);
    }
}
