package Tasks_from_231_to_260;

import com.jfk.ArrayElementGenerator;

public class Task_236 {
    public static void main(String[] args) {
        int[] numbers = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(numbers);
        int count = 0;
        int multiple = 1;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 != 0) {
                multiple = multiple * numbers[i];
                count++;
            }
        }
        System.out.println("Multiple: " + multiple);
        System.out.println("Count of items: " + count);
    }
}
