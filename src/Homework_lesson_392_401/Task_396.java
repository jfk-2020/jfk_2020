package Homework_lesson_392_401;

import com.jfk.ArrayElementGenerator;

public class Task_396 {
    public static void main(String[] args) {

        int[] array = {1, 3, -2, 5, -6 , 6 , 8};
        int [] newarray = new int[array.length + 1];
        int x = 0;
        for (int i = 0 ; i < array.length ; i++){
            if (array[i] < 0){newarray[i]=array[i];newarray [i+1] = 0 ;x= i ; break;}
            else {newarray[i]=array[i];}
        }
        for (int i = x+1 ; i < array.length;i++){
            newarray[i+1] = array[i];

        }
        ArrayElementGenerator.displayArray(newarray);
        }
}
