package com.jfk.lesson06.Tasks333_357;

import com.jfk.lesson06.ArrayGenerator;

public class Task337 {
    public static void main(String[] args) {
        int n = 20;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        int addition = 0;
        int multiplication = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                multiplication *= nums[i];
            } else {
                addition += nums[i];
            }
        }
        if (multiplication > 0) {
            System.out.println(addition);
        } else {
            System.out.println("s=1");
        }
    }
}
