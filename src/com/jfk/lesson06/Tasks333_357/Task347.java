package com.jfk.lesson06.Tasks333_357;

import com.jfk.lesson06.ArrayGenerator;

public class Task347 {
    public static void main(String[] args) {
        int n = 20;
        int b = 0;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        int s = 0;
        int index = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < b) {
                s += nums[i];
                index *= i;
            }
        }
        System.out.println(s);
        System.out.println(index);
    }
}
