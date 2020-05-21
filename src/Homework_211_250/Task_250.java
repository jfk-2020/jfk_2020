package Homework_211_250;

import com.jfk.ArrayElementGenerator;

public class Task_250 {
    public static void main(String[] args) {
        int []ints = ArrayElementGenerator.generateAsRandom(12);
        ArrayElementGenerator.displayArray(ints);
            double sum = 1;
            for (int i = 0 ; i < ints.length ; i++){
                if ((ints[i] * i )% 3 == 2){
                    sum = sum * Math.pow(ints[i] , 2);
                }
            }
        System.out.println(sum);
    }
}
