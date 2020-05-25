package Tasks_from_392_to_401;

import com.jfk.ArrayElementGenerator;

public class Task_392 {
    public static void main(String[] args) {

        int[] array = ArrayElementGenerator.generateAsRandom(10);
        System.out.println("Before reverse");
        ArrayElementGenerator.displayArray(array);

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = temp;
        }

        System.out.println("After reverse");
        ArrayElementGenerator.displayArray(array);

//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
    }
}
