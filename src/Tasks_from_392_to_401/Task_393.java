package Tasks_from_392_to_401;

import com.jfk.ArrayElementGenerator;

public class Task_393 {
    public static void main(String[] args) {

        int[] array = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(array);

        int counter = 0;
        int maxCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                counter++;
            } else if(maxCount <= counter){
                maxCount = counter;
                counter = 0;
            }
        }
        System.out.println(maxCount);
    }
}
