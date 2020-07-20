package com.jfk.lesson06.Tasks333_357;

import com.jfk.lesson06.ArrayGenerator;

public class Task335 {
    public static void main(String[] args) {
        int n = 20;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        int j = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length - 1; i++) {
            if (max < nums[i - 1] + nums[i + 1]) {
                max = nums[i - 1] + nums[i + 1];
                j = i;
            }
        }
        System.out.println(j);
        if (j != 0) {
            System.out.println(nums[j]);
        }
    }
}
