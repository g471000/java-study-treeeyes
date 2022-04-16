package ch05;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int[] counter = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10);
        }
        System.out.println("Numbers: " + Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            counter[nums[i]]++;
        }

        for (int i = 0; i < counter.length; i++) {
            System.out.printf("number of %d: %d\n", i, counter[i]);
        }
    }
}
