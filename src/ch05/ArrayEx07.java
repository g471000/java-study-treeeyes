package ch05;

import java.util.Arrays;

public class ArrayEx07 {
    public static void main(String[] args) {
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }

        System.out.println("Before Shuffle: " + Arrays.toString(nums));

        for (int i = 0; i < 100; i++) {
            int n = (int) (Math.random() * 10);
            int tmp = nums[0];
            nums[0] = nums[n];
            nums[n] = tmp;
        }

        System.out.println("After Shuffle: " + Arrays.toString(nums));
    }
}
