package Homework_211_250;

import com.jfk.ArrayElementGenerator;

public class Task_249 {
    public static void main(String[] args) {
        int []ints = ArrayElementGenerator.generateAsRandom(12);
        ArrayElementGenerator.displayArray(ints);
        int k = 5;
        int count = 0;
        for (int i = 0; i < ints.length ; i++){
            if (ints[i] - i < -5 || ints[i]-i >5){count = count + 1;}
        }
        System.out.println(count);
    }
}
