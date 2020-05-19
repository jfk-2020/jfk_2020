package Tasks_from_231_to_260;

import com.jfk.ArrayElementGenerator;

public class Task_240 {
    public static void main(String[] args) {
        int[] numbers = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(numbers);
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 7 == 0) {
                count++;
            }
        }
        System.out.println("Total count of items: " + count);
    }
}
