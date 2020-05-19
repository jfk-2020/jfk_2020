package com.jfk.Lesson06.Tasks333_357;

import com.jfk.Lesson06.ArrayGenerator;

public class Task333 {
    public static void main(String[] args) {
        int n = 20;
        int k = -90;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        int i1 = 0;
        int i2 = 0;
        for (int i = 1; i < nums.length - 2; i++) {
            for (int j = nums.length - 1; j > i + 2; j--) {
                //System.out.println("i = " + i + "; j = " + j);
                if (nums[i] + nums[j] < k) {
                    i1 = i;
                    i2 = j;
                    break;
                }
            }
            if (i1 != 0) {
                break;
            }
        }
        int sum = 0;
        if (i1 != 0) {
            for (int i = i1; i <= i2; i++) {
                sum += nums[i];
            }
        }
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(sum);
    }
}
