package Homework_211_250;

import com.jfk.ArrayElementGenerator;

public class Task_232 {
    public static void main(String[] args) {
        int [] ints = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(ints);
        int count = 0;

        for (int i = 0 ; i < ints.length ; i++ ){
            if (ints[i]%2==0){count = count +1;}
        }
        System.out.println(count);
    }
}
