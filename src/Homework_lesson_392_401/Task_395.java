package Homework_lesson_392_401;

import com.jfk.ArrayElementGenerator;

public class Task_395 {
    public static void main(String[] args) {
        int[] array = {-2, 5,5, -7, 1,6, 5};//ArrayElementGenerator.generateAsRandom(5);
        ArrayElementGenerator.displayArray(array);
        int count = 0;
        int[] newArray;
        boolean x = false;
        newArray = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                x = true;

                break;
            } else {
                newArray[i] = array[i];
            } count++;
        }
        if (x = true) {
            for (int i = count; i < array.length - 1; i++) {
                newArray[count] = array[count + 1];
                count++;
            }
        }

        ArrayElementGenerator.displayArray(newArray);
    }
}
