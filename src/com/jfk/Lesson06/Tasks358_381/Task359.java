package com.jfk.Lesson06.Tasks358_381;

import com.jfk.Lesson06.ArrayGenerator;

import java.util.Arrays;
import java.util.Collections;

public class Task359 {
    public static void main(String[] args) {
        int n = 20;
        double[] nums = ArrayGenerator.generateAsRandomDouble(n);
        Arrays.sort(nums);
        ArrayGenerator.displayArrayDouble(nums);
        int x = 57;
        boolean isHave = false;
        for (int k = 1; k < nums.length; k++) {
            if (nums[k - 1] < x && x < nums[k]) {
                System.out.println(k);
                isHave = true;
                break;
            }
        }
        if (!isHave) {
            System.out.println("NO");
        }
    }
}
