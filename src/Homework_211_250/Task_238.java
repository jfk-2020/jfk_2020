package Homework_211_250;

import com.jfk.ArrayElementGenerator;

public class Task_238 {
    public static void main(String[] args) {
        int [] ints =  ArrayElementGenerator.generateAsRandom(12);
        ArrayElementGenerator.displayArray(ints);
        int sum = 0;
        int count = 0;

        for (int i = 3 ; i < ints.length ; i+=3 ){
             sum = sum + ints[i] ;
             count = count + 1;
        }
        System.out.println((double)sum /count);

    }
}
