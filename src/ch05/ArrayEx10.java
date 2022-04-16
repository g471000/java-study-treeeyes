package ch05;

import java.util.Arrays;

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10);
        }
        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println();

        for (int i = 0; i < nums.length - 1; i++) {
            boolean changed = false;

            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    changed = true;
                }
            }

            if (!changed) break;

            System.out.println("nums: " + Arrays.toString(nums));
        }
        System.out.println();
    }
}
