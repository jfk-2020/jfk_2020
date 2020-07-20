package com.jfk.lesson06.Tasks311_332;

import com.jfk.lesson06.ArrayGenerator;

public class Task326 {
    public static void main(String[] args) {
        int n = 20;
        int[] X = ArrayGenerator.generateAsRandom(n);
        ArrayGenerator.displayArray(X);
        int[] Y = X.clone();
        for(int i = 0; i < Y.length/2; i++){
            int temp = Y[i];
            Y[i] = Y[Y.length -i -1];
            Y[Y.length -i -1] = temp;
        }
        ArrayGenerator.displayArray(Y);
    }
}
