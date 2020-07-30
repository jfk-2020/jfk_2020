package Homework_211_250;

import com.jfk.ArrayElementGenerator;

public class Task_248 {
    public static void main(String[] args) {
        int []ints = ArrayElementGenerator.generateAsRandom(12);
        ArrayElementGenerator.displayArray(ints);
        int k  = 3 ;
        int sum = 0;
        for (int i = 0 ; i < ints.length ; i++){
         if (Math.pow(i,2) % k == 0 && Math.pow(ints[i],2) % k ==0 ){sum = sum + ints[i];};
        }
        System.out.println(sum);
    }
}
