package Homework_646_660;

import com.jfk.ArrayElementGenerator;

public class Task_648 {
    public static void main(String[] args) {
        int n = 7;
        char []array = { 'a','g','x','o','o','g','o'}; //ArrayElementGenerator.generateCharArray(n);
        int count = 0;
        int xPlace = 0;
        for (int i = 0 ; i < array.length ; i++){xPlace++;
            if (array [i] == 'x'){break;}
        }
        for (int i = xPlace ; i< array.length ; i++){
            if (array[i] == 'o'){count ++;}
        }
        System.out.println(count);
    }
}
