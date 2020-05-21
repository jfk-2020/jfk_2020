package Homework_211_250;

import com.jfk.ArrayElementGenerator;

public class Task_245 {
    public static void main(String[] args) {
        int[] ints = ArrayElementGenerator.generateAsRandom(12);
        ArrayElementGenerator.displayArray(ints);
        int n = 0;
        int sum = 0;
        int sumIndex = 0;
        for (int i = 0; i < ints.length; i++) {
            if (i % 3 == 0 && ints[i] % 3 == 0){
                sum = sum + ints[i];
            }
        }
        System.out.println( sum );
    }
}
