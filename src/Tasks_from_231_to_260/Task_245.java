package Tasks_from_231_to_260;

import com.jfk.ArrayElementGenerator;

public class Task_245 {
    public static void main(String[] args) {
        int[] numbers = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(numbers);
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] + i) % 3 == 0) {
                sum =(int) (sum + Math.pow(numbers[i], 2));
            }
        }
        System.out.println("Total sum of items: " + sum);
    }
}
