package com.jfk.Lesson06.Tasks333_357;

import com.jfk.Lesson06.ArrayGenerator;

public class Task334 {
    public static void main(String[] args) {
        int n = 20;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        int imax = ArrayGenerator.maxIdentifier(nums);
        System.out.println(imax);
        int sum = 0;
        if (imax > n / 2) {
            sum = 1;
        }
        for (int num : nums) {
            if (imax > n / 2) {
                if (num < 0) {
                    sum *= num;
                }
            } else {
                if (num > 0) {
                    sum += num;
                }
            }
        }
        System.out.println(sum);
    }
}
