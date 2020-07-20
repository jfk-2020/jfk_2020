package com.jfk.lesson06.Tasks333_357;

import com.jfk.lesson06.ArrayGenerator;

public class Task343 {
    public static void main(String[] args) {
        int n = 20;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean isEqual = false;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] == -nums[j]) {
                    isEqual = true;
                }
            }
            if (isEqual && nums[i] > 0) {
                sum += nums[i];
                //System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
