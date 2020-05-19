package Tasks_from_231_to_260;

import com.jfk.ArrayElementGenerator;

public class Task_250 {
    public static void main(String[] args) {
        int[] numbers = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(numbers);

        int product = 1;

        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] * i) % 3 == 2) {
                product *= Math.pow(numbers[i], 2);
            }
        }
        System.out.println(product);
    }
}
