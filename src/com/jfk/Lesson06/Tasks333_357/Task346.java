package com.jfk.Lesson06.Tasks333_357;

import com.jfk.Lesson06.ArrayGenerator;

public class Task346 {
    public static void main(String[] args) {
        int n = 20;
        int[] nums = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(nums);
        int min = nums[ArrayGenerator.minIdentifier(nums)];
        int s = 0;
        boolean canAdd = false;
        int minID = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (canAdd) {
                s += nums[i];
            }
            if (!canAdd && min == nums[i]) {
                minID = i;
                canAdd = true;
            }
        }
        if (minID == 0) {
            System.out.println("s=0");
        }else {
            System.out.println(s);
        }
    }
}
