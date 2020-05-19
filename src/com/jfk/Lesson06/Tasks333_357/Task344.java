package com.jfk.Lesson06.Tasks333_357;

import com.jfk.Lesson06.ArrayGenerator;

public class Task344 {
    public static void main(String[] args) {
        int n = 20;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean isEqual = false;
            int iEqual = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == 127) {
                    isEqual = true;
                    iEqual = j;
                    break;
                }
            }
            if (isEqual) {
                sum = nums[i] * nums[iEqual] / 2;
                break;
                //System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
