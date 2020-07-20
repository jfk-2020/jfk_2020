package com.jfk.lesson06.Tasks333_357;

import com.jfk.lesson06.ArrayGenerator;

public class Task348 {
    public static void main(String[] args) {
        int n = 20;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                s += i;
            }
        }
        System.out.println(s);
    }
}
