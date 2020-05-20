package Homework_211_250;

import com.jfk.ArrayElementGenerator;

public class Task_240 {
    public static void main(String[] args) {
        int[]ints = ArrayElementGenerator.generateAsRandom(12);
        ArrayElementGenerator.displayArray(ints);
        int sum = 0;


        for (int i = 0 ; i < ints.length ; i++ ){
            if (ints [i] % 7 == 0){sum = sum + 1;}

        }
        System.out.println(sum);
    }
}
