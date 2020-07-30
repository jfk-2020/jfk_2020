package Homework_211_250;

import com.jfk.ArrayElementGenerator;

public class Task_242 {
    public static void main(String[] args) {
        int m = 5;
        int sum = 1;
        int[]ints = ArrayElementGenerator.generateAsRandom(12);
        ArrayElementGenerator.displayArray(ints);
        for (int i = 0; i < ints.length ; i++){
            if (ints[i] % m == 0){sum = sum * ints[i];}
        }
        System.out.println(sum);

    }
}
