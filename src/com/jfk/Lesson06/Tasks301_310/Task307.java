package com.jfk.Lesson06.Tasks301_310;

import com.jfk.Lesson06.ArrayGenerator;

public class Task307 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int k1 = i/100;
            int k2 = (i - k1*100) / 10;
            int k3 = i - k1*100 - k2*10;
            if (k1 + k2 + k3 == 9) {
                count++;
            }
        }
        int[] array = new int[count];
        int j = 0;
        for (int i = 100; i < 1000; i++) {
            int k1 = i/100;
            int k2 = (i - k1*100) / 10;
            int k3 = i - k1*100 - k2*10;
            if (k1 + k2 + k3 == 9) {
                array[j] = i;
                j++;
            }
        }
        System.out.println(count);
        ArrayGenerator.displayArray(array);
    }
}
