package Tasks_from_231_to_260;

import com.jfk.ArrayElementGenerator;

public class Task_244 {
    public static void main(String[] args) {
        int[] numbers = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(numbers);
        int multiple = 1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 == 2) {
                multiple = multiple * numbers[i];
            }
        }
        System.out.println("Total product of items: " + multiple);
    }
}
