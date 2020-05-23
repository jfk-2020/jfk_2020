package Homework_281_290;

import com.jfk.ArrayElementGenerator;

public class Task_287 {
    public static void main(String[] args) {
        int[] ints = {2, 5, -5, 0, 4, 6, -8, 7};
        int []y ;
        int counter  = 0 ;
        for (int i =0 ; i < ints.length ; i++){
            if (ints[i]!= i){
                counter++;
            }
        }
        if (counter > 0){
            y = new  int[counter];
            int index = 0;
            for (int i = 0 ; i < ints.length ; i++){
                if (ints[i]!=i){
                    y[index++]=ints[i];
                }
            }
            ArrayElementGenerator.displayArray(y);
        }

    }
}
