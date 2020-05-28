package Homework_646_660;

import com.jfk.ArrayElementGenerator;

public class Task_647 {
    public static void main(String[] args) {
        int n = 8;
        boolean t = false;
        char[]array = { 'a','g','k','r','g','g','a'};//ArrayElementGenerator.generateCharArray(n);
        System.out.println(array);
        for (int i =0; i <array.length / 2 ; i++ ){
            if (array[i]==array[array.length-i-1]){
                t=true;
            }else {t = false ;break;}
        }
        System.out.println(t);
    }
}
