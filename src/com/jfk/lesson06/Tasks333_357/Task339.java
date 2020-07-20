package com.jfk.lesson06.Tasks333_357;

import com.jfk.lesson06.ArrayGenerator;

public class Task339 {
    public static void main(String[] args) {
        int n = 20;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 3 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
