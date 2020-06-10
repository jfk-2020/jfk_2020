package com.jfk.homework09.resourceExercises;

public class Exercise_01 {

    public static void main(String[] args) {
        int n = 50;

        recursNum(0, n);
    }

    public static void recursNum(int start, int n) {
        System.out.println(start);
        if (start == n) {
            return;
        } else {
            recursNum(++start, n);
        }
    }
}


