package com.jfk.homework08;

import com.jfk.ArrayElementGenerator;

public class Task_646 {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        char[] chars = ArrayElementGenerator.generateCharArray(n);
        System.out.println(chars);

        for(int i = 0; i < chars.length; i++){
           if(chars[i] == 'a'){
               count++;
           }
        }
        System.out.println(count);
    }

}
