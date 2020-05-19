package com.jfk.Lesson06.Tasks333_357;

import com.jfk.Lesson06.ArrayGenerator;

public class Task336 {
    public static void main(String[] args) {
        int n = 20;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        boolean isNegative = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                System.out.println(nums[ArrayGenerator.maxIdentifier(nums)]);
                isNegative = true;
                break;
            }
        }
        if (!isNegative) {
            System.out.println("s=0");
        }
    }
}
