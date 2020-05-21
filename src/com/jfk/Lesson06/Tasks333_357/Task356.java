package com.jfk.Lesson06.Tasks333_357;

import com.jfk.Lesson03.Task051;
import com.jfk.Lesson06.ArrayGenerator;

public class Task356 {
    public static void main(String[] args) {
        int n = 20;
        int k = 3;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        int count = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            if (Math.pow(2, k) < nums[i] && nums[i] < Math.pow(2, k+1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
