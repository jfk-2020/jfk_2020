package Homework_211_250;

import com.jfk.ArrayElementGenerator;

public class Task_246 {
    public static void main(String[] args) {
        int ints[]= ArrayElementGenerator.generateAsRandom(12);
        ArrayElementGenerator.displayArray(ints);
        int n = 0;
        int sum = 0 ;
        int count = 0;
        for (int i  = 0 ; i < ints.length ; i++){
        if (Math.sqrt(i) % 1 ==0){sum = sum + ints[i];count = count + 1;}
        }
        System.out.println((double)sum/count);
    }
}
