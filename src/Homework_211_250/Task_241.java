package Homework_211_250;

import com.jfk.ArrayElementGenerator;

public class Task_241 {
    public static void main(String[] args) {
        int k = 3;
        int sum = 0;
        int[]ints = ArrayElementGenerator.generateAsRandom(12);
        ArrayElementGenerator.displayArray(ints);
        for (int i = 0; i < ints.length ; i++){
            if (ints[i] % k == 0){sum = sum + ints[i];}
        }
        System.out.println(sum);
    }
}
