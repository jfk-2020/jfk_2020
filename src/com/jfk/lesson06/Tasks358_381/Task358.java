package com.jfk.lesson06.Tasks358_381;

import com.jfk.lesson06.ArrayGenerator;

public class Task358 {
    public static void main(String[] args) {
        int n = 20;
        double[] nums = ArrayGenerator.generateAsRandomDouble(n);
        ArrayGenerator.displayArray(nums);
        double delta = 1;
        double num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            double d = Math.abs(nums[i] - (int)nums[i]);
            if (d < delta) {
                delta = d;
                num = nums[i];
            }
        }
        System.out.println(num);
        System.out.println(delta);
    }
}
