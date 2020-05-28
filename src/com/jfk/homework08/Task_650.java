package com.jfk.homework08;

public class Task_650 {
    public static void main(String[] args) {
        int n = 7;
        int count = 0;

        char[] charOne = {'a', 'b', 'c', 'x', 'e', 'f', 'g'};

        char[] charSecond = {'a', 'b', 'c', 'x', 'y', 'z', 'g'};

        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                if(charOne[i] == charSecond[k]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
