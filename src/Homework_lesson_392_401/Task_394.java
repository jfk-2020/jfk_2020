package Homework_lesson_392_401;

import com.jfk.ArrayElementGenerator;

public class Task_394 {
    public static void main(String[] args) {
        int []array = ArrayElementGenerator.generateAsRandom(5);
        ArrayElementGenerator.displayArray(array);

 int count =0;
 int [] newarray = new int[array.length];
 for (int i=0 ; i< array.length ; i++){
     if (array[i] % 2 != 0 ){newarray[count] = array[i]; count ++;}
 }
 for (int k = 0; k< array.length ; k++){
     if (array[k] % 2 == 0){newarray[count] = array[k]; count ++;}
 }

ArrayElementGenerator.displayArray(newarray);

    }
}
