package com.jfk.Lesson06.Tasks333_357;

import com.jfk.Lesson06.ArrayGenerator;

public class Task351 {
    public static void main(String[] args) {
        int n = 20;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        int s = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > 0 && nums[i] > (Math.abs(nums[i - 1]) + Math.abs(nums[i + 1]))) {
                s += nums[i];
            }
        }
        System.out.println(s);
    }
}
