package Homework_lesson_392_401;

import com.jfk.ArrayElementGenerator;

public class Task_392 {
    public static void main(String[] args){
        int[] array =ArrayElementGenerator.generateAsRandom(5);
        ArrayElementGenerator.displayArray(array);
        int temp = 0;
        for(int i = 0; i < array.length/2; i++){
            temp = array[array.length-1-i];
            array[array.length-1-i]= array[i];
            array[i]=temp;
        }

        ArrayElementGenerator.displayArray(array);
    }
}
