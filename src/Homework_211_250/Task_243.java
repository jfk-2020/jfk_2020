package Homework_211_250;

import com.jfk.ArrayElementGenerator;

public class Task_243 {
    public static void main(String[] args) {
        int t= 3;
        int count = 0;
        int[]ints = ArrayElementGenerator.generateAsRandom(12);
        ArrayElementGenerator.displayArray(ints);
        for (int i = 0; i < ints.length ; i++){
            if (ints[i] % t == 0){count = count +1;}
        }
        System.out.println(count);

    }
}
