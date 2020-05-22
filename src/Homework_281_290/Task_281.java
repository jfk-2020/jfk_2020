package Homework_281_290;

import com.jfk.ArrayElementGenerator;

public class Task_281 {
    public static void main(String[] args) {
//        int []ints = ArrayElementGenerator.generateAsRandom(6);
//        ArrayElementGenerator.displayArray(ints);
        int[] ints = {2, 5, -5, 0, 4, 6, -8, 7};
        int[] y;
        int counter = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 0) {
                counter++;
            }

        }
        if (counter > 0) {
            y = new int[counter];
            int index = 0;
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] > 0) {
                    y[index++] = ints[i];
                }
            }
            ArrayElementGenerator.displayArray(y);
        }
    }
}
