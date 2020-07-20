package com.jfk.lesson06.Tasks333_357;

import com.jfk.lesson06.ArrayGenerator;

public class Task353 {
    public static void main(String[] args) {
        int n = 20;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        boolean t = true;
        for (int i = 0; i < nums.length / 2; i++) {
            if (nums[i] != nums[nums.length - 1 - i]) {
                t = false;
                break;
            }
        }
        if (t) {
            System.out.println(nums[ArrayGenerator.maxIdentifier(nums)]);
        } else {
            System.out.println("s=0");
        }
    }
}
