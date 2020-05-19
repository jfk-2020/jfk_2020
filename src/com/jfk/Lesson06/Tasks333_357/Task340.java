package com.jfk.Lesson06.Tasks333_357;

import com.jfk.Lesson06.ArrayGenerator;

public class Task340 {
    public static void main(String[] args) {
        int n = 20;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 5 == 2) {
                if (min > nums[i]) {
                    min = nums[i];
                }
            }
        }
        if (min != Integer.MAX_VALUE) {
            System.out.println(min);
        }
    }
}
