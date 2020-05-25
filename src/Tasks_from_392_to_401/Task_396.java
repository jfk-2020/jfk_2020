package Tasks_from_392_to_401;

import com.jfk.ArrayElementGenerator;

public class Task_396 {

    public static void main(String[] args) {
        int[] x = ArrayElementGenerator.generateAsRandom(10);
        ArrayElementGenerator.displayArray(x);

        boolean isNegative = false;
        boolean isZeroAdded = false;

        int[] y = new int[x.length + 1];
        int z = 0;

        for (int i = 0; i < x.length; i++, z++) {
            if (x[i] < 0) {
                isNegative = true;
            }
            y[z] = x[i];
            if (isNegative && !isZeroAdded) {
                z++;
                y[z] = 0;
                isZeroAdded = true;
            }
        }
        ArrayElementGenerator.displayArray(y);
    }
}
