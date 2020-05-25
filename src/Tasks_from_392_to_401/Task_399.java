package Tasks_from_392_to_401;

import com.jfk.ArrayElementGenerator;

public class Task_399 {
    public static void main(String[] args) {

        int[] array = {5, 6, 6, 10, 11, 15, 69};
        ArrayElementGenerator.displayArray(array);
        int[] y = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] != array.length - 1){
                int z = 0;
                y[z] = array[i];
                System.out.println(y[z]);
            }
        }
    }
}
