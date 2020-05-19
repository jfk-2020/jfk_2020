package com.jfk.Lesson06.Tasks333_357;

import com.jfk.Lesson06.ArrayGenerator;

public class Task345 {
    public static void main(String[] args) {
        int n = 20;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        int imax = ArrayGenerator.maxIdentifier(nums);
        if (imax == nums.length - 1) {
            System.out.println("s=0");
        } else {
            int sum = 0;
            for (int i = imax + 1; i < nums.length; i++) {
                sum += nums[i];
            }
            System.out.println(sum);
        }
    }
}
