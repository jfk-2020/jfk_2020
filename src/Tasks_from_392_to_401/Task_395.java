package Tasks_from_392_to_401;

import com.jfk.ArrayElementGenerator;

public class Task_395 {
    public static void main(String[] args) {
        int[] array = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(array);

        boolean x = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                x = true;
            }
            if (x && i + 1 < array.length) {
                array[i] = array[i + 1];
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }
}
