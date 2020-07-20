package com.jfk.lesson06.Tasks333_357;

import com.jfk.lesson06.ArrayGenerator;

public class Task350 {
    public static void main(String[] args) {
        int n = 20;
        int b = 0;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        int s = 0;
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < b) {
                s += nums[i] * nums[i];
                count++;
            }
            if (count == 5) {
                break;
            }
        }
        if (count == 0) {
            System.out.println(0);
        } else {
            System.out.println(s/count);
        }
    }
}
