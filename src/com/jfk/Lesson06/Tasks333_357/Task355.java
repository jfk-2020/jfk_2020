package com.jfk.Lesson06.Tasks333_357;

import com.jfk.Lesson03.Task051;
import com.jfk.Lesson06.ArrayGenerator;

public class Task355 {
    public static void main(String[] args) {
        int n = 20;
        int k = 9;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        for (int i = 0; i < nums.length / 2; i++) {
            int[] x = Task051.getNumbers(Math.abs(nums[i]));
            int sum = 0;
            for (int xx: x) {
                sum += xx;
            }
            if (k == sum) {
                System.out.println(nums[i]);
            }
        }
    }
}
