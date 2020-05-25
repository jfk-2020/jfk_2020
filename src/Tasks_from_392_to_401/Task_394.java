package Tasks_from_392_to_401;

import com.jfk.ArrayElementGenerator;

public class Task_394 {
    public static void main(String[] args) {

        int[] array = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(array);

        int[] new_array = new int[array.length];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                new_array[counter] = array[i];
                counter++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                new_array[counter] = array[i];
                counter++;
            }
        }
        ArrayElementGenerator.displayArray(new_array);
    }
}
