package Tasks_from_281_to_290;

import com.jfk.ArrayElementGenerator;

public class Task_281 {
    public static void main(String[] args) {
        int[] x = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(x);

        int [] y;
        int counter = 0;

        for (int i = 0; i < x.length; i++) {
            if(x[i] > 0) {
                counter++;
            }
        }
        if (counter > 0) {
            y = new int[counter];
            int index = 0;
            for (int i = 0; i < x.length; i++) {
                if (x[i] > 0) {
                    y[index++] = x[i];
                }
            }
            ArrayElementGenerator.displayArray(y);
        }
    }
}
