package com.jfk.homework08;

public class Task_649 {
    public static void main(String[] args) {

        int firstZ = -1; //-1, as the first char also can be z
        int lastZ = -1; //

        char[] chars = new char[]{'k', 'b', 'z', 'a', 'c', 'd', 'c', 'f', 'z', 'f'};

        //check if the first z is found
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'z' && firstZ == -1) {
                firstZ = i;
            }
            //check if the last z is found
            if (chars[chars.length - 1 - i] == 'z' && lastZ == -1) {
                lastZ = chars.length - 1 - i;
            }

            //check if from beginning and from ending z is found
            if (firstZ != -1 && lastZ != -1) {
                break;
            }
        }

        if (firstZ == lastZ - 1) {
            System.out.println(0);
        } else {
            System.out.println(lastZ - firstZ - 1);
        }
    }
}