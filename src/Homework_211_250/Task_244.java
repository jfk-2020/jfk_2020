package Homework_211_250;

import com.jfk.ArrayElementGenerator;

public class Task_244 {
    public static void main(String[] args) {
        int []ints = ArrayElementGenerator.generateAsRandom(12);
        ArrayElementGenerator.displayArray(ints);
        int n = 5;
        int sum = 1;
        for (int i = 0; i < ints.length; i++){
            if (ints[i] % n == 2 ){sum = sum * ints[i];}
        }
        System.out.println(sum);
    }
}
