package com.jfk.lesson06.Tasks358_381;

import com.jfk.lesson06.ArrayGenerator;

public class Task370 {
    public static void main(String[] args) {
        int n = 90;
        int[] a = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(a);
        int[] threebls = new int[n/3];
        int k = 0;
        for (int i = 0; i < a.length - 2; i++){
            int element = a[i];
            if (ArrayGenerator.isExist(threebls, element)) {
                continue;
            }
            int count = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (element == a[j]) {
                    count++;
                }
            }
            if (count > 1) {
                threebls[k++] = element;
                System.out.println(element);
            }
        }
        int sum = 0;
        for (int i = 0; i < threebls.length; i++) {
            sum += threebls[i];
        }
        System.out.println(sum);
    }
}
