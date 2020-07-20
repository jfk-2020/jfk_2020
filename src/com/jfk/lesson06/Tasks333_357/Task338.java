package com.jfk.lesson06.Tasks333_357;

import com.jfk.lesson06.ArrayGenerator;

public class Task338 {
    public static void main(String[] args) {
        int n = 20;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        int max = nums[ArrayGenerator.maxIdentifier(nums)];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
