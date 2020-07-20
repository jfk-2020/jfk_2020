package com.jfk.lesson06.Tasks333_357;

import com.jfk.lesson06.ArrayGenerator;

public class Task352 {
    public static void main(String[] args) {
        int n = 20;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        int y = 0;
        boolean isNegative = false;
        int s = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < 0) {
                isNegative = true;
                break;
            }
            s *= nums[i];
            y += s;
        }
        if (isNegative) {
            System.out.println(y);
        } else {
            System.out.println("Y=0");
        }
    }
}
