package com.jfk.lesson06.Tasks333_357;

import com.jfk.lesson06.ArrayGenerator;

public class Task354 {
    public static void main(String[] args) {
        int n = 20;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            int x = nums[i] / 10;
            if (1 <= x && x <= 10) {
                sum += nums[i];
                count++;
            }
            x = nums[i] / 100;
            if (1 <= x && x <= 10) {
                sum += nums[i];
                count++;
            }
        }
        if (count == 0) {
            System.out.println(0);
        } else {
            System.out.println(sum / count);
        }
    }
}
