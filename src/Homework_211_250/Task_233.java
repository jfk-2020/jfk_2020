package Homework_211_250;

import com.jfk.ArrayElementGenerator;

public class Task_233 {
    public static void main(String[] args) {
        int [] ints = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(ints);
        int sum = 0;
        int mult = 1;

        for (int i = 0 ; i < ints.length ; i++ ){
            if (ints[i]%2==0){ sum = sum + ints[i] ; mult = mult * ints[i];}
        }
        System.out.println(sum);
        System.out.println(mult);
    }
}
