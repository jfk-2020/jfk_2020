package Homework_211_250;

import com.jfk.ArrayElementGenerator;

public class Task_247 {
    public static void main(String[] args) {
        int []ints = ArrayElementGenerator.generateAsRandom(12);
        ArrayElementGenerator.displayArray(ints);
        double sum = 0;
        for (int i = 0 ; i < ints.length ; i++){
            if (ints[i]<i){
                sum = sum + Math.pow(ints[i],2);
            }
        }
        System.out.println((double)Math.sqrt(sum));
    }
}
